package com.prith.projects.testbed.threads;

public class Printer extends Thread
{
	private Synchronizer.state myState;
	private Synchronizer lock;
	
	private int counter;
	
	public Printer(Synchronizer alock, Synchronizer.state self) 
	{
		lock = alock;
		myState = self;
		
		if(myState == Synchronizer.state.ODD)
			counter=1;
		else
			counter=2;
	}
	
	public void run()
	{
		while (counter<=20)
		{
			synchronized(lock)
			{
				while(lock.getCurrentState() != myState)
				{
					try 
					{
						lock.wait();
					} 
					catch (InterruptedException e) 
					{}
				}
				System.out.println(counter);
				counter = counter+2;
				lock.toggle();
				lock.notifyAll();
			}
		}
		
	}

}
