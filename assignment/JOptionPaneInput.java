import javax.swing.JOptionPane;

class JOptionPaneInput{
    public static void main(String[] args) {
         //Get user favorite food
        String food = JOptionPane.showInputDialog("Enter your favorite food:");


        // Get user favorite color
        String color = JOptionPane.showInputDialog("Enter your favorite color:");


        // Display the result
        JOptionPane.showMessageDialog(null,
                "Your favorite food is " + food + " and favorite color is " + color);
    }
}