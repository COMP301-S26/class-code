package edu.unc.comp301.mvc2048.model;

import edu.unc.comp301.mvc2048.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ModelImpl implements Model{
    private List<Observer> observers = new ArrayList<>();
    private int[][] board = new int[4][4];
    private int score = 0;
    private int best = 0;
    private final Random rng = new Random();


    public ModelImpl(){
        reset();
    }

    public int getScore(){
        return score;
    }

    public int getBest(){
        return best;
    }

    public int getTile(int row, int col){
        return board[row][col];
    }

    public boolean isGameOver(){
        for(int i=0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    //TODO:  Finish this one in class.
    public void reset() {
       board = new int[4][4];
        for(int i=0; i<board.length;i++){
            for(int j=0;j<board[i].length; j++){
                board[i][j] = 0;
            }
        }


       score = 0;
       best = 0;

       addRandomTile();
    }
    @Override
    public void swipeLeft() {
        boolean moved = false;

        for (int row = 0; row < 4; row++) {
            int[] original = Arrays.copyOf(board[row], 4);
            int[] merged = mergeLine(original);
            board[row] = merged;

            if (!Arrays.equals(original, merged)) {
                moved = true;
            }
        }

        if (moved) {
            addRandomTile();
            notifyObservers();
        }
    }

    @Override
    public void swipeRight() {
        boolean moved = false;

        for (int row = 0; row < 4; row++) {
            int[] line = new int[4];
            for (int col = 0; col < 4; col++) {
                line[col] = board[row][3 - col];
            }

            int[] original = Arrays.copyOf(line, 4);
            int[] merged = mergeLine(line);

            for (int col = 0; col < 4; col++) {
                board[row][3 - col] = merged[col];
            }

            int[] beforeRow = new int[4];
            for (int col = 0; col < 4; col++) {
                beforeRow[col] = original[3 - col];
            }
            int[] afterRow = board[row];

            if (!Arrays.equals(beforeRow, afterRow)) {
                moved = true;
            }
        }

        if (moved) {
            addRandomTile();
            notifyObservers();
        }
    }

    @Override
    public void swipeUp() {
        System.out.println("Model up");

        boolean moved = false;

        for (int col = 0; col < 4; col++) {
            int[] line = new int[4];
            for (int row = 0; row < 4; row++) {
                line[row] = board[row][col];
            }

            int[] original = Arrays.copyOf(line, 4);
            int[] merged = mergeLine(line);

            for (int row = 0; row < 4; row++) {
                board[row][col] = merged[row];
            }

            if (!Arrays.equals(original, merged)) {
                moved = true;
            }
        }

        if (moved) {
            addRandomTile();
            notifyObservers();
        }
    }

    @Override
    public void swipeDown() {
        System.out.println("Model down");

        boolean moved = false;

        for (int col = 0; col < 4; col++) {
            int[] line = new int[4];
            for (int row = 0; row < 4; row++) {
                line[row] = board[3 - row][col];
            }

            int[] original = Arrays.copyOf(line, 4);
            int[] merged = mergeLine(line);

            for (int row = 0; row < 4; row++) {
                board[3 - row][col] = merged[row];
            }

            int[] beforeCol = new int[4];
            for (int row = 0; row < 4; row++) {
                beforeCol[row] = original[3 - row];
            }
            int[] afterCol = new int[4];
            for (int row = 0; row < 4; row++) {
                afterCol[row] = board[row][col];
            }

            if (!Arrays.equals(beforeCol, afterCol)) {
                moved = true;
            }
        }

        if (moved) {
            addRandomTile();
            notifyObservers();
        }
    }

    private int[] mergeLine(int[] line) {
        int[] vals = new int[4];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            if (line[i] != 0) {
                vals[k++] = line[i];
            }
        }

        int[] result = new int[4];
        int idx = 0;
        int i = 0;

        while (i < k) {
            if (i + 1 < k && vals[i] == vals[i + 1]) {
                int mergedValue = vals[i] * 2;
                result[idx++] = mergedValue;

                score += mergedValue;
                if (score > best) {
                    best = score;
                }

                i += 2;
            } else {
                result[idx++] = vals[i];
                i++;
            }
        }
        return result;
    }

    private void addRandomTile() {
        List<int[]> empty = new ArrayList<>();
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (board[row][col] == 0) {
                    empty.add(new int[]{row, col});
                }
            }
        }
        if (empty.isEmpty()) {
            return;
        }

        int[] pos = empty.get(rng.nextInt(empty.size()));
        int value = rng.nextDouble() < 0.9 ? 2 : 4;
        board[pos[0]][pos[1]] = value;
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

}
