package edu.unc.comp301.decorator.lowkey;

public class Main {
    public static void main(String[] args){
        BrainRot rot = new LowKey();
        rot = new TTT(rot);
        rot = new Genuinely(rot);

        System.out.println(rot.getDescription());

    }
}
