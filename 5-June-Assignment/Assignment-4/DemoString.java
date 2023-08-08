/*write a simple String program to take input from user  */
import java.util.Scanner;

public class DemoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        // Read the user's input as a string
        String userInput = scanner.nextLine();
              
        // Display the user's input back on the console
        System.out.println("You entered: " + userInput);
    }
}
