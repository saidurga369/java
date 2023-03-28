 package team_wolf.rest;

public class ArraySize 
{
	
	public int arraySizeAdd(String... str)
	{
		int sum = 0;
		for (String i : str)
		{
			sum+=Integer.parseInt(i);
		}
		 return sum;
		 
	}
}
