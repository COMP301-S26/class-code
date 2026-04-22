package edu.unc.comp301.mvc2048.view;

import javafx.scene.Parent;
import javafx.scene.control.Label;

public class InstructionsView implements FXComponent {
    @Override
    public Parent render() {
        Label instructions = new Label("Join the numbers and get to the 2048 tile!");
        instructions.getStyleClass().add("instructions");

        return instructions;
    }
}
