package edu.unc.comp301.mvc2048.view;

import edu.unc.comp301.mvc2048.Observer;
import edu.unc.comp301.mvc2048.model.Model;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View implements FXComponent, Observer {
    private final Model model;
    private final Stage stage;

    public View(Stage stage, Model model){
        this.stage = stage;
        this.model = model;
        model.addObserver(this);

    }

    @Override
    public void update() {
        Parent root = render();
        stage.getScene().setRoot(root);
    }

    @Override
    public Parent render() {
        Pane layout = new VBox();

        ScoreBoardView scoreBoardView = new ScoreBoardView(model);
        InstructionsView instructionsView = new InstructionsView();
        BoardView boardView = new BoardView(model);

        layout.getChildren().add(scoreBoardView.render());
        layout.getChildren().add(instructionsView.render());
        layout.getChildren().add(boardView.render());

        layout.getStyleClass().add("layout");

        return layout;
    }
}
