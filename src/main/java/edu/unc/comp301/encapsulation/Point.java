package edu.unc.comp301.encapsulation;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)", this.x, this.y);
    }

    public double distanceTo(Point other) {
        return Math.sqrt((this.getX() - other.getX()) * (this.getX() - other.getX()) + (this.getY() - other.getY()) * (this.getY() - other.getY()));
    }


}
