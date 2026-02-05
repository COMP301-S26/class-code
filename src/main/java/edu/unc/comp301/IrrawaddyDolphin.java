package edu.unc.comp301;

public class IrrawaddyDolphin implements Animal{

    @Override
    public void speak() {
        System.out.println("Eek-eek-eek");
    }

    @Override
    public String getDescription() {
        return "looks like a 5 year old drew a dolphin that came to life.";
    }
}
