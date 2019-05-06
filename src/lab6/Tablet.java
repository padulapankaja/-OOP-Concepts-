package lab6;

public class Tablet extends Item {

	private String brand;
	private String model;
	private String camera;
	/**
	 * @param itemNo
	 * @param name
	 * @param unitPrice
	 * @param qty
	 * @param brand
	 * @param model
	 * @param camera
	 */
	public Tablet(int itemNo, String name, double unitPrice, int qty, String brand, String model, String camera) {
		super(itemNo, name, unitPrice, qty);
		this.brand = brand;
		this.model = model;
		this.camera = camera;
	}
	@Override
	public void printLine() {
		System.out.println(itemNo +name+ +unitPrice+ +qty);
		
	}
	@Override
	public void printDetails() {
		System.out.println(itemNo);  
		System.out.println(name);  
		System.out.println(unitPrice);  
		System.out.println(qty);  
	}
	

	
}
