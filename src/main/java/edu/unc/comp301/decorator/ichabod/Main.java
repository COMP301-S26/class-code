
package edu.unc.comp301.decorator.ichabod;

public class Main {
    public static void main(String[] arg){
        Programmer icky = new Ichabod();
        icky = new BigNoseDecorator(icky);
        icky = new UberEatsDecorator(icky);
        icky = new EvilAuraDecorator(icky);

        System.out.println(icky.getDescription());


    }
}
