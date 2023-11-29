package javabasic;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("Enter your name");
      String name=s.nextLine();
      System.out.println("Enter the value of a");
      int a=s.nextInt();
      System.out.println("Enter the value of b");
     int b =s.nextInt();
      
    
      System.out.println("This program is done by " + name);
      System.out.println("The sum of a and b is " +(a+b));
      
	}

}
