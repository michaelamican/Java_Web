package com.bankaccount;
//
//import java.util.Random;

public class BankAccount {
	public String accnum;
	public double checkbal;
	public double savbal;
	public boolean checking;
	public static int numaccs;
	public static double sumbals;
	
	public BankAccount(boolean check, double balance) {

		checking = check;
		int max = 9;
		int min = 0;
		int range = max-min + 1;
		
		if(checking == true) {
			checkbal = balance;
		} else {
			savbal = balance;
		}
		for(int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * range + min);
			String number = Integer.toString(rand);
			accnum += number;
		}
		numaccs ++;
		sumbals += balance;
		return;
	}
	
	public Object getAccNum(Object BankAccount) {
		System.out.println("Account number is: "+ accnum);
		return BankAccount;
	}
	
	public double getSavBal(String accID) {
		if(accID == accnum) {
			return savbal;
		} else {
			System.out.println("Account number invalid");
			return 0.0;
		}
	}
	
	public double getCheckBal(String accID) {
		if(accID == accnum) {
			return savbal;
		} else {
			System.out.println("Account number invalid");
			return 0.0;
		}
	}
	
	public double viewBal(String accID) {
		if(accID == accnum) {
			if(checking == true) {
				System.out.println("Checking balance is:");
				System.out.println(checkbal);
				return checkbal;
			} else {
				System.out.println("Savings balance is:");
				System.out.println(savbal);
				return savbal;
			}
		} else {
			System.out.println("Account number invalid");
			return 0.0;
		}
	}
	public void bankTotals() {
		System.out.println("Bank holds:");
		System.out.println(sumbals);
		System.out.println("Bank has this many accounts:");
		System.out.println(numaccs);
	}
	public double addCash(String accID, double deposit, boolean check) {
		if(accID == accnum) {
			if(check == true) {
				checkbal += deposit;
				sumbals += deposit;
				return checkbal;
			} else {
				savbal += deposit;
				sumbals += deposit;
				return savbal;
			}
		} else {
			System.out.println("Account number not recognized");
			return 0.0;
		}
	}
	public double pullCash(String accID, double withdrawal, boolean check) {
		if(accID == accnum) {
			if(check == true) {
				if(withdrawal <= checkbal) {
					checkbal -= withdrawal;
					sumbals -= withdrawal;
					return checkbal;
				} else{
					System.out.println("Insufficient funds in checking account.");
					return checkbal;
				}
			} else {
				if(withdrawal <= savbal) {
					savbal -= withdrawal;
					sumbals -= withdrawal;
					return savbal;
				} else {
					System.out.println("Insufficient funds in checking account.");
					return savbal;
				}
			}
		} else {
			System.out.println("Account number not recognized");
			return 0.0;
		}
	}
}
