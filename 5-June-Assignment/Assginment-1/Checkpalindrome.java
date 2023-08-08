/*Write a java program to know whether the given String is palindrome. */
import java.io.*;
import java.awt.*;
import java.util.Scanner;

class CheckPalindrome {
	public static void main(String args[]) {
		String original, reverse = ""; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check palindrome= ");
		original = sc.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("String is a palindrome.");
		else
			System.out.println("String isn't a palindrome.");
	}
}