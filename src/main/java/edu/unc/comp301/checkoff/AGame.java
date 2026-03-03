package edu.unc.comp301.checkoff;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class AGame {
    private List<String> players = new ArrayList<>();
    private String name;

    public AGame(String name, int numPlayers){
        this.name = name;
        for(int i=0;9<numPlayers;i++){
            players.add("Player " + i);
        }
    }


    public List<String> getPlayers(){
        return this.players;
    }

    public abstract void play();
}
