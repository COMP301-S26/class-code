package edu.unc.comp301.Runnable;

public class ZombieBunker {
    private boolean isOccupied = false;

    public synchronized void enter(String name) {
        while (isOccupied) {
            try {
                System.out.println(name + " waits outside the bunker...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        isOccupied = true;
        System.out.println(name + " enters the bunker.");
    }

    public synchronized void leave(String name) {
        isOccupied = false;
        System.out.println(name + " leaves the bunker.");
        notify(); // Wake one waiting survivor
    }

    public synchronized void openAllDoors() {
        isOccupied = false;
        System.out.println("Bunker opening for evacuation!");
        notifyAll(); // Wake up ALL waiting survivors
    }

    public static void main(String[] args) throws InterruptedException {
        ZombieBunker bunker = new ZombieBunker();

        for (int i = 1; i <= 5; i++) {
            Runnable survivor =  new Survivor(bunker, "Survivor-" + i);
            Thread thread = new Thread(survivor);
            thread.start();
            Thread.sleep(300); // Survivors arrive one at a time
        }

        // Optionally simulate a full evacuation:
        Thread.sleep(5000);
        bunker.openAllDoors();
    }
}