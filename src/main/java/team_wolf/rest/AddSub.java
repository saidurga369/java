package team_wolf.rest;

public class AddSub
{
	public String addSub(String str)
	{
		String[] st = str.split(",");
		int sum = 0;
		for (int i = 0; i < st.length; i++)
		{
			int n = Integer.parseInt(st[i]);
			if(n%2==0)
			{
				sum+=n;
			}
			else
			{
				sum-=n;
			}
		}
		return sum +"";
	}
}
