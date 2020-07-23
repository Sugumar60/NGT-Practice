package com.xyzbank;


public class Transaction extends Loan {
	
	private double amount;

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	public double depositAmount(double damt, double oldbal) {
		amount = damt + oldbal;
		return  amount;
	}
	
	public double withdrawAmount(double wamt, double oldbal) {
		amount = oldbal - wamt;
		return amount;
	}
	
	public Loan payLoan(Loan l,  double amt, Account a) {
		l.setLoanAmount(l.getLoanAmount()-amt);
		a.setDepositAmount(a.getDepositAmount()-amt);
		System.out.println(amt+ " Debited Successfully");
		return l;
	}
	
	
	
	/*
	 * public void showAccountDetails(String id) {
	 * 
	 * return; }
	 */
	
	
	
	
	

}
