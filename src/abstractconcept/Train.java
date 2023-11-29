package abstractconcept;

public class Train implements IVehicle,IPublicTransport {

	@Override
	public void getNumberofPeople() {
		// TODO Auto-generated method stub
		System.out.println("Every day 100 number of people get in the car");
		
	
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("The train is on driving mode");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("The train is turing left");
		
		
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("The train is in brake mode");
		
		
	}

}
