package lab4;

import java.lang.reflect.Field;

public class StudentApp {

	public static void main(String args[]) {
		Student s1 =  new  Student();
		Student s2 =  new  Student();
		Student s3 =  new  Student();
		Student s4 =  new  Student();
		Student s5 =  new  Student();
		

		//Student s6 =  new  Student();
		
		s1.setName("padula");
		s1.setDegree("BSC");
		s1.setMobile("07172690");
		
		s2.setName("Thisura");
		s2.setDegree("Dip");
		s2.setMobile("071585858");
		
		s3.setName("TRavidnu");
		s3.setDegree("Dsas");
		s3.setMobile("09985858");
		
		s4.setName("TRavidnu");
		s4.setDegree("Dsas");
		s4.setMobile("09985858");
		
		s5.setName("TRavidnu");
		s5.setDegree("Dsas");
		s5.setMobile("09985858");
		
		
		
		s1.print();
		System.out.println("--------------------------");
		s2.print();
		System.out.println("--------------------------");
		s3.print();
		System.out.println("--------------------------");
		s4.print();
		System.out.println("--------------------------");
		s5.print();
		
		
		
		
		
		
		
	}
}
