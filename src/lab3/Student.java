package lab3;

public class Student extends Person {

	
	private int ditno;
	
	public Student() {
		}
	public Student( int ditno) {
		
		
		this.ditno = ditno;
	
	}
	
	public int getDitno() {
		return ditno;
	}

	public void setDitno(int ditno) {
		this.ditno = ditno;
	}

	
	public void getDetails()
	{
		System.out.println("I am a Student");
		System.out.println("My name is " +getName());
		System.out.println("I am from  " +getAddress());
		System.out.println("My Id number is  " +getDitno());
	}
	
}
