/*Write a java program to find to index of a specific 
element in an integer array? */
import java.io.*;
import java.awt.*;
class ElementIndex {
   	public static void main(String[] args) {
      	    int[] numbers = { 4, 2, 7, 1, 9, 5 };
               int target = 7;
               int index = findElementIndex(numbers, target);
        	   if (index != -1) {
             System.out.println("Element " + target + " found at index: " + index);
      	  } else {
          	  System.out.println("Element " + target + " not found in the array.");
       	        }
    	}
public static int findElementIndex(int[] arr, int target) {
       	 for (int i = 0; i < arr.length; i++) {
           	 if (arr[i] == target) {
                return i; // Return the index where the element is found
            }
        }
        return -1; // Return -1 if the element is not found in the array
    }
}
