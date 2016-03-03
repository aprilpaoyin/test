package com.lab4.test;

public class CurrentAccount extends Account implements ValidatedAccount
{
	//own attributes
	private double penaltyAmount;
	
	CurrentAccount(String accountName, int accountNumber, String sortCode, String branch, boolean inCredit, double acctBalance, double penaltyAmount)
	{
		super(accountName, accountNumber, sortCode, branch, inCredit, acctBalance);
		this.setPenaltyAmount(penaltyAmount);
	}//end cons 1
	
	//methods
	public void withdraw(double amtWithdraw)
	{
		if (super.getAcctBalance() - amtWithdraw < 0)
		{
			System.out.println("Insufficient funds");
		}//end if
		else
		{
			super.setAcctBalance((super.getAcctBalance() - amtWithdraw));
		}//end else
	}//end withdraw
	
	public String checkCredit()
	{
		if(super.isInCredit() == true)
		{
			String content = "This account is in credit.";
			System.out.println(content);
			return content;
		}//end if
		else
		{
			String message = "This account is not in credit";
			System.out.println(message);
			return message;
		}//end else
	}//end checkCredit
	
	public String checkCredit(String warningMessage)
	{
		if((super.getAcctBalance() < 100) & (super.getAcctBalance()> 0))
		{
			System.out.println(warningMessage);
			return warningMessage;
		}//end if
		else
		{
			String message = "All is well.";
			System.out.println(message);
			return message;
		}//end else
	}//end checkCredit
	
	public void getDetails()
	{
		String content = "Account Type: Current"
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

	public double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
}