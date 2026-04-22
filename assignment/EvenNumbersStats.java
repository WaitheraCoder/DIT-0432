public class EvenNumbersStats {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        // for loop from 1 to 100
        for (int i = 1; i <= 100; i++) {

            // check if number is even
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }

        // calculate average
        double average = (double) sum / count;

        // display results
        System.out.println("Sum of even numbers (1-100): " + sum);
        System.out.println("Count of even numbers: " + count);
        System.out.printf("Average of even numbers: %.2f\n", average);
    }
}