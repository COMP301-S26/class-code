package edu.unc.comp301.Adapter;

// Client
public class RoundHole {
    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(Peg peg) {
        return peg.getRadius() <= radius;
    }
}
