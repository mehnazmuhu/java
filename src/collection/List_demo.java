package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>l=new ArrayList<Integer>();
		l.add(20);
		l.add(25);
		l.add(15);
		l.add(30);
		l.add(40);
		for(int i=1;i<l.size();i++) {
		
		
		System.out.println(l.get(i));
		}
		System.out.println(l.get(2));
		
		
		
		Iterator<Integer>it=l.iterator();
       while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
