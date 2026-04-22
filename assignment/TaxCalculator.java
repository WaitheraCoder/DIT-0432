import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Accept inputs
        System.out.print("Enter gender (M/F): ");
        char gender = input.next().toUpperCase().charAt(0);

        System.out.print("Enter monthly salary: ");
        double salary = input.nextDouble();

        double taxRate = 0;
        double taxAmount;
        double netSalary;

        // Nested if-else structure
        if (gender == 'M') {

            if (salary < 30000) 
                taxRate = 0.10;
             else 
                taxRate = 0.15;
            

        } 
        else if (gender == 'F') {

            if (salary < 25000) 
                taxRate = 0.08;
             else 
                taxRate = 0.12;
            

        } 
        else {
            System.out.println("Invalid gender input!");
            input.close();
            return;
        }

        // Calculations
        taxAmount = salary * taxRate;
        netSalary = salary - taxAmount;

        // Display results
        System.out.println("\n==========---     Tax Details   ---========");
        System.out.println("Gender: " + gender);
        System.out.printf("Salary: %.2f\n", salary);
        System.out.printf("Tax Amount: %.2f\n", taxAmount);
        System.out.printf("Net Salary: %.2f\n", netSalary);

    }
}
