package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DisplayTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
        outputStream.reset();
    }

    @Test
    public void testShowInput() {
        Display display = new Display(new PrintStream(outputStream));
        display.showInput("test input");
        assertEquals("Input: test input", outputStream.toString().trim());
    }

    @Test
    public void testShowResult() {
        Display display = new Display(new PrintStream(outputStream));
        display.showResult(42.0);
        assertEquals("Result: 42.0", outputStream.toString().trim());
    }

    @Test
    public void testShowError() {
        Display display = new Display(new PrintStream(outputStream));
        display.showError("test error");
        assertEquals("Error: test error", outputStream.toString().trim());
    }

    @Test
    public void testShowHistory() {
        Display display = new Display(new PrintStream(outputStream));
        display.showHistory("test history");
        assertEquals("History: \ntest history", outputStream.toString().trim());
    }
}
