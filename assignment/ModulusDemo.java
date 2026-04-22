import java.util.Scanner;

public class ModulusDemo {
    public static void main(String[] args) {

        // Create Scanner for input
        Scanner input = new Scanner(System.in);

        // Accept number from user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Even or Odd check
        if (number % 2 == 0) {
            System.out.println("The number is EVEN.");
        } else {
            System.out.println("The number is ODD.");
        }

        // Divisible by 5 check
        if (number % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        } else {
            System.out.println("The number is NOT divisible by 5.");
        }

        // Remainder when divided by 3
        int remainder = number % 3;
        System.out.println("Remainder when divided by 3: " + remainder);
        
    }
}