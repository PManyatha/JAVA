//package Calculator;
//
//import java.util.Scanner;
//
//public class Calculator {
//
//    public static final String VERSION = "1.0.0";
//
//
//
//    public void printVersion() {
//        System.out.println("Calculator Version: " + VERSION);
//    }
//
//    public static void main(String[] args){
//
//        Scanner input=new Scanner(System.in);
////        System.out.println("Enter the first Number: ");
////        double firstnumber=input.nextDouble();
////
////        System.out.println("Enter the second Number: ");
////        double secondnumber=input.nextDouble();
//
//
//
//        Calculator calculator=new Calculator();
//        calculator.printVersion();
//
//        System.out.println("Select an operation:");
//        System.out.println("1. Add");
//        System.out.println("2. Subtract");
//        System.out.println("3. Multiply");
//        System.out.println("4. Divide");
//        System.out.println("5. Exit");
//
//       // char operation=input.next().charAt(0);
//        int choice = input.nextInt();
//
//
////        if (choice == 1) {
////            System.out.println("You chose to add.");
////        } else if (choice == 2) {
////            System.out.println("You chose to subtract.");
////        } else if (choice == 3) {
////            System.out.println("You chose to multiply.");
////        } else if (choice == 4) {
////            System.out.println("You chose to divide.");
////        } else if (choice == 5) {
////            System.out.println("Exiting...");
////        } else {
////            System.out.println("Invalid choice.");
////        }
//
//        switch (choice) {
//            case 1:
//                System.out.println("You chose to add.");
//                break;
//            case 2:
//                System.out.println("You chose to subtract.");
//                break;
//            case 3:
//                System.out.println("You chose to multiply.");
//                break;
//            case 4:
//                System.out.println("You chose to divide.");
//                break;
//            case 5:
//                System.out.println("Exiting...");
//                break;
//            default:
//                System.out.println("Invalid choice.");
//                break;
//        }
//
//        input.close();
//
////        byte num1 = 10;
////        short num2 = 20;
////        int num3 = 30;
////        long num4 = 40;
////
////        int sum = num1 + num2;
////        int difference = num3 - num1;
////        long product = num2 * num4;
////        long quotient = num4 / num2;
//
////        System.out.println("Sum: " + sum);
////        System.out.println("Difference: " + difference);
////        System.out.println("Product: " + product);
////        System.out.println("Quotient: " + quotient);
//
//    }
//}

package Calculator;

import java.util.Scanner;

public class Calculator {

    public static final String VERSION = "1.0.0";

    public void printVersion() {
        System.out.println("Calculator Version: " + VERSION);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.printVersion();

        int choice;
        do {
            // Display the available options to the user
            System.out.println("Select an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            // Get the user's choice
            choice = input.nextInt();

            // Declare variables for input numbers
            double num1, num2, result = 0;
            boolean validOperation = true;

            if (choice >= 1 && choice <= 4) {
                // Get the two numbers for the operation
                System.out.print("Enter the first number: ");
                num1 = input.nextDouble();

                System.out.print("Enter the second number: ");
                num2 = input.nextDouble();
            } else {
                num1 = num2 = 0;  // Default initialization (not used if choice is 5)
            }

            // Perform the operation based on user choice
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result of addition: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result of subtraction: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result of multiplication: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result of division: " + result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    validOperation = false;
            }

            // Ask the user if they want to perform another operation
            if (choice != 5 && validOperation) {
                System.out.println("Do you want to perform another calculation? (yes/no)");
                String userResponse = input.next();

                if (userResponse.equalsIgnoreCase("no")) {
                    choice = 5;  // Set choice to 5 to exit the loop
                }
            }

        } while (choice != 5);  // Exit the loop when choice is 5 (Exit)

        input.close();
    }
}
