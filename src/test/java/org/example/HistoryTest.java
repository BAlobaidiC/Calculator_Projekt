package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertEquals("2 + 2 = 4.0\n", entries);
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

    @Test
    public void testAddNullEntry() {
        assertThrows(NullPointerException.class, () -> {
            history.addEntry(null, 0);
        });
    }

    @Test
    public void testAddEmptyEntry() {
        assertThrows(IllegalArgumentException.class, () -> {
            history.addEntry("", 0);
        });
    }
}
