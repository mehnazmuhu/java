package javabasic;

public class Student {
	int a=10;
	int b=15;
	int c=20;
	int d=25;
	int e=30;
	int total;
	int ave;
	
	public int total() {
		 total= a+b+c+d+e;
		return total;
		
	}
	
	public int ave() {
		int ave=  total/5;
		return ave;
	}
	public void SumoddorEven() {
		if( total%2==0) {
			System.out.println("Total is a even");
		}
		else{
			System.out.println("Total is an odd");
		}
	}
	
	public void aveEvenorOdd() {
		if(ave%2==0) {
		System.out.println("ave is a even");	
		}
		else {
			System.out.println("ave is an odd");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s=new Student();
		int total=s.total();
		int ave=s.ave();
		s.SumoddorEven();
		s.aveEvenorOdd();
		System.out.println(total);
		System.out.println(ave);
		
		
		
		

	}

}
