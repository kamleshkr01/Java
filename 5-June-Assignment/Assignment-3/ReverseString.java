/*Write a program to reverse a string.
Input: “PWSKILLS” */
public class ReverseString {
    public static void main(String[] args) {
        String inputString = "PWSKILLS";
        String reversedString = reverseString(inputString);
        System.out.println("Original tring: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
