package edu.unc.comp301.observer.ex3;

public class GameEventImpl implements GameEvent {
  // Encapsulates the event type and who scored
  private EventType type;
  private String whoScored;

  // Constructor
  GameEventImpl(EventType type, String whoScored) {
    this.type = type;
    this.whoScored = whoScored;
  }

  // Gets the type of event as a String
  public  EventType getType() {
    return type;
  }

  // Gets the team that scored as a String
  public String getWhoScored() {
    return whoScored;
  }
}
