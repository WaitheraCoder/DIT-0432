import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Generate random number between 1 and 50
        int secretNumber = (int)(Math.random() * 50) + 1;

        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 50!");

        // while loop runs until correct guess
        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } 
            else if (guess < secretNumber) {
                System.out.println("Too low!");
            } 
            else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        // Display total attempts
        System.out.println("Total attempts: " + attempts);
        
    }
}