package abstractconcept;

public class Vehicle_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car c=new Car();
		c.brake();
		c.checkMotor();
		c.drive();
		
		
		Train t =new Train();
		t.brake();
		t.drive();
		t.turnLeft();
		t.getNumberofPeople();
	}

}
