package javabasic;

import java.util.Scanner;

public class Scannerstringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		
		
		System.out.println("Enter the frist name" );
		String name=s.nextLine();
		String first1="Firoza";    
		
		
		System.out.println("Enter the last name");
		String last=s.nextLine();
		String last1 ="Akter";
		
		
		System.out.println("My fullname is " + first1  +last1);
		}
	}


