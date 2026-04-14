
package edu.unc.comp301.mvc2048.model;

import edu.unc.comp301.mvc2048.Observer;
import edu.unc.comp301.mvc2048.Subject;

import java.util.ArrayList;
import java.util.List;

public class Model implements Subject, ModelInterface  {
    private List<Observer> observers = new ArrayList<>();
    private int dimensions = 4;
    private int[][] board = new int[dimensions][dimensions];
    private int score = 0;
    private int best = 0;

    public Model(){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[j].length; j++){
                board[i][j] = 0;
            }
        }
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
        for(int i=0;i<dimensions; i++){
            for(int j=0;j<dimensions; j++){
                if(board[i][j] == 0){
                    return false;
                }
            }
        }

        return true;
    }

    public void swipeLeft(){}

    public void swipeRight(){

    }
    public void swipeUp(){}

    public void swipeDown(){}

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
