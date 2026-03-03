package edu.unc.comp301.encapsulation;

public class PointTriangle implements Triangle{
    private Point a;
    private Point b;
    private Point c;

    public PointTriangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getPerimeter() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

    @Override
    public void transpose(double xDir, double yDir) {

    }
}
