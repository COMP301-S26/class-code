package edu.unc.comp301.mvc2048.controller;

import edu.unc.comp301.mvc2048.model.Model;

public class ControllerImpl implements Controller{
    private final Model model;

    public ControllerImpl(Model model){
        this.model = model;
    }

    @Override
    public void swipe(Direction d) {
        switch(d){
            case UP:
                model.swipeUp();
                break;
            case DOWN:
                model.swipeDown();
                break;
            case LEFT:
                model.swipeLeft();
                break;
            case RIGHT:
                model.swipeRight();
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public void reset() {
        model.reset();

    }
}
