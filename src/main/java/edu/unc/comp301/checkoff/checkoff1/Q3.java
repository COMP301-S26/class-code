package edu.unc.comp301.checkoff.checkoff1;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    private String quarterback = null;
    private List<Integer> passingYards = new ArrayList<>();

    public Q3(){

    }

    public Q3(String quarterback){
        this.quarterback = quarterback;
    }

    public String getQuarterback(){
        return this.quarterback;
    }

    public List<Integer> getPassingYards(){
        return this.passingYards;
    }

    public double completionRate(int completions, int attempts) {
        return completions / attempts * 100;
    }

    public int getLongestPass(int playA, int playB) {
        if (playA > playB) {
            return playB;
        }
        return playA;
    }
    public int totalScore(List<Integer> plays) {
        int sum = 0;
        for(int i=0;i<plays.size();i++){
            sum = plays.get(i);
        }
        return sum;
    }

}
