package edu.unc.comp301.creational;

import java.util.HashMap;
import java.util.Map;

public class GameMap {
    private static Map<String, GameMap> collection = new HashMap<>();
    private String id;

    private GameMap(String id){
        this.id=id;
    }

    public static GameMap getMap(String id){
        if(!collection.containsKey(id)){
            GameMap newMap = new GameMap(id);
            collection.put(id,newMap);
            return newMap;
        }
        return collection.get(id);
    }
}
