package edu.unc.comp301.encapsulation;

public class Main {
    public static void main(String[] args){
        DoubleTriangle t1 = new DoubleTriangle(0,1,1,2,2,0);
//
        System.out.println(t1);
        System.out.println(t1.getPerimeter());
        t1.transpose(3,3);
        System.out.println(t1.getPerimeter());

//        Point a = new Point (0,0);
//        Point b = new Point (1,2);
//        Point c = new Point (2,0);
//
//        PointTriangle t1 = new PointTriangle(a,b,c);
//
//        Point d = new Point (3,2);
//        Point e = new Point (4,0);
//
//        PointTriangle t2 = new PointTriangle(c,d,e);
//
    }
}
