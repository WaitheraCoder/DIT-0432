import java.util.Scanner;

public class SimpleCalculatorMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n=== SIMPLE CALCULATOR ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            // Exit condition
            if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }

            // Validate valid operations
            if (choice >= 1 && choice <= 4) {

                // Accept numbers
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                double result;

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        }
                        break;
                }

            } else {
                System.out.println("Invalid choice! Please select 1–5.");
            }

        } while (choice != 5);
    }
}