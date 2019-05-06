package lab7;

public class Account {
	
	private String accountNo;
	private double balance;
		
	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}
	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
   public Account() {}
		
		
	
	public Account(String accountNo, double balance) {
		
		this.accountNo = accountNo;
		this.balance = balance;
	}
	void deposite(double amount) {
		balance += amount;
		
	}
	void withdraw(double amounts) throws InsufficientBalanceException {
		
				if(balance < amounts)
				{
					System.out.println("Your account balance is low");
					
				}
				
				else {
				balance -= amounts;
				System.out.println("You Succesfully widthraw  " +amounts);
				//System.out.println("Available balance  " +balance);
		
				
				}
		
		
				throw new InsufficientBalanceException(amounts);
	}

}
