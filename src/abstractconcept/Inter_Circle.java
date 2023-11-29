package abstractconcept;

public class Inter_Circle implements Interface_Shape {
	double radius=5.0;
   double area;
   double volume;
	@Override
	public double calculationArea() {
		// TODO Auto-generated method stub
		double area=3.14*radius*radius;
		return 0;
	}

	@Override
	public double calculationVolume() {
		// TODO Auto-generated method stub
		double volume=(4/3)*3.14*radius*radius*radius;
		return 0;
	}

}
