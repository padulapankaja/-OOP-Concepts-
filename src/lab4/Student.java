package lab4;


public class Student {

	private static int max  = 100;
	static int studentID = 0;
	private String name;
	private String degree;
	private String mobile;
	
	Student(){
		
		
		
	}
	
	/**
	 * @param studentID
	 * @param name
	 * @param degree
	 * @param mobile
	 */
	public Student( String name, String degree, String mobile) {
		
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}
	

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

	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	void print() {
		studentID++;
		System.out.println("Student ID: " +max+  +studentID);
		System.out.println("Degree : "+getDegree());
		System.out.println("Mobile : "+getMobile());
		
		
	}
	
	public static int getNextStudentID() {
		
		
		return 0;
	}

//public static int getRandomNumberInts(int min, int max){
//
//    Random random = new Random();
//    int ss = random.ints(min,(max+1)).findFirst().getAsInt();
//    System.out.println(ss);
//	return ss;
//}
	
}
