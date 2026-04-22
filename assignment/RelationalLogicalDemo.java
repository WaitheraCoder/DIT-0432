import java.util.Scanner;

public class RelationalLogicalDemo {
    public static void main(String[] args) {

        // Create Scanner for input
        Scanner input = new Scanner(System.in);

        // Accept two integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // Relational checks
        boolean isGreater = num1 > num2;
        boolean isLess = num1 < num2;
        boolean isEqual = num1 == num2;

        // Logical checks
        boolean bothEven = (num1 % 2 == 0) && (num2 % 2 == 0);
        boolean atLeastOnePositive = (num1 > 0) || (num2 > 0);

        // Display results
        System.out.println("=======    Results  ========");
        System.out.println("First number is greater than second: " + isGreater);
        System.out.println("First number is less than second: " + isLess);
        System.out.println("First number is equal to second: " + isEqual);
        System.out.println("Both numbers are even: " + bothEven);
        System.out.println("At least one number is positive: " + atLeastOnePositive);

    }
}
