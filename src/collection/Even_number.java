package collection;

import java.util.ArrayList;
import java.util.List;

public class Even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>evenNumber=new ArrayList<>();
		for(int i=2;i<20;i+=2) {
			evenNumber.add(i);
		}
		
		System.out.println("Even numbers collection is :" +evenNumber);
	}

}
