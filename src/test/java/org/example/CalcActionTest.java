package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcActionTest {

    CalcAction calcAction;


    @BeforeEach
    public void tearDown() {
        calcAction = new CalcAction();
    }

    @Test
    public void sum() {
        assertAll(
                ()->assertEquals(8,calcAction.sum(3,5),0),
                ()->assertEquals(0,calcAction.sum(-5,5),0)
        );

    }

    @Test
    public void subtraction() {
        assertAll(
                ()->assertEquals(-5,calcAction.subtraction(0,5),0),
                ()->assertEquals(-10,calcAction.subtraction(-5,5),0)

        );
    }

    @Test
    public void multiplication() {
        assertAll(
                ()->assertEquals(0,calcAction.multiplication(3,0),0),
                ()->assertEquals(-5,calcAction.multiplication(-1,5),0)
        );
    }

    @Test
    public void division() {
        assertAll(
                () -> assertTrue(Double.isInfinite(calcAction.SelectMethod(3,0,4))),
                () -> assertEquals(3, calcAction.SelectMethod(6,2,4),0)
        );

    }

    @Test
    public void pow() {
        assertAll(
                ()->assertEquals(1,calcAction.Pow(3,0),0),
                ()->assertEquals(8,calcAction.Pow(2,3),0)
        );
    }

    @Test
    public void CheckErrorRun(){
        assertAll(
                () -> assertFalse(calcAction.CheckErrorRun("5","0","4")),
                () -> assertTrue(calcAction.CheckErrorRun("5","4","1")),
                () -> assertFalse(calcAction.CheckErrorRun("5","U","2")),
                () -> assertFalse(calcAction.CheckErrorRun("","7","3"))
        );
    }
}