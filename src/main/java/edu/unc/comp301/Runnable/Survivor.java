package edu.unc.comp301.Runnable;

public class Survivor implements Runnable {
    private final ZombieBunker bunker;
    private final String name;

    public Survivor(ZombieBunker bunker, String name) {
        this.bunker = bunker;
        this.name = name;
    }

    @Override
    public void run() {
        bunker.enter(name);
        try {
            Thread.sleep(1000); // Simulate checking in
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        bunker.leave(name);
    }
}
