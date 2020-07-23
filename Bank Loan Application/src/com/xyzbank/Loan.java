package com.xyzbank;

public class Loan extends Account {
	
	private String loanId;
	private String loanType;
	private double loanAmount;
	public double amount;
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
		
	public Loan() {
		super();
	}
	public Loan(String loanId, String loanType, double loanAmount) {
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
	}
	public void getLoan(double lAmt, double oldBal, Account a) {
		a.setDepositAmount(lAmt+oldBal);
		System.out.println("Your Loan Approved");
		System.out.println("Loan Successfully credited to your Account");
	}
	
	public void showLoanDetails(Loan l) {
		System.out.println("Loan ID: " +l.getLoanId());
		System.out.println("Loan Type: " +l.getLoanType());
		System.out.println("Loan Amount: "+l.getLoanAmount());
		
	}

}
