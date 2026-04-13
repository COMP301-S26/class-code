package edu.unc.comp301.observer.ex2;


public class UNCFan implements Fan {
  // Handles events
  public void update(Game game) {
    if (game.whoIsWinning().equals("UNC")) {
      System.out.println("UNC Fan: Go Heels!");
    }
  }
}
