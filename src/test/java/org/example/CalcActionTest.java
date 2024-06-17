package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcActionTest {


    @BeforeEach
    public void tearDown() {
    }

    @Test
    public void summa() {
        CalcAction calcAction = new CalcAction();
        double actual = calcAction.Summa(3,5);
        double expected = 8;
    }

    @Test
    public void munus() {
    }

    @Test
    public void ymnog() {
        System.out.println(1);
    }

    @Test
    public void delenie() {
        CalcAction calcAction = new CalcAction();
        double result = calcAction.Run(3,0,"4");

        assertAll(
                () -> assertFalse(Double.isInfinite(result)),
                () -> assertEquals(0, result,0)
        );

    }

    @Test
    public void pow() {
    }
}