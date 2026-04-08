package edu.unc.comp301.Runnable;

public class Multithreader {
  public static void main(String[] args) {
      //example1();
      //example2();
      //example3();
      //example4();

     try {
          example5();
       } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
  }

  public static void example1() {
    Runnable task1 =
        () -> {
          for (int i = 0; i < 3; i++) {
            System.out.print(i + 1);
          }
        };
  }

  public static void example2() {
    Runnable task1 =
        () -> {
          for (int i = 0; i < 3; i++) {
            System.out.print(i + 1);
          }
        };

    System.out.println("Printing 1 to 3");
    task1.run();
    System.out.println("Done");
  }

  public static void example3() {
    Runnable task1 =
        () -> {
          for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
          }
        };

    System.out.println("Printing 1 to 10");
    Thread thread = new Thread(task1);
    thread.start();
    System.out.println("Done");
  }

  public static void example4() {
    Runnable task =
        () -> {
          for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.print(" ");
          }
        };
    Thread thread1 = new Thread(task);
    thread1.start();
    Thread thread2 = new Thread(task);
    thread2.start();
    System.out.println("Finished!");
  }

  public static void example5() throws InterruptedException {
    Runnable task =
        () -> {
          for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.print(" ");
          }
        };
    Thread thread1 = new Thread(task);
    thread1.start();
    Thread thread2 = new Thread(task);
    thread2.start();
    thread1.join();
    thread2.join();

    System.out.println("Finished!");
  }
}
