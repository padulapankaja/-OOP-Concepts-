package lab7;

import java.util.Scanner;


public class BankDemo {
	public static void main(String[] args) {
		Account account = new Account();
		Scanner scan = new Scanner(System.in);
		String res;

		//System.out.println("Enter Account Number: ");
		account.setAccountNo("123");
		
		
		System.out.println("Desposite Amount: ");
		account.setBalance(scan.nextDouble());
		
		do {

			
			try {

				System.out.println("Withdraw Amount:  ");
				account.withdraw(scan.nextDouble());
		
				} 
			catch (InsufficientBalanceException e) {
				//System.out.println("Sorry your account balance is " + e.getAmount());
				e.printStackTrace();
				
			}
			
			System.out.println("Do You Want to Continue  (yes/no):  ");
			res = scan.nextLine();
		} while (!"no".equals(res));
		
		System.out.println("******************Summary*************");
		
		System.out.println("Availabale Amount: " + account.getBalance());
		
		System.out.println("**************************************");

	}
}
