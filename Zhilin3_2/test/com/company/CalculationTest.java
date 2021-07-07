package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    @Test
    void cTest() {
        Calculation calculation = new Calculation();
        calculation.calculation(1, -7, 6);
        double x1 = calculation.getX1();
        double x2 = calculation.getX2();
        calculation.calculation(16, -40, 25);
        double x = calculation.getX();

        assertEquals(1, x1);
        assertEquals(6, x2);
        assertEquals(1.25, x);

    }
}