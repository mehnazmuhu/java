package arrayconcept;

import java.util.Scanner;

public class ArrrayStringmyself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub      
	Scanner s =new Scanner(System.in);           
		                                         
		String[]names=new String [2];             
		
       System.out.println("Enter the array size");
		
		int length=names.length;
		System.out.println("String array length is : " + length);
		
		System.out.println("Enter the name");
		                                           
		for(int i=0;i<2;i++) {                     
			names[i]=s.nextLine();
		}
	
		for(int q=0;q<names.length;q++) {
			
		}
			System.out.println("The length of name firoza is : " + names[0].length());
		     System.out.println("The length of name akter is : "+ names[1].length());
		
		
	}

}
