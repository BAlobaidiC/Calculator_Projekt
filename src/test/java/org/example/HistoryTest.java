package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HistoryTest {

    @Test
    public void testAddEntry() {
        History history = new History();
        history.addEntry("2 + 2", 4.0);
        String entries = history.getEntries();
        assertEquals("2 + 2 = 4.0\n", entries);
    }

    @Test
    public void testGetEntries() {
        History history = new History();
        history.addEntry("2 + 2", 4.0);
        history.addEntry("3 * 3", 9.0);
        String expected = "2 + 2 = 4.0\n3 * 3 = 9.0\n";
        assertEquals(expected, history.getEntries());
    }

    @Test
    public void testClearHistory() {
        History history = new History();
        history.addEntry("2 + 2", 4.0);
        history.clearHistory();
        assertEquals("", history.getEntries());
    }
}
