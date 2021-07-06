package com.prith.projects.testbed.fibonacci;

import java.util.Date;

public class Fibonacci 
{
	
	public Fibonacci(int limit)
	{
		Date date1 = new Date();
		long startTime = date1.getTime();
		
		System.out.println(generate(limit));
		
		Date date2 = new Date();
		long endTime = date2.getTime();
		
		System.out.println("Time taken: "+ (endTime-startTime));
	}

	private long generate(int limit) 
	{
		
		if (limit == 0) return 0;
		if (limit == 1) return 1;
		
		long fib_of_limit = generate(limit-1) + generate(limit-2);
		return fib_of_limit;
	}
		
}
