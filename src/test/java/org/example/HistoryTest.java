package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HistoryTest {

    private History history;

    @BeforeEach
    public void setUp() {
        history = new History();
    }

    @Test
    public void testAddEntry() {
        history.addEntry("2 + 2", 4.0);
        String entries = history.getEntries();
        assertTrue(entries.contains("2 + 2 = 4.0"));
    }

    @Test
    public void testGetEntries() {
        history.addEntry("2 + 2", 4.0);
        history.addEntry("3 * 3", 9.0);
        String expected = "2 + 2 = 4.0\n3 * 3 = 9.0\n";
        assertEquals(expected, history.getEntries());
    }

    @Test
    public void testClearHistory() {
        history.addEntry("2 + 2", 4.0);
        history.clearHistory();
        assertEquals("", history.getEntries());
    }
}
