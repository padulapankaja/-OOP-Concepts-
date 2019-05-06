package lab2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double input ;
		Scanner scan =  new Scanner(System.in);
		EvenOddNumber evenorodd = new EvenOddNumber();
		System.out.println("Enter Number: ");
		input = scan.nextDouble();
		scan.close();
		
		evenorodd.findEvenOrOdd(input);
		
		
		

	}

}
