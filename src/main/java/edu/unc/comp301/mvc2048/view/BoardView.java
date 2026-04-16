package edu.unc.comp301.mvc2048.view;

import edu.unc.comp301.mvc2048.model.Model;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class BoardView implements FXComponent{
    private final Model model;

    public BoardView(Model model){
        this.model = model;
    }


    @Override
    public Parent render() {
        GridPane board = new GridPane();
        board.getStyleClass().add("board");

        for(int i=0; i<4; i++){
            for(int j=0; j<4;j++){
                board.add(makeTile(model.getTile(i,j)), j, i);
            }
        }

        return board;
    }

    private Label makeTile(int num){
        Label tile;
        if(num == 0){
            tile = new Label();
        } else {
            tile = new Label("" + num);
        }

        tile.getStyleClass().add("tile");
        tile.getStyleClass().add("tile-" + num);

        return tile;

    }



}
