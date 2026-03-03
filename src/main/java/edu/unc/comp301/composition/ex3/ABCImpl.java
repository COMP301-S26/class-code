package edu.unc.comp301.composition.ex3;

import edu.unc.comp301.composition.interfaces.A;
import edu.unc.comp301.composition.interfaces.B;
import edu.unc.comp301.composition.interfaces.C;

public class ABCImpl implements A,B, C {
    private A a;
    private B b;
    private C c;

    public ABCImpl(A a, B b, C c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void methodA1() {
        a.methodA1();
    }

    @Override
    public void methodA2() {
        a.methodA2();;
    }

    @Override
    public void methodB1() {
        b.methodB1();
    }

    @Override
    public void methodB2() {
        b.methodB2();
    }

    @Override
    public void methodC1() {
        c.methodC1();
    }

    @Override
    public void methodC2() {
        c.methodC2();
    }
}
