package org.example;
import java.util.*;

public class History {

    private List<String> entries = new ArrayList<>();

    public void addEntry(String input, double result) {
        entries.add(input + " = " + result);
    }

    public String getEntries() {
        StringBuilder history = new StringBuilder();
        for (String entry : entries) {
            history.append(entry).append("\n");
        }
        return history.toString();
    }

    public void clearHistory() {
        entries.clear();
    }
}
