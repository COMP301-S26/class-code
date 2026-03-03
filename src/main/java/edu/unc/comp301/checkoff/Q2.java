package edu.unc.comp301.checkoff;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    private String quarterback = null;
    private List<Integer> passingYards = new ArrayList<>();

    public Q2(){

    }

    public Q2(String quarterback){
        this.quarterback = quarterback;
    }

    public String getQuarterback(){
        return this.quarterback;
    }

    public List<Integer> getPassingYards(){
        return this.passingYards;
    }

    public void addPlay(int yards) {
        if (yards > 120) {
            throw new IllegalArgumentException("Not even Drake Maye can throw that.");
        }
        passingYards.add(yards);
    }

    public static void simOne(){
        Q2 sim = new Q2();
        System.out.println(sim.getQuarterback().length());
    }

    public static void simTwo(int yards){
        Q2 sim = new Q2("Drake maye");
        sim.addPlay(yards);
    }

    public static void simThree(){
        Q2 sim = new Q2("Sam Darnold");
        sim.addPlay(23);
        sim.addPlay(12);
        sim.addPlay(50);
        sim.addPlay(16);
        for(int i=0; i<= sim.getPassingYards().size(); i++){
            System.out.println("Seahawks run the ball " + sim.getPassingYards().get(i) + " yards");
        }
    }




}
