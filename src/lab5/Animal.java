package lab5;

abstract public class Animal {

	private String name;
	 public Animal() {             System.out.println("Animal constructor called");      } 
	  

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	abstract public String speak();
		
				
	
	
	public void display() {
		System.out.println("My name is " + this.name + ". " + this.speak() + ".");
	}
}
