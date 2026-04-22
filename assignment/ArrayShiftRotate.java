import java.util.Scanner;

public class ArrayShiftRotate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[6];

        // Input array elements
        System.out.println("Enter 6 integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Display original array
        System.out.println("\nOriginal Array:");
        printArray(arr);

        //RIGHT SHIFT 
        int[] shifted = new int[6];

        shifted[0] = arr[arr.length - 1]; // last element goes to front

        for (int i = 1; i < arr.length; i++) {
            shifted[i] = arr[i - 1];
        }

        System.out.println("\nArray after Right Shift (1 position):");
        printArray(shifted);

        //  LEFT ROTATE
        int[] rotated = new int[6];

        for (int i = 0; i < arr.length - 2; i++) {
            rotated[i] = arr[i + 2];
        }

        rotated[4] = arr[0];
        rotated[5] = arr[1];

        System.out.println("\nArray after Left Rotation (2 positions):");
        printArray(rotated);

        input.close();
    }

    // Helper method to print array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}