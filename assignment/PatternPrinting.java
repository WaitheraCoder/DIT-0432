public class PatternPrinting {
    public static void main(String[] args) {

        System.out.println("Pattern 1:");

        // Pattern 1: Increasing stars
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\nPattern 2:");

        // Pattern 2: Decreasing stars
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}