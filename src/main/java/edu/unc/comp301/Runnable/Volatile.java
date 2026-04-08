package edu.unc.comp301.Runnable;

public class Volatile {
    //Add Volatile keyword to ensure proper memory checking
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        //Inline lambda expression
        new Thread(() -> {
            System.out.println("Thread started, waiting...");
            while (!flag) {
                // busy-waiting
            }
            System.out.println("Flag detected, thread stopping.");
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flag = true;
        System.out.println("Flag updated to true by main thread.");
    }
}
