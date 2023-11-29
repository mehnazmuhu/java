package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String>name =new HashSet<>();
		Scanner s= new Scanner(System.in);
		
		for(int i=0;i< 4;i++) {
			name.add(s.next());
		}
		if(name.contains("firoza")) {
			System.out.println("Valid collection");
			
		}else {
			System.out.println("Invalid collection");
		}
		
	}

}
