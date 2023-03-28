package team_wolf.rest;

public class Encap
{
	private int monthN;
	public String month(String str)
	{
		int monthNum = Integer.parseInt(str);
		
		if (monthNum<=12)
		{
			monthN = monthNum;
			return "Valid month number";
		}
		else
		{
			return "Invalid month number";
		}
	}
}
