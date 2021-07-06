package com.prith.projects.testbed.maths;

public class Primes 
{
	public int numberOfPrimes; 
	
	public Primes(int a) 
	{
		numberOfPrimes = a;
		generatePrimes();
	}

	private void generatePrimes() 
	{
		int i = 1;
		int counter = 0;
		while (true)
		{
			if(testPrime(i))
			{
				System.out.print(i + " ");
				counter++;
				if(counter == numberOfPrimes)
				{
					break;
				}
			}
			i++;
		}
	}

	private boolean testPrime(int b) 
	{
		for (int index=2; index <= Math.sqrt(b); index++)
		{
			if(b%index == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		new Primes(100);
		
	}

}
