/*writ a  program in java  to delete all consonants  from the s
tring "Hello, have a good day" */
public class DeletConst {
    public static void main(String[] args) {
        String input = "Hello, have a good day";
        String result = deleteConsonants(input);
        
        System.out.println("Original string: " + input);
        System.out.println("String after deleting consonants: " + result);
    }
    
    public static String deleteConsonants(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch) || Character.isWhitespace(ch) || ch == ',') {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
