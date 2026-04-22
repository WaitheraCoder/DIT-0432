import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Accept number input
        System.out.print("Enter a number (1 - 7): ");
        int day = input.nextInt();

        String dayName;

        // Switch statement
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input! Please enter a number between 1 and 7.";
        }

        // Output result
        System.out.println("Result: " + dayName);

    }
}