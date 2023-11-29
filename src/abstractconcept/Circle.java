package abstractconcept;

public class Circle extends Shape{

	

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		double r=5.0;
		double area=(3.14*r*r);
		System.out.println("The area of circle is " +area);
	}
}