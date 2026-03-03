package edu.unc.comp301.iterators;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String
        String razor = "Never attribute to malice that which is adequately explained by stupidity";

        //Line Scanner
        Scanner s = new Scanner(razor);
        while(s.hasNext()){
            System.out.println(s.next());
        }

        //file scanner
        File file = new File("src/main/java/edu/unc/comp301/iterators/Main.java");
        try {
            s = new Scanner(file);
            while(s.hasNext()){
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




        //System Scanner for input
//        s = new Scanner(System.in);
//        while(s.hasNext()) {
//            Scanner innerScanner = new Scanner(s.nextLine());
//            while (innerScanner.hasNext()){
//                System.out.println(innerScanner.next());
//            }
//        }



        MyLinkedList<Integer> myList = new MyLinkedList();
        myList.add(5);
        myList.add(4);
        myList.add(42);

        Iterator<Integer> i = myList.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}


