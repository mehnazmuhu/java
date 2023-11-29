package javabasic;

public class Reversehw_demo {
	
	static int number=345;
	 static int reversed;
	public static void number() {
		System.out.println(number);
	}
	
	 
	public static void reverse() {
		while(number>0) {
			
			int digit=number%10;
			
			System.out.print(digit);
			
			reversed=reversed*10+digit;
			
			number/=10;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Reversehw_demo rhw=new Reversehw_demo();
       rhw.number();
       rhw.reverse();
       
       

	}

}
