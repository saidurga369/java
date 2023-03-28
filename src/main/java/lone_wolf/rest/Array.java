package lone_wolf.rest;

import java.util.Arrays;

public class Array 
{
	int ar[];
	public void createArray(int size)
	{
		ar = new int[size];
	}
	
	public void addValue(int index,int value)
	{ 
		if(ar.length>index&&index>0)
		{
			ar[index] = value;
		}
	}
	
	public String readArray()
	{
		
			return Arrays.toString(ar);
		
	}
}
