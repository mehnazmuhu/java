package arrayconcept;

import java.lang.reflect.Array;

public class Arraryeven {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		int [] number=new int [5];
	number [0]=10;
	number[1]=25;
	number[2]=40;
	number[3]=22;
	number[4]=35;
	
	
	
	for (int i =0;i<number.length;i++) {
		
		if(number[i]%2==0)
		System.out.println(number[i]);	
		
	}
		
	}

}
