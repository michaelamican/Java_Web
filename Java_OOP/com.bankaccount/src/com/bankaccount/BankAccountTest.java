package com.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(false, 550.77);
		BankAccount account2 = new BankAccount(false, 120000);
		BankAccount account3 = new BankAccount(true, 11.50);
		BankAccount account4 = new BankAccount(true, 333333333333333.33);
		BankAccount account5 = new BankAccount(true, 1750.26);
		BankAccount account6 = new BankAccount(false, 280000.95);
		
		
		account1.getAccNum(account1);
		account2.getAccNum(account2);
		account3.getAccNum(account3);
		account4.getAccNum(account4);
		account5.getAccNum(account5);
		account6.getAccNum(account6);
		account6.getAccNum(account1);
		
		account1.getCheckBal("4488649874");
		account1.getSavBal("4488649874");
		
		
		

	}

}
