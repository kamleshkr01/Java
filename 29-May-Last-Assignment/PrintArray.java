//Write a java program to print an entire array?

public class PrintArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Call the method to print the entire array
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after all elements are printed
    }
}
