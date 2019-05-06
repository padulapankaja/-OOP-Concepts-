package lab5e2;

public class Person implements ICompute{
	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;
	/**
	 * @param name
	 * @param basicSal
	 * @param otRate
	 * @param otHrs
	 * @param netSal
	 */
	public Person(String name, double basicSal, double otRate, double otHrs) {
		
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
		
		//System.out.println("person default constructor");
		
	}
	@Override
	public void calculate() {
		netSal = basicSal + (otHrs * otRate);
		
	}
	@Override
	public void display() {
		System.out.println("Net Salary is  " +netSal);
		
	}
	@Override
	public void mytets() {
		System.out.println("My test Method for Person");
		
	}
	@Override
	public int rate(int number) {
		int ans =  number * 5;
		System.out.println(ans);
		return  ans;
	}
	
}
