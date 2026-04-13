package edu.unc.comp301.observer.ex2;

public class Prof implements Fan{
    // Handles events
    @Override
    public void update(Game game) {
        if (game.whoIsWinning().equals("UNC") || game.whoIsWinning().equals("NCState")) {
            System.out.println("Prof Prairie: Go Sportsteam!");
        }
    }

}
