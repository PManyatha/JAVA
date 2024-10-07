package Calculator;

import java.util.Scanner;

public class BasicCalculator {
    public static final String VERSION = "1.0.0";
    public static void main(String[] args) {

        System.out.println("Basic Calculator - Version: " + VERSION);

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();


        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();


        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;


        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

