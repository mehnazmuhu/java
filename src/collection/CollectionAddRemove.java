package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionAddRemove {
	
	//Input will be...firoza akter mehnaz, sharmin shahi
//	ArrayList<String> List = new ArrayList<>() {
	// List.add("Firoza");
//	 List.add("Rumana");
	// List.add("Anika");
	// List.add("Sanjida");
	// List.add("Kamrun");
	// List.add("Syeda");
	
	
	
	public static ArrayList<String> CollectionAdd(){
		//Scanner s=new Scanner(System.in);
		
		ArrayList<String>al=new ArrayList<>();
		for(int i=1;i<=5;i++) {
			//al.add(s.next());
		}
		return al;
	}
	public static ArrayList<String>Removename(){
		ArrayList <String>arl=new ArrayList<>();
		arl.addAll(CollectionAdd());
		arl.remove(2);
		return arl;
		
	}
  public static void main(String[]args) {
	  
	  ArrayList a=CollectionAddRemove.CollectionAdd();
	  System.out.println(a);
	  ArrayList a1=CollectionAddRemove.Removename();
	  System.out.println(a1);
  
  }
}
	  
