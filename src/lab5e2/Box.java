package lab5e2;

public class Box implements ICompute {
	private int length, width, height;
	private int volume;
	
	
	
	/**
	 * @param length
	 * @param width
	 * @param height
	 */
	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		//System.out.println("Box default constructor");
	}
	@Override
	public void calculate() {
		volume = length * width * height;
		
	}
	@Override
	public void display() {
		System.out.println("Volume is " +volume);
		
	}
	@Override
	public void mytets() {
		System.out.println("This is test method for box");
		
	}
	@Override
	public int rate(int number) {
		int ans =  number *2;
		System.out.println(ans);
		return  ans;
	}
}
