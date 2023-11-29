package encapsulation;

public class Sample_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sample_demo sd=new Sample_demo();
        
        sd.setName("Anika");
        System.out.println(sd.getName());
        
        sd.setAge(32);
        System.out.println(sd.getAge());
        
        sd.setCity("Virginia");
        System.out.println(sd.getCity());
	}

}
