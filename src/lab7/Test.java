package lab7;

import java.util.Scanner;


public class Test{
	public static void main(String[] args) throws InsufficientBalanceException {
		Account account = new Account();
		Scanner scan = new Scanner(System.in);
		String res;

		System.out.println("Enter Account Number: ");
		account.setAccountNo(scan.nextLine());

		System.out.println("Desposite Amount: ");
		account.setBalance(scan.nextDouble());
		
		do {
			
				System.out.println("Withdraw Amount:  ");
				account.withdraw(scan.nextDouble());
				

				System.out.println("Do You Want to Continue  (yes/no):  ");
				res = scan.nextLine();

			} while (!"no".equals(res));
		
			scan.close();
		
			System.out.println("******************Summary*************");
			
			System.out.println("Availabale Amount: " + account.getBalance());
			
			System.out.println("**************************************");
	}
}
