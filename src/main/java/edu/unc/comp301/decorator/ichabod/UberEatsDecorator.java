package edu.unc.comp301.decorator.ichabod;

public class UberEatsDecorator implements Programmer{
    private Programmer prog;

    public UberEatsDecorator(Programmer prog){
        this.prog = prog;
    }

    @Override
    public String getDescription() {
        return prog.getDescription() + " surrounded buy months old crusty bags of uber eats";
    }
}
