package edu.unc.comp301.checkoff;

import java.util.List;

public class Q1 extends AGame{

    public Q1(){
        super("Football", 2);
    }

    @Override
    public void play() {
        List<String> players = getPlayers();
        System.out.println(players.get(0) + " is playing first");

    }
}
