import javax.swing.JOptionPane;

public class NumberOperations {
    public static void main(String[] args) {

        //Accept input as Strings
        String firstNumber = JOptionPane.showInputDialog("Enter first number:");
        String secondNumber = JOptionPane.showInputDialog("Enter second number:");

        //Convert Strings to integers
        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);

        //Perform calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int divide = num1 / num2;

        // Avoid division by zero
        System.out.println("=== ARITHMETIC CALCULATOR ===");
        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Product: "+product);
        System.out.println("Quotient: "+divide);
    
    }
}
