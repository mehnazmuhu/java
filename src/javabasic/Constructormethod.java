package javabasic;

public class Constructormethod {
	
	int a;
	int b;//global variable
	
	
	public Constructormethod(int a,int b) {//parameter variable
	this.a=a;
	this.b=b;
	}
	
	
	public void add() {
		System.out.println(a+b);
	}
	public void sub() {
		System.out.println(a-b);
	}
	public void multy() {
		System.out.println(a*b);
	}
	public void div() {
		System.out.println(a/b);
	}
	
	 public static void main(String[] args) {
		 Constructormethod cb=new Constructormethod(3,3);
		 Constructormethod cb1=new Constructormethod(6,3);
		 Constructormethod  cb2=new  Constructormethod(3,3);
		 Constructormethod cb3=new Constructormethod (6,3);
		 cb.add();
		 cb1.sub();
		 cb2.multy();
		 cb3.div();
	   
	
	 }

}
