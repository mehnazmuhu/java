package arrayconcept;

import java.util.Scanner;

public class ArraryStringhomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the array siza");
		
		String[]names =new String[2];
		
		int length=names.length;
		System.out.println("String array length is : " + length);
		
		System.out.println("Enter the name");
		
		for(int i=0;i<names.length;i++) {
			System.out.print(i+1+" .Enter name : ");
			names[i]=s.nextLine();
		}
	
		for(int j=0;j<names.length;j++) {
			System.out.print("Name : " + names[j]);
			System.out.println(" - name length is : "+ names[j].length());
		}
		
		

	}

}
