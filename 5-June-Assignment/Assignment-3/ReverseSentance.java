import java.io.*;
import java.awt.*;
class ReverseSentance {
    public static void main(String[] args) {
        String inputSentence = "Think Twice";
        String reversedSentence = reverseSentence(inputSentence);
        System.out.println("Original Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversed.append(reversedWord).append(" ");
        }

        // Remove the trailing space before returning the result
        return reversed.toString().trim();
    }
}
