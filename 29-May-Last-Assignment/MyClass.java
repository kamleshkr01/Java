/*Write a program to create an object of an class which contain a 
method and call that class method in main method*/
import java.io.*;
import java.awt.*;
public class MyClass {
    // A simple method in the class
    public void myMethod() {
        System.out.println("This is myMethod() inside MyClass.");
    }

    // Main method to start the program
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass myObject = new MyClass();

        // Call the method of MyClass using the object
        myObject.myMethod();
    }
}
