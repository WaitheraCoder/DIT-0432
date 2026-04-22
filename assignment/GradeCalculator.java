import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        // Input setup
        Scanner input = new Scanner(System.in);

        // Accept student's marks
        System.out.print("Enter student's marks (0 - 100): ");
        int marks = input.nextInt();

        // Validate input first
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } 
        else {
            String grade;
            String remark;

            // if-else if ladder
            if (marks >= 70) {
                grade = "A";
                remark = "Excellent";
            } 
            else if (marks >= 60) {
                grade = "B";
                remark = "Very Good";
            } 
            else if (marks >= 50) {
                grade = "C";
                remark = "Good";
            } 
            else if (marks >= 40) {
                grade = "D";
                remark = "Pass";
            } 
            else {
                grade = "E";
                remark = "Fail";
            }

            // Output results
            System.out.println("\nGrade: " + grade);
            System.out.println("Remark: " + remark);
        }
    }
}
