package edu.unc.comp301.observer.ex1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Create game object (observable)
    Game g = new GameImpl("Duke", "UNC");

    // Create fan objects (observers)
    UNCFan tarheel = new UNCFan(g);
    DukeFan devil = new DukeFan(g);
//    g.scorePoints("Duke", 2);
//    g.scorePoints("UNC", 3);
    g.printScore();

        // Allow the program user to score points
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
          String team = s.next();
          int points_to_add = s.nextInt();

          g.scorePoints(team, points_to_add);
          g.printScore();
        }

    // Shut down
    s.close();
  }
}
