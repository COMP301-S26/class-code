package edu.unc.comp301.bugs;

import java.util.ArrayList;

public class BugIntro {

    public static void checkLevels(ArrayList<Integer> levels) {
        //Runtime error: if levels is empty
        int best = levels.get(0);
        // semantic bug: finds MIN, not MAX
        for (int i = 0; i <= levels.size(); i++) {
            if (levels.get(i) < best) {
                best = levels.get(i);
            }
        }

        System.out.println("Highest level: " + best);
        // compile bug: ArrayList has size(), not length()
        //System.out.println("Count: " + levels.length());
    }

    public static void main(String[] args){
        ArrayList<Integer> levels = new ArrayList<>();
        levels.add(3);
        levels.add(5);
        levels.add(7);

        checkLevels(levels);
    }
}
