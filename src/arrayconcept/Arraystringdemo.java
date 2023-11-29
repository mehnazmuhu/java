package arrayconcept;

import java.util.Scanner;

public class Arraystringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []names={"firoza","akter","sharmin","muhu","shahi"};
		
		int length=names.length;
		
		System.out.println("String array length is : " + length);
	
		for(int i=0;i<length;i++) {
			System.out.println(names[i]);
			
		}
		for(int i=0;i<length;i++) {
			System.out.println("Length["+i+"] = " +names[i].length());
			
		}
		
		
		
		
	}
	}


