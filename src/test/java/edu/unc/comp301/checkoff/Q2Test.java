package edu.unc.comp301.checkoff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {

    @Test
    public void testOne() {
        try {
            Q2.simOne();
        } catch (Exception e) {
            fail("Exception thrown: " + e.getClass());
        }
    }

    @Test
    public void testTwo(){
        Q2.simTwo(300);
    }

    @Test
    public void testThree(){
        Q2.simThree();
    }

}
