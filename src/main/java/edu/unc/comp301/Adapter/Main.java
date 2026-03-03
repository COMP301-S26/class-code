package edu.unc.comp301.Adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5.0);
        Peg round = () -> 5.0; // simple lambda implementing Peg
        System.out.println(hole.fits(round)); // true

        SquarePeg smallSquare = new SquarePeg(7.0);
        SquarePeg bigSquare = new SquarePeg(11.0);

        Peg smallAdapted = new SquarePegAdapter(smallSquare);
        Peg bigAdapted = new SquarePegAdapter(bigSquare);

        System.out.println(hole.fits(smallAdapted)); // true
        System.out.println(hole.fits(bigAdapted));   // false
    }
}
