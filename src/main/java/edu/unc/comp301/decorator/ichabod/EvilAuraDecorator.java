package edu.unc.comp301.decorator.ichabod;

public class EvilAuraDecorator implements Programmer{
    private Programmer prog;

    public EvilAuraDecorator(Programmer prog){
        this.prog = prog;
    }

    @Override
    public String getDescription() {
        return prog.getDescription() + " with an evil aura and devious smirk";
    }
}
