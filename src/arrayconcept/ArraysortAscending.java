package arrayconcept;

public class ArraysortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []number= {21,22,35,65,80};

int tem=0;
     
for (int i=0;i<number.length;i++) {
	for(int j=i+1;j<number.length;j++) {
		if(number[i]>number[j]) {
			tem=number[i];
			number[i]=number[j];
			number[j]=tem;
		}
	}
	System.out.println(number[i]);
}

	}

}
