package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class DisplayTest {

    @Test
    public void testShowInput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Display display = new Display(System.out);
        display.showInput("test input");
        assertEquals("Input: test input", outputStream.toString().trim());

        System.setOut(originalOut);
        outputStream.reset();
    }

    @Test
    public void testShowResult() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Display display = new Display(System.out);
        display.showResult(42.0);
        assertEquals("Result: 42.0", outputStream.toString().trim());

        System.setOut(originalOut);
        outputStream.reset();
    }

    @Test
    public void testShowError() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Display display = new Display(System.out);
        display.showError("test error");
        assertEquals("Error: test error", outputStream.toString().trim());

        System.setOut(originalOut);
        outputStream.reset();
    }

    @Test
    public void testShowHistory() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Display display = new Display(System.out);
        display.showHistory("test history");
        assertEquals("History: \ntest history", outputStream.toString().trim());

        System.setOut(originalOut);
        outputStream.reset();
    }
}
