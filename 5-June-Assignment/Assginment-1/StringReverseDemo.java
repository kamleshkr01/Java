/*Write a java program to Reverse a string without using the
 inbuilt method?*/
import java.io.*;
import java.awt.*;

class DemoString {
	public static void main(String args[]) {
		String str = "Welcome";
		String reverse=" ";

		for (int i = str.length() - 1; i >=0; i--) {
			char chaar = str.charAt(i);
			reverse = reverse + chaar;
		}
		System.out.println(reverse);
	}
}
