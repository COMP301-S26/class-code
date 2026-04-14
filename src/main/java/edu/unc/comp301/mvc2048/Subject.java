package edu.unc.comp301.mvc2048;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
}
