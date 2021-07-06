package com.prith.projects.testbed.lackman;

import java.util.concurrent.ThreadLocalRandom;

public class FindCelebrity 
{

	private int[][] relationship;
	
	public FindCelebrity(int size)
	{
		relationship = new int [size][size];
		createRelations(size);
	}
	
	private void createRelations(int size)
	{
		int celebNum = ThreadLocalRandom.current().nextInt(0, size);
		for (int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i == celebNum)
					relationship[i][j]=0;
				else
					relationship[i][j] = ThreadLocalRandom.current().nextInt(0, 2);
			}
		}
	}
	
	public boolean knows(int a, int b)
	{
		return relationship[a][b]==0? false : true;
	}
	
	public int find()
	{
		for (int i=0;i<relationship.length;i++)
		{
			int j;
			for(j=0;j<relationship[i].length;j++)
			{
				if(relationship[i][j]==0)
					continue; 
				else
					break;
			}
			if(j==relationship[i].length)
				return i+1;
		}
		return -1;
	}
	
	public void printRelations()
	{
		for (int i=0;i<relationship.length;i++)
		{
			for(int j=0;j<relationship[i].length;j++)
			{
				System.out.print(relationship[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void test()
	{
		int [][] a;
		a = new int [10][20];
		System.out.println(a.length);
		System.out.println(a[1].length);
	}
	
	public static void main(String[] args) 
	{
		FindCelebrity finder = new FindCelebrity(20);
		System.out.println(finder.find());
		finder.printRelations();
		
		//finder.test();
	}

}
