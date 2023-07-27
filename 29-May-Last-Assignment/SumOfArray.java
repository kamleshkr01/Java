/*Write a java program to calculate the sum of all element  in an
 integer array? */

import java.io.*;
import java.awt.*;
class SumOfArray {
     public static void main(String[] args) {
      int[] numbers = { 12, 25, 28, 12, 13, 7 }; // Sample integer array
        int sum = 0;
        	   for (int number : numbers) {
            sum += number;
     	   }
         System.out.println("Sum of array elements: " + sum);
    }
}
