
public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public Account() {
		System.out.println("Empty contructor called");
	}
	public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
	}
	public void withdrawal(double withdrawal) {
		if(this.balance - withdrawal < 0) {
			System.out.println("Only " + this.balance + " available. Withdrawal not processed");
		} else {
			this.balance -= withdrawal;
			System.out.println("Withdrawal of " + withdrawal + " processed. Remaining balance = " + this.balance);
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
}
