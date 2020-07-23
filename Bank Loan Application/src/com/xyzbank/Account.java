package com.xyzbank;


public class Account { 
	
	private String accountId;
	private String accountName;
	private String address;
	private double depositAmount;
	
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	
		
	public Account() {
		super();
	}
	public Account(String accountId, String accountName, String address, double depositAmount) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.address = address;
		this.depositAmount = depositAmount;
	}
	
	/*
	 * Account account[] = { new Account("1111111-AAAA", "Sugumar", "Chennai",
	 * 5000.00), new Account("2222222-BBBB", "Ashik", "Coimbatore", 5000.00), new
	 * Account("3333333-cccc", "Koushika", "Thirumala", 5000.00), new
	 * Account("4444444-DDDD", "Sri", "Hyderabad", 5000.00), new
	 * Account("5555555-EEEE", "Mansoor", "Hyderabad", 5000.00), new
	 * Account("6666666-FFFF", "Haresh", "Chennai", 5000.00), new
	 * Account("7777777-GGGG", "Kicha", "Kolkata", 5000.00), new
	 * Account("8888888-HHHH", "Dhanush", "Pune", 5000.00), new
	 * Account("9999999-IIII", "Bharath", "Trichy", 5000.00), new
	 * Account("0000000-JJJJ", "Ramya", "Saelam", 5000.00) };
	 * 
	 * ArrayList<Account> accounts = new ArrayList<Account>(Arrays.asList(account));
	 */
	
	public Account getDetails(String id, Account accounts[]) {
		for(Account  account : accounts) {
			if((account.getAccountId()).equals(id)) {
				return account;
			}
		}		
		return null;		
	}
	
	public boolean showDetails(String id, Account accounts[]) {
		for(Account  account : accounts) {
			if((account.getAccountId()).equals(id)) {
				System.out.println("Account ID: "+account.getAccountId());
				System.out.println("Account Name: "+account.getAccountName());
				System.out.println("Address: "+account.getAddress());
				System.out.println("Balance Amount: "+account.getDepositAmount());
				return true;
				}
			}
		return false;
	}
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", address=" + address
				+ ", depositAmount=" + depositAmount + "]";
	}
	
	
	
	

}
