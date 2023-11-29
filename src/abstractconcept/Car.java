package abstractconcept;

public class Car extends MotorisedVehicle implements IVehicle  {



@Override
public void drive() {
	// TODO Auto-generated method stub
	System.out.println("The car is on driving mode");
	
}

@Override
public void turnLeft() {
	// TODO Auto-generated method stub
	System.out.println("The car is turing left");
	
}

@Override
public void brake() {
	// TODO Auto-generated method stub
	System.out.println("The car is in brake mode");
	
}


}
