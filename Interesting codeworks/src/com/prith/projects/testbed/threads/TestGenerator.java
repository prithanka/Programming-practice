package com.prith.projects.testbed.threads;

public class TestGenerator 
{
	public static void main(String[] args) 
	{
		Synchronizer lock = new Synchronizer(Synchronizer.state.ODD);
		
		Thread Odd = new Printer(lock,Synchronizer.state.ODD);
		Thread Even = new Printer(lock,Synchronizer.state.EVEN);
		
		Odd.start();
		Even.start();
	}
}
