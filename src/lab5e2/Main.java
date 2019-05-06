/**
 * 
 */
package lab5e2;

/**
 * @author User
 *
 */
public class Main {

	public static void main(String[] args) {
		ICompute ob1 = new Person("Danushka", 40000, 1000, 5);
		ob1.calculate();
		ob1.display();
		ob1.mytets();
		ob1.rate(5); //5
		System.out.println("-------------------------");
		
		ICompute ob2  = new Box(10, 20, 30);
		ob2.calculate();
		ob2.display();
		ob2.mytets();
		ob2.rate(5); //2

	System.out.println("************************************");

		
		
	
	
	}

	
	
}
