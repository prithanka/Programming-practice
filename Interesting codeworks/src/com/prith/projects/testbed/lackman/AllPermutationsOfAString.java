package com.prith.projects.testbed.lackman;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationsOfAString 
{

	public AllPermutationsOfAString(String s) 
	{
		List<String> result = generate(s);
		System.out.println(result);
	}

	private List<String> generate(String arg) 
	{
		if(arg.length() == 1)
		{
			List<String> list = new ArrayList<String>();
			list.add(arg);
			return list;
		}
		if(arg.length() == 2)
		{
			StringBuilder str = new StringBuilder(arg);

			List<String> list = new ArrayList<String>();
			list.add(str.toString());
			list.add(str.reverse().toString());
			return list;
		}
		else
		{
			StringBuilder content = new StringBuilder(arg);
			String offset = content.substring(0, 1);
			List<String> result = generate(content.substring(1));
			
			List<String> newlist = new ArrayList<String>();
			for (String item : result)
			{
				int index=item.length();
				while(index>=0)
				{
					StringBuilder part = new StringBuilder(item);
					part.insert(index, offset);
					newlist.add(part.toString());
					index--;
				}
			}
			return newlist; 
		}
	}

	public static void main(String[] args) 
	{
		String s = "abcdef";
		new AllPermutationsOfAString(s);
	}

}
