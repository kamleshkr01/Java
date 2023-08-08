import java.util.Arrays;

public class ShortString {
    public static void main(String[] args) {
        String inputString = "kjihgfedcba";
        String sortedString = sortAlphabetically(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);
    }

    public static String sortAlphabetically(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
