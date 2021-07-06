package com.prith.projects.testbed.fibonacci;

import java.util.Date;

public class MemoizedFibonacci 
{
	long[] bucket;
	
	public MemoizedFibonacci(int limit)
	{
		bucket = new long[limit+1];
		
		Date date1 = new Date();
		long startTime = date1.getTime();
		
		System.out.println(generate(limit));
		//print(bucket, limit);
		
		Date date2 = new Date();
		long endTime = date2.getTime();
		
		System.out.println("Time taken: "+ (endTime-startTime));
	}

	private void print(long[] bucket2, int limit) 
	{
		for (int i=0; i<= limit; i++)
			System.out.println(bucket2[i]);
	}

	private long generate(int limit) 
	{
		if (bucket[limit] != 0) return bucket[limit]; 
			
		if (limit == 0) return 0;
		if (limit == 1) return 1;
		
		long fib_of_limit = generate(limit-1) + generate(limit-2);
		bucket[limit] = fib_of_limit;
		return fib_of_limit;
	}
}
