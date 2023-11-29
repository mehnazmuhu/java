package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List <Integer> list=new ArrayList<>();
     
     list.add(20);
     list.add(15);
     list.add(23);
     list.add(30);
       
     Collections.sort(list);
     System.out.println("List after the use of " +list);
     
Collections.reverseOrder();
     
	}

}
