package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>ls=new ArrayList<>();
		
		ls.add(15);
		ls.add(10);
		ls.add(25);
		ls.add(15);
		ls.add(30);
		ls.add(10);
		System.out.println("Arraylist with duplicate :" +ls);
		
		Set<Integer>s=new HashSet<>(ls);
		System.out.println("Arraylist after remove duplicate :" +s);
		
		
		

	
}

}