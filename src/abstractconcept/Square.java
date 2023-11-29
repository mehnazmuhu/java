package abstractconcept;

public class Square extends Shape{

	

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		double length=4.0;
		double area=length*length;
		System.out.println("the area of square is "+ area);
	}

}
