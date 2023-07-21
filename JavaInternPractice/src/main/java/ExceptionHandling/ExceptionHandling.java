package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting program.........");
       try{
           System.out.println("enter a numerator");
           int n1 = sc.nextInt();
           System.out.println("enter a denomenotor");
           int n2 = sc.nextInt();
           int result = n1/n2;
           System.out.println("result is "+result);
       }
       catch (java.lang.Exception e){
           System.out.println(e.getMessage());
       }
       //finally is always executed
       finally {
           System.out.println("Continue the program");
       }
        System.out.println("end of program...");
    }
}
