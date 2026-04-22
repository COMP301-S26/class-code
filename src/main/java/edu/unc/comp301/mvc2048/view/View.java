package edu.unc.comp301.mvc2048.view;

import edu.unc.comp301.composition.interfaces.B;
import edu.unc.comp301.mvc2048.Observer;
import edu.unc.comp301.mvc2048.model.Model;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View implements FXComponent, Observer {
    private final Model model;
    private final Stage stage;

    public View(Stage stage, Model model){
        this.model = model;
        this.stage = stage;
        model.addObserver(this);
    }

    @Override
    public Parent render() {
        Pane layout = new VBox();
        layout.getStyleClass().add("layout");

        ScoreBoardView scoreBoardView = new ScoreBoardView(model);
        layout.getChildren().add(scoreBoardView.render());
        InstructionsView instructionsView = new InstructionsView();
        layout.getChildren().add(instructionsView.render());

        BoardView boardView = new BoardView(model);
        layout.getChildren().add(boardView.render());

        return layout;
    }

    @Override
    public void update() {
        Parent root = render();
        stage.getScene().setRoot(root);
    }
}
