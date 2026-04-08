package edu.unc.comp301.Runnable;

public class RunnableExamples {
    public static void main(String[] args){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                //Insert code here
            }
        };

        Runnable myTask = () -> {
            //Code to run here
        };
    }
}
