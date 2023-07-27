/*Write a program to demonstrate method overloding with 3 
different parameters.*/

import java.io.*;
import java.awt.*;	
class DemoOverlodingMethod {
    public static int add(int a, int b){
        System.out.println("using method with two int parameters");
        return a+b;
   	 }
    public static double add(double a, double b, double c){
        System.out.println("using method with tree parametrs");
        return a+b+c;
  	  }
    public static String add(String str1 , String str2){
        System.out.println("add two string");
        return str1+str2;
   	 }
    public static void main(String[] args) {
        int a=10,b=26;
        double d1=23.4,d2=23.44, d3=442.4;
        String str1="wel", str2="come";

        int result =add(a,b);
        System.out.println("result for int addition= "+result);
        double result2=add(d1,d2,d3);
        System.out.println("Adding three double ="+result2);
        String result3=add(str1,str2);
        System.out.println("string addtion ="+result3);
    }
}
