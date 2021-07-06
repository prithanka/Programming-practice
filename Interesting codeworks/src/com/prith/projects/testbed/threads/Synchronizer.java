package com.prith.projects.testbed.threads;

public class Synchronizer 
{
	public static enum state {EVEN, ODD};
	private state currentState;
	
	public Synchronizer(state seed)
	{
		currentState=seed;
	}
	
	public state getCurrentState()
	{
		return currentState;
	}
	
	public void toggle()
	{
		if(currentState == state.EVEN)
			currentState=state.ODD;
		else
			currentState=state.EVEN;
	}
}
