package com.prith.projects.testbed.maths;

public class CommonFactors 
{
	private int num1;
	private int num2;
	
	private int counter=0;
	
	public CommonFactors(int a, int b)
	{
		num1=a;
		num2=b;
		
		generateFactors();
		
		System.out.println(num1 + " : " + num2 + " --- " + counter);
	}
	
	private void generateFactors() 
	{
		for(int i=1; i <= (num1<num2?num1:num2);i++)
		{
			if((num1%i == 0) & (num2%i == 0))
			{
				counter++;
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) 
	{
		new CommonFactors(1000,2000);
	}

}
