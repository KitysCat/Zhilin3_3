package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void cTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.sum(2, 2), 4);
        assertEquals(calculator.sub(6, 2), 4);
        assertEquals(calculator.mul(6, 2), 12);
        assertEquals(calculator.div(6, 2), 3);
    }
}