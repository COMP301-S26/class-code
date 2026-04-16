package edu.unc.comp301.mvc2048.view;

import edu.unc.comp301.mvc2048.model.Model;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class ScoreBoardView implements FXComponent{
   private final Model model;

    public ScoreBoardView(Model model){
        this.model = model;
    }

    @Override
    public Parent render() {
        Pane scoreboard = new HBox();
        scoreboard.getStyleClass().add("scoreboard");
        
        Pane logoContainer = new HBox();
        Label logo = new Label("2048");
        logo.getStyleClass().add("logo");
        HBox.setHgrow(logoContainer, Priority.ALWAYS);
        logoContainer.getChildren().add(logo);

        scoreboard.getChildren().add(logoContainer);

        Pane score = new VBox();
        score.getStyleClass().add("score");
        Label scoreLabel = new Label("SCORE");
        scoreLabel.getStyleClass().add("score-label");
        score.getChildren().add(scoreLabel);

        Label scoreValue = new Label("" + model.getScore());
        scoreValue.getStyleClass().add("score-value");
        score.getChildren().add(scoreValue);

        scoreboard.getChildren().add(score);


        Pane best = new VBox();
        best.getStyleClass().add("score");
        Label highScoreLabel = new Label("BEST");
        highScoreLabel.getStyleClass().add("score-label");
        best.getChildren().add(highScoreLabel);

        Label highScoreValue = new Label("" + model.getBest());
        highScoreValue.getStyleClass().add("score-value");
        best.getChildren().add(highScoreValue);
        scoreboard.getChildren().add(best);





        return scoreboard;
    }
}
