package org.example;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<String> entries = new ArrayList<>();

    public void addEntry(String input, double result) {
        if (input == null) {
            
            throw new NullPointerException("Input cannot be null");
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty");
        }
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