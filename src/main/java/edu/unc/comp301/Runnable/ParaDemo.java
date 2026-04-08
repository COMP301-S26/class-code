package edu.unc.comp301.Runnable;

import java.util.Random;

public class ParaDemo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors()); //Runtime is a singleton!

        for (int num_threads = 1; num_threads <= 24; num_threads++) {
            int num_items = 1_000_000_000;//One billion

            Thread[] workers = new Thread[num_threads];

            long start = System.nanoTime();//What time did I start?
            for (int i = 0; i < num_threads; i++) {
                int num_per_thread = num_items / num_threads; //Rough estimate.  We don't need to be perfect.
                workers[i] = new Thread(() -> {
                    Random rnd = new Random();
                    for (int j = 0; j < num_per_thread; j++) {
                        rnd.nextDouble();//We don't care about what the code does, but this takes a non-zero amount of time.
                    }
                });
                workers[i].start();
            }

            for (Thread w : workers) {
                try {
                    w.join(); //Checked exception
                } catch (InterruptedException e) {
                }
            }

            long end = System.nanoTime();//What time Did I end?

            System.out.println("Overall elapsed with " + num_threads + " threads: " + ((end - start) / 1e9) + " seconds");
        }
    }

}