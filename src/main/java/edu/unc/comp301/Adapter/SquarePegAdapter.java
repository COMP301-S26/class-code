
package edu.unc.comp301.Adapter;

// Adapter
public class SquarePegAdapter implements Peg {
    private final SquarePeg square;

    public SquarePegAdapter(SquarePeg square){
        this.square = square;
    }

    @Override
    public double getRadius() {
        return square.getWidth() * Math.sqrt(2.0)/2.0;
    }
}

