package com.prith.projects.testbed.fibonacci;

public class FibonacciTest 
{
	public static void main(String[] args)
	{
		System.out.println("Calling Fibonacci ::"); 
		new Fibonacci(45);
		
		System.out.println("Calling Memoized Fibonacci ::"); 
		new MemoizedFibonacci(45);
	}
}
