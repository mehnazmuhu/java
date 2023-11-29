package arrayconcept;

public class Arraymulty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]numbers= {{1,2,4,6},{5,7,8,9},{11,12,14,16}};
		
		for (int row=0;row<numbers.length;row++) {
			for(int colum=0;colum<numbers[0].length;colum++) {
				System.out.print(numbers[row][colum] +" ");
				
			}
			System.out.println();
		}
		
	}

}
