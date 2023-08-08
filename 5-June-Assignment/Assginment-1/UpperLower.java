import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String convertedString = convertCase(input);

        System.out.println("Converted String: " + convertedString);
    }

    public static String convertCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                // Convert upper case to lower case
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                // Convert lower case to upper case
                result.append(Character.toUpperCase(ch));
            } else {
                // Leave non-letter characters unchanged
                result.append(ch);
            }
        }

        return result.toString();
    }
}
