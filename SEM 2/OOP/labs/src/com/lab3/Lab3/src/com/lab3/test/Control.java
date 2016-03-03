package com.lab3.test;

public class Control 
{
	public static void main(String args[])
	{
		Employee em1 = new Employee("Jane", "Doe", 123, 12.34, "11-Feb");
		HourlyEmployee em2 = new HourlyEmployee("John", "Doe", 123, 0, "11-Feb", 2.5, 3.8);
		CommissionEmployee em3 = new CommissionEmployee("Jack", "Doe", 123, 0, "11-Feb", 4);
		
		System.out.println(em1.toString());
		System.out.println(em2.toString());
		System.out.println(em3.toString());
		
		Employee[] myEmployees = new Employee[6];
		myEmployees[0] = new Employee("Jock", "Doe", 123, 12.34, "11-Feb");
		myEmployees[1] = new Employee("Jake", "Doe", 123, 12.34, "11-Feb");
		myEmployees[2] = new HourlyEmployee("Sarah", "Doe", 123, 12.34, "11-Feb", 2.5, 3.8);
		myEmployees[3] = new HourlyEmployee("Sam", "Doe", 123, 12.34, "11-Feb", 2.5, 3.8);
		myEmployees[4] = new CommissionEmployee("Ben", "Doe", 123, 12.34, "11-Feb", 4);
		myEmployees[5] = new CommissionEmployee("Bart", "Doe", 123, 12.34, "11-Feb", 4);
		
		for(int i=0; i<myEmployees.length; i++)
		{
			System.out.println(myEmployees[i].calculatePay());
		}
	}
	
}