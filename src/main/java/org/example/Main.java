package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Display display = new Display();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a calculation (e.g., 5 + 3) or type 'exit' to quit:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double result = calculator.calculate(input);
                display.showInput(input);
                display.showResult(result);
            } catch (Exception e) {
                display.showError(e.getMessage());
            }
        }

        scanner.close();
    }

}