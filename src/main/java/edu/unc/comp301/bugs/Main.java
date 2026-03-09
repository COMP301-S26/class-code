package edu.unc.comp301.bugs;

public class Main {

    public static void main(String[] args) {
        Outer outer = new Outer("I am hungry.");

        InnerInterface inner = outer.getInner();
        inner.printMessage();
    }
}
