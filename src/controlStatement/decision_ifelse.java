package controlStatement;

public class decision_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = ("Firoza Akter");
		System.out.println("The student name is "  +  name);
		
	int s = 90;
	int m = 98;
	int e= 85;
	int g= 98;
	int so = 90;
	int total= 90+98+85+98+90;
	int ave= total/5;
	
	System.out.println("The total mark is " +total);
	System.out.println("the average mark is "+ave);
	
	if(ave>=90) {
	System.out.println("The grade is A+");	
	}
	else if(ave<=80 && ave>=70 ) {
		System.out.println("The grade is A");
		}
	else if(ave<=70 && ave>=60) {
	System.out.println("The grade is B");
	} else if(ave<=60 && ave>=50) {
		System.out.println("The grade is C");
	}else if(ave<=50 && ave>=40) {
		System.out.println("The grade is D");
	}else if(ave<=40 && ave>=30) {
		System.out.println("The grade is Fail");
		
	}
	}

}
