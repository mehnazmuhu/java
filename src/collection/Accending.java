package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Accending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>l=new ArrayList<>();
		
		l.add(4);
		l.add(2);
		l.add(5);
	    l.add(1);//int[] a={4,2,5,1}
	    
	   //convert list to array 
	     int[]arr=new int[l.size()];
          
       for(int i=0;i<l.size();i++) {
      	arr[i]=l.get(i);
 }
        System.out.println(Arrays.toString(arr));
        
        //ascending number
        for(int i=0;i<arr.length;i++) {
        	for(int j=i;j<arr.length;j++) {
        		
        		int tem;
        		if(arr[i]>arr[j]) {
        			tem=arr[i];
        			arr[i]=arr[j];
        			arr[j]=tem;
        		}
        	}
        }
        for(int a:arr){
            System.out.println(a);
        }
  
	}

}
