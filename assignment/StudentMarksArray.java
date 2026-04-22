import java.util.Scanner;

public class StudentMarksArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array for 8 students
        int[] marks = new int[8];

        int sum = 0;
        int highest;
        int lowest;

        int passCount = 0;
        int failCount = 0;

        // Input marks
        System.out.println("Enter marks for 8 students:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        // Initialize highest and lowest
        highest = marks[0];
        lowest = marks[0];

        // Process array20
        for (int i = 0; i < marks.length; i++) {

            sum += marks[i];

            // Highest mark
            if (marks[i] > highest) {
                highest = marks[i];
            }

            // Lowest mark
            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            // Pass / fail count
            if (marks[i] >= 50) {
                passCount++;
            } else {
                failCount++;
            }
        }

        // Average
        double average = (double) sum / marks.length;

        // Output results
        System.out.println("\n--- Results ---");
        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        System.out.println("Sum of Marks: " + sum);
        System.out.printf("Average Marks: %.2f\n", average);
        System.out.println("Number of Students Passed: " + passCount);
        System.out.println("Number of Students Failed: " + failCount);

        // Reverse order display
        System.out.println("\nMarks in Reverse Order:");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i] + " ");
        }
    }
}