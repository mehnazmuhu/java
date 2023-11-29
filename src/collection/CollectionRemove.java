package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionRemove {
	
	public static List removeMultipleofThree(){
		
		List<Integer>number=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			if((i+1)%3!=1)
				number.add(i);
		}
		return number;
			}
	public static void main(String[]args) {
			
		List l=CollectionRemove.removeMultipleofThree();
		        
				System.out.println(l);
	}

}
