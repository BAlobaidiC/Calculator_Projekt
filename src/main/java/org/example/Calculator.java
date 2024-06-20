package org.example;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public double calculate(String input) throws Exception {
        String[] parts = input.split(" ");
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[2]);
        String operator = parts[1];

        switch (operator) {
            case "+":
                return add(a, b);
            case "-":
                return subtract(a, b);
            case "*":
                return multiply(a, b);
            case "/":
                return divide(a, b);
            default:
                throw new Exception("Invalid operator");
        }
    }

}
