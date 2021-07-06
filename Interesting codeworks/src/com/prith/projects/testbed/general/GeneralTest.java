package com.prith.projects.testbed.general;

public class GeneralTest 
{
	static
	{
		System.out.println("This is from the static block");
	}
	
	public GeneralTest()
	{
		System.out.println("This is from the constructor");
		printer1();
		printer2("This is passed from the contructor");
		
	}
	
	private void printer2(String string) 
	{
		System.out.println("This is from Printer2: "+string);		
	}

	private void printer1() 
	{
		System.out.println("This is from Printer1");
	}

	public static void main(String[] args) 
	{
		new GeneralTest();
	}

}
