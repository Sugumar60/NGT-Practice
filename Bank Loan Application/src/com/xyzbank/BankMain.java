package com.xyzbank;

import java.util.Scanner;

public class BankMain {
	
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		Scanner sc = new Scanner(System.in);
		Account accounts[]  = new Account[10];
		Loan loans[] = new Loan[10];
		accounts[0] = new Account("1111111-AAAA", "Sugumar", "Chennai", 8000);
		
		int accountIndex = 1;
		int loanIndex = 0;
		double damt;
		double wamt;
		double amt;
		String accId;
		String loanId;
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println("CHOOSE YOUR OPTION:");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Show Account details");
			System.out.println("5. Apply Loan");
			System.out.println("6. Pay Loan");
			System.out.println("7. Show loan Details");
			System.out.println("8. Exit");
			int option = sc.nextInt();
			
		switch(option) {
		
		case 1:
			Account acc = new Account();
			System.out.println("Enter your Account ID(Eg:[1234567-ABCD]:");
			acc.setAccountId(sc.next());
			System.out.println("Enter your Name(First letter Should be in Upper case):");
			acc.setAccountName(sc.next());
			System.out.println("Enter your Address:");
			acc.setAddress(sc.next());
			System.out.println("Enter Deposit Amount:");
			acc.setDepositAmount(sc.nextDouble());
			accounts[accountIndex] =  acc;
			System.out.println("Your Account has successfully created");
			accountIndex++;
			break;
			
		case 2:
			System.out.println("Enter your Account Id:");
			accId =  sc.next();
			for(Account a : accounts) {
				if((a.getAccountId()).equals(accId)) {
					System.out.println("Enter your deposit Amount:");
					damt = sc.nextDouble();
					a.setDepositAmount(transaction.depositAmount(damt, a.getDepositAmount()));
					System.out.println("Transaction Completed");
					System.out.println("Your new balance is " + a.getDepositAmount());
					break;
					}
				else {
					System.out.println("Enter valid Account Id.");
				}
			}
			break;
		
		case 3:	
			System.out.println("Enter your Account Id:");
			accId =  sc.next();
			for(Account a : accounts) {
				if((a.getAccountId()).equals(accId)) {
					System.out.println("Enter withdraw Amount:");
					wamt = sc.nextDouble();
					if(wamt<=a.getDepositAmount()) {
						a.setDepositAmount(transaction.withdrawAmount(wamt, a.getDepositAmount()));
						System.out.println("Transaction Completed");
						System.out.println("Your new balance is " + a.getDepositAmount());
						break;
					}
					else System.out.println("Insufficient Balance");
					break;
				}
				else {
					System.out.println("Enter valid Account Id.");
					break;
				}
			}
			break;
		
		case 4:
			System.out.println("Enter your Account Id:");
			accId = sc.next();
			for(Account a : accounts) {
				if(a.getAccountId().equals(accId)){
					a.showDetails(a.getAccountId(), accounts);
					break;
				}
				else System.out.println("Enter valid Id");
			}
			break;
			
		case 5:
			System.out.println("Enter your Account Id:");
			accId = sc.next();
			Loan loan = new Loan();
			for(Account a : accounts) {
				if(a.getAccountId().equals(accId)) {
					
					System.out.println("Enter Loan Id:");
					loan.setLoanId(sc.next());
					System.out.println("Enter Loan Type [Eg: House, Education, Bike, Car]:");
					loan.setLoanType(sc.next());
					System.out.println("Enter Loan Amount:");
					loan.setLoanAmount(sc.nextDouble());
					loan.getLoan(loan.getLoanAmount(), a.getDepositAmount(),a);
					loans[loanIndex] = loan;
					loanIndex++;
					break;
				}
				else System.out.println("Enter Valid Account Id");
			}
			break;
			
		case 6:
			System.out.println("Enter your Loan Id:");
			loanId = sc.next();
			for(Loan l : loans) {
				if(l.getLoanId().equals(loanId)) {
					System.out.println("Your Total Loan Amount is "+ l.getLoanAmount());
					System.out.println("Enter the amount you want to repay:");
					amt = sc.nextDouble();
					System.out.println("Enter your Account Id: ");
					accId = sc.next();
					for(Account a : accounts) {
						if(a.getAccountId().equals(accId)) {
							if(amt <= a.getDepositAmount()) {
								transaction.payLoan(l, amt,a);
								System.out.println("The new Loan Amount you need to pay is "+ l.getLoanAmount());
								break;
							}
							else {
								System.out.println("Invalid  Account Id.");
								break;
							}
						}
					}
					break;
					}
				else {
					System.out.println("Invalid Loan Id.");
					break;
			     }
			}
			break;
		
		case 7:
			System.out.println("Enter Loan Id:");
			loanId = sc.next();
			for(Loan l : loans) {
				if(l.getLoanId().equals(loanId)) {
					l.showLoanDetails(l);
					break;
				}
				else {
					System.out.println("Enter the Valid Id");
					break;
				}
			}
			break;
			
		case 8:
			System.out.println("Thank you for using our Application");
			sc.close();
			System.exit(0);
			
		default:
			System.out.println("Choose the proper action.");
		}
	
	
	}
	}		
}
