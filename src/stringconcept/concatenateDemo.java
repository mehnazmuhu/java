package stringconcept;

public class concatenateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String firstname="Firoza";
    String lastname=" Akter";
    
    String fullname=firstname.concat(lastname);
		
		System.out.println("Fullname is "+ fullname);
		
		
	//for Upper case
		
		String uppername=fullname.toUpperCase();
		System.out.println("My upper case name is "+uppername);
		
	//lower case
		String lowername=fullname.toLowerCase();
		System.out.println("My lower case name is "+lowername);
		
		//start with what letter
		boolean name=firstname.startsWith("s");
		System.out.println("name = "+name);
		//ends with letter
		boolean last=lastname.endsWith("r");
		System.out.println("name = "+last);
		
		//for character position
		char  position=firstname.charAt(2);
		System.out.println("position is " +position);
		//index of
		int pos=firstname.indexOf("r");
		System.out.println("the position of r is "+pos);
		
		//for space remove
		String s="     i    love  my country      ";
		String s1=s.trim();
		System.out.println(s);
		
		//for replace
		String R=firstname.replace("i", "e");
		System.out.println(R);
		
	}

}
