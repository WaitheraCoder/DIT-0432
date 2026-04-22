import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        
        // Create scanner object for user input
        Scanner input = new Scanner(System.in);

        // Accept radius from user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Perform calculations
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        // Display results with 2 decimal places
        System.out.printf("\nResults:\n");
        System.out.printf("Diameter: %.2f\n", diameter);
        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Area: %.2f\n", area);
    }
}
