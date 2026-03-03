package edu.unc.comp301.encapsulation;

public class DoubleTriangle implements Triangle {
    private double ax;
    private double ay;
    private double bx;
    private double by;
    private double cx;
    private double cy;

    public DoubleTriangle(double ax,double ay,double bx,double by,double cx,double cy){
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
    }

    @Override
    public String toString(){
        return String.format("(%.1f,%.1f),(%.1f,%.1f),(%.1f,%.1f)", ax,ay,bx,by,cx,cy);
    }

    @Override
    public double getPerimeter() {
        return distance(ax,ay,bx,by) + distance(bx,by,cx,cy) + distance(cx,cy,ax,ay);
    }

    private static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

    @Override
    public void transpose(double xDir, double yDir) {
        ax += xDir;
        ay += yDir;
        bx += xDir;
        by += yDir;
        cx += xDir;
        cy += yDir;
    }
}
