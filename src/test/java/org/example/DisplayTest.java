package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DisplayTest {
    @Test
    void showInput() {
        Display display = new Display();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        display.showInput("5 + 3");

        assertEquals("Input: 5 + 3\n", outContent.toString());
    }

    @Test
    void showResult() {
        Display display = new Display();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        display.showResult(8);

        assertEquals("Result: 8.0\n", outContent.toString());
    }

    @Test
    void showError() {
        Display display = new Display();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        display.showError("Error message");

        assertEquals("Error: Error message\n", outContent.toString());
    }

    @Test
    void showHistory() {
        Display display = new Display();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        display.showHistory("5 + 3 = 8\n6 / 2 = 3");

        assertEquals("History: \n5 + 3 = 8\n6 / 2 = 3\n", outContent.toString());
    }
}