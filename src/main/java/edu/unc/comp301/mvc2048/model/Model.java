package edu.unc.comp301.mvc2048.model;

import edu.unc.comp301.mvc2048.Subject;

public interface Model extends Subject {
    void swipeLeft();
    void swipeRight();
    void swipeUp();
    void swipeDown();
}
