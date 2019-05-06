package lab3;

public class Test {

	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();
	
		s1.setName("padula");
		s1.setDitno(120);
		s1.setAddress("Uluvitike, Galle");
		//s1.display();
		
		System.out.println();
		
		s2.setName("Ravindu");
		s2.setDitno(60);
		s2.setAddress("Hapugala");
		//s2.display();
		
		s1.getDetails();
		System.out.println();
		
		
		s2.getDetails();
		
	}
	
}
