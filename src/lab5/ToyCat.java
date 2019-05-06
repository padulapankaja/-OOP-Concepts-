package lab5;

public class ToyCat  extends Cat{

	String manufacturer;
	 public ToyCat() {      
		 System.out.println(" ToyCat() constructor called");      
		 } 
	
		
		
	
	  public void display()
	  {      super.display();      
	  System.out.println("I am from " + manufacturer + ".");   
	  } 
	
	
}
