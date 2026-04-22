import java.util.Scanner;

public class LinearSearchDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Given array
        int[] numbers = {23, 45, 12, 67, 34, 89, 56, 78, 90, 33};

        // Accept search key
        System.out.print("Enter number to search: ");
        int key = input.nextInt();

        int index = -1;
        int comparisons = 0;

        // Linear search
        for (int i = 0; i < numbers.length; i++) {

            comparisons++; // count every comparison

            if (numbers[i] == key) {
                index = i;
                break; // stop at first occurrence
            }
        }

        // Output results
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("Total comparisons made: " + comparisons);

    }
}