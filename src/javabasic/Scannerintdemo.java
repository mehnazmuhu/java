package javabasic;

import java.util.Scanner;

public class Scannerintdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		

		
		System.out.println("Enter the value of a");
	   int a = s.nextInt();
	   
	
	   System.out.println("Enter the value of b");
	   int b = s.nextInt();
	  
		int add=(a+b);
	    int sub=(a-b);
	    int multy =(a*b);
	    int div =(a/b);
	   
		
	   System.out.println("The value of add is " + add);
	   System.out.println("The value of sub is " + sub);
	   System.out.println("The value of multy is " + multy);
	   System.out.println("The value of div is " + div);
	}

	}


