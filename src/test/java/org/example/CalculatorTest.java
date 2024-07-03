package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1)); // Negative case
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-5, calculator.subtract(-2, 3)); // Negative case
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(-2, 3)); // Negative case
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-6, 3)); // Negative case
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }

    // Additional tests for the calculate method
    @Test
    public void testCalculateAdd() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.calculate("2 + 3"));
    }

    @Test
    public void testCalculateSubtract() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.calculate("3 - 2"));
    }

    @Test
    public void testCalculateMultiply() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.calculate("2 * 3"));
    }

    @Test
    public void testCalculateDivide() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.calculate("6 / 3"));
    }

    @Test
    public void testCalculateDivideByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.calculate("1 / 0");
        });
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    public void testCalculateInvalidOperator() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(Exception.class, () -> {
            calculator.calculate("1 & 1");
        });
        assertEquals("Invalid operator", exception.getMessage());
    }
}