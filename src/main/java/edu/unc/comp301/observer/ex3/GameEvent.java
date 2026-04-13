package edu.unc.comp301.observer.ex3;

public interface GameEvent {
  // Gets the type of event as a String
  EventType getType();

  // Gets the team that scored as a String
  String getWhoScored();
}
