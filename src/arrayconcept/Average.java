package arrayconcept;

public class Average {
	public static void main (String[]args) {
		
	int []numbers= {10,20,25,30,35,40};
	int sum = 0;
	double average;
	
	for (int i=0;i<numbers.length;i++) {
		sum=sum+numbers[i];
	}
	average=sum/numbers.length;
	System.out.println(average);
		
	}
	
}

