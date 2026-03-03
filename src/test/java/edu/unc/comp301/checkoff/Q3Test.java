package edu.unc.comp301.checkoff;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {
    @Test
    public void testCompletionRate() {
        Q3 q3 = new Q3();

        assertEquals(
                70.0,
                q3.completionRate(7, 10),
                0.0001,
                "completionRate(7, 10)"
        );
    }

    @Test
    public void testGetLongestPass() {
        Q3 q3 = new Q3();

        assertEquals(
                42,
                q3.getLongestPass(42, 17),
                "getLongestPass(42, 17)"
        );
    }

    @Test
    public void testTotalScore() {
        Q3 q3 = new Q3();
        List<Integer> plays = Arrays.asList(3, 7, 10);

        assertEquals(
                20,
                q3.totalScore(plays),
                "totalScore([3, 7, 10])"
        );
    }
}