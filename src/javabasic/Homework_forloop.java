package javabasic;

public class Homework_forloop {
	
	
	public void count() {
		for(int i=1;i<=10;i++){
		System.out.println(i);	
		}
	}
	
	public void reverse() {
		for(int j=10;j>=1;j--) {
			System.out.println(j);
		}
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Homework_forloop hl = new Homework_forloop();
		hl.count();
		hl.reverse();
		
		
	}

}
