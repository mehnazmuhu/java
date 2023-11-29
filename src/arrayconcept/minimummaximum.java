package arrayconcept;

public class minimummaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers= {12,25,20,45,30};
	int minimum= numbers[0];
	for(int i=0;i<numbers.length;i++) {
		
		if (numbers[i]<minimum) {
			
			minimum=numbers[i];
		}
	}
		
	
		
	int maximum = numbers[0];
	for(int i=0;i<numbers.length;i++) {
		if (numbers[i]>maximum) {
			maximum =numbers[i];
		}
	}
		System.out.println(maximum);
		System.out.println(minimum );
	}

}
