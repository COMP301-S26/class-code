package edu.unc.comp301.bugs;

public class Outer {
    private String message = "Hello from Outer!";

    public Outer(String message){
        this.message = message;
    }

    public InnerInterface getInner(){
        return new Inner();
    }
    private class Inner implements InnerInterface{

        @Override
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