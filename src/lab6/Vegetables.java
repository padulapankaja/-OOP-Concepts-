package lab6;

public class Vegetables  extends Item{

	private boolean organic;
	private int calories ;
	
	public Vegetables(int itemNo, String name, double unitPrice, int qty, boolean b, int calories) {
		super(itemNo, name, unitPrice, qty);
		this.organic = b;
		this.calories = calories;
	}

	@Override
	public void printLine() {
		System.out.println(itemNo +name+ +unitPrice+ +qty+  organic + +calories);
		
	}

	@Override
	public void printDetails() {
		System.out.println(itemNo);  
		System.out.println(name);  
		System.out.println(unitPrice);
		System.out.println(qty);
		System.out.println(organic);
		System.out.println(calories);
		
	}
	
	
}
