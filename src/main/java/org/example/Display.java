package org.example;

import java.io.PrintStream;

public class Display {
    private final PrintStream out;

    public Display(PrintStream out) {
        this.out = out;
    }

    public void showInput(String input) {
        out.println("Input: " + input);
    }

    public void showResult(double result) {
        out.println("Result: " + result);
    }

    public void showError(String error) {
        out.println("Error: " + error);
    }

    public void showHistory(String history) {
        out.println("History: \n" + history);
    }
}
