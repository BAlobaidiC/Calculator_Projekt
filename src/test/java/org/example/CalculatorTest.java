package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        // Positive test case
        assertEquals(8, calculator.add(5, 3));
        // Negative test case (boundary condition)
        assertEquals(Double.MAX_VALUE, calculator.add(Double.MAX_VALUE, 0));
    }

    @Test
    void subtract() {
        // Positive test case
        assertEquals(2, calculator.subtract(5, 3));
        // Negative test case (boundary condition)
        assertEquals(-Double.MAX_VALUE, calculator.subtract(-Double.MAX_VALUE, 0));
    }

    @Test
    void multiply() {
        // Positive test case
        assertEquals(15, calculator.multiply(5, 3));
        // Negative test case (overflow condition)
        assertEquals(Double.POSITIVE_INFINITY, calculator.multiply(Double.MAX_VALUE, 2));
    }

    @Test
    void divide() {
        // Positive test case
        assertEquals(2, calculator.divide(6, 3));
        // Negative test case (division by zero)
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
    }

    @Test
    void calculate() {
        // Positive test case
        try {
            assertEquals(8, calculator.calculate("5 + 3"));
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
        // Negative test case (invalid operator)
        assertThrows(Exception.class, () -> {
            calculator.calculate("5 ^ 3");
        });
        // Negative test case (invalid format)
        assertThrows(Exception.class, () -> {
            calculator.calculate("5 3 +");
        });
    }
}