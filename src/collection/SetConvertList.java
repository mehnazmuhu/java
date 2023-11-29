package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetConvertList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s=new HashSet<>();
		s.add(20);
		s.add(30);
		s.add(15);
		s.add(35);
		
		List<Integer>l=new ArrayList<>(s);
		System.out.println(l);
		System.out.println(l.get(2));
		
		
		
		
	}

}
