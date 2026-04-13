package edu.unc.comp301.decorator.ichabod;

public class BigNoseDecorator implements Programmer{
    private Programmer prog;

    public BigNoseDecorator(Programmer prog){
        this.prog = prog;
    }

    @Override
    public String getDescription() {
        return prog.getDescription() + " the biggest nose you've ever seen";
    }
}
