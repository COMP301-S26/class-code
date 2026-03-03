package edu.unc.comp301.bugs;

public class Outer {
    private String message = "Hello from Outer!";

    public class Inner {
        public void printMessage() {
            System.out.println(message);
        }
    }
//
//    public static void main(String[] args) {
//        Inner inner = new Inner();
//        inner.printMessage();
//    }
}