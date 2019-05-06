package lab6e2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int maxSubjects;
		int[] marks = new int[8];
		int total = 0;
		double avg = 0;

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Input Number of Subjects: ");
			maxSubjects = scan.nextInt();

			for (int i = 1; i <= maxSubjects; i++) {
				System.out.println("Input Marks for Subject: " + (i));
				marks[i] = scan.nextInt();
				total += marks[i];
			}
			
			
			 avg = ((double) total / maxSubjects);
			
			 for (int i = 1; i <= maxSubjects ; i++) {
			 System.out.println("Marks for  Subject " +i+ " : "  +marks[i]);
			
			 }
			
			 System.out.println("****************");
			 System.out.println("Total Mark is  " +total);
			 System.out.println("Average Mark is  " +avg);
			 System.out.println("*****************");
			 System.out.println(maxSubjects);

			 
			
			
			

			
		} catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

	

}
