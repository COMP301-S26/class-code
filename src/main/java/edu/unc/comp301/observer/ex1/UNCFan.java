package edu.unc.comp301.observer.ex1;

public class UNCFan implements Fan {
  private Game game;

  public UNCFan(Game game){
    this.game = game;
    game.addObserver(this);
  }

  @Override
  public void update() {
    if(game.whoIsWinning().equals("UNC")){
      System.out.println("UNC Fan: Go Heels!");
    }
  }
}
