/*
 * Lab 4
 * Author: April Tan Pao Yin
 * Date: 18 February 2016
 * 
*/
package com.lab4.test;

public class Account implements ValidatedAccount
{
	//attributes
	private String accountName;
	private int accountNumber;
	private String sortCode;
	private String branch;
	private boolean inCredit;
	private double acctBalance;
	private static int acctID;
	
	Account(String accountName, int accountNumber, String sortCode, String branch, boolean inCredit, double acctBalance)
	{
		this.setAccountName(accountName);
		this.setAccountNumber(accountNumber);
		this.setSortCode(sortCode);
		this.setBranch(branch);
		this.setInCredit(inCredit);
		this.setAcctBalance(acctBalance);
	}
	
	//methods
	public void deposit(double amtDeposit)
	{
		this.acctBalance = this.acctBalance + amtDeposit;
	}//end deposit
	
	public void withdraw(double amtWithdraw)
	{
		this.acctBalance = this.acctBalance - amtWithdraw;
		if (acctBalance < 0)
		{
			this.inCredit = false;
		}//end if
	}//end withdraw
	
	public void getDetails()
	{
		String content = "Account Type: Account"
						+ "\nAccount Name: " + this.getAccountName()
						+ "\nAccount Number: " + this.getAccountNumber()
						+ "\nSort Code: " + this.getSortCode()
						+ "\nBranch Name: " + this.getBranch()
						+ "\nIn Credit?: " + this.isInCredit()
						+ "\nAccount Balance: " + this.getAcctBalance();
		System.out.println(content);
	}
	
	public void valuableAccount()
	{
		System.out.println("The account balance is " + this.getAcctBalance());
	}
	
	public String getAccountName() 
	{
		return accountName;
	}
	
	public void setAccountName(String accountName) 
	{
		this.accountName = accountName;
	}

	public int getAccountNumber() 
	{
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = acctID;
		acctID++;
	}

	public String getSortCode() 
	{
		return sortCode;
	}

	public void setSortCode(String sortCode) 
	{
		this.sortCode = sortCode;
	}

	public String getBranch() 
	{
		return branch;
	}

	public void setBranch(String branch) 
	{
		this.branch = branch;
	}

	public boolean isInCredit() 
	{
		return inCredit;
	}

	public void setInCredit(boolean inCredit) 
	{
		this.inCredit = inCredit;
	}

	public double getAcctBalance() 
	{
		return acctBalance;
	}

	public void setAcctBalance(double acctBalance) 
	{
		this.acctBalance = acctBalance;
	}

	public static int getAcctID() {
		return acctID;
	}

	public static void setAcctID(int acctID) {
		Account.acctID = acctID;
	}
	
	
}