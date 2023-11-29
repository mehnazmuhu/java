package stringconcept;

public class StringDemo {

	public static void main(String[] args) {
		
       String name="firoza";
       String s="Firoza";
       
         //for character or array
       char[]arr=name.toCharArray();
       for(int i=0;i<arr.length;i++) {
    	   System.out.println(arr[i]+" ");
       }
		//for length
       int len=name.length();
       System.out.println("length of the name is ="+len);

    //for equal
      if(name.equals(s)) {
    	  System.out.println("equals");
      }
      else {
    	  System.out.println("not equals");
      }
      //another way
      if(name.equalsIgnoreCase(s)) {
    	  System.out.println("equals");
      }
      else {
    	  System.out.println("not equals");
      }
      //for contain
      boolean con=name.contains("akter");
      System.out.println(con);
      
      //for empty 
      boolean b=name.isEmpty();
      System.out.println("b = "+b);
      
	}

}
