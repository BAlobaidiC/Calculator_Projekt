package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Display display = new Display(System.out);
        History history = new History();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a calculation (like 5 + 3) or type 'exit' to quit:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double result = calculator.calculate(input);
                display.showInput(input);
                display.showResult(result);
                history.addEntry(input, result);
            } catch (Exception e) {
                display.showError(e.getMessage());
            }

            System.out.println("Do you want to see the history? (yes/no)");
            String showHistory = scanner.nextLine();

            if (showHistory.equalsIgnoreCase("yes")) {
                display.showHistory(history.getEntries());
            }

            System.out.println("Do you want to clear the history? (yes/no)");
            String clearHistory = scanner.nextLine();

            if (clearHistory.equalsIgnoreCase("yes")) {
                history.clearHistory();
                System.out.println("History cleared.");
            }
        }

        scanner.close();
    }
}