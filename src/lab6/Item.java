package lab6;

abstract public class Item implements  IPrint{

	protected  int itemNo;
	protected String name;
	protected double unitPrice;
	protected int qty;

	
	public Item(int itemNo, String name, double unitPrice, int qty) {
		
		this.itemNo = itemNo;
		this.name = name;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}
	
	abstract public void printLine();
	
	
	abstract   public void printDetails();
	  
	
}
/*
{
	System.out.println(itemNo +name+ +unitPrice+ +qty);
	
}
{
	System.out.println(itemNo);  
	System.out.println(name);  
	System.out.println(unitPrice);  
	System.out.println(qty);  
	  
  }*/