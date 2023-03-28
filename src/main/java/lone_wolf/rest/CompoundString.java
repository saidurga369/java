package lone_wolf.rest;

public class CompoundString 
{
	public String compoundStr(String str)
	{
		String[] s = str.split(" ");
		String str2 = "";
		for (int i = 0; i < s.length; i++)
		{
			int   n = (s[i].length())/2;
			if(s[i].length()%2==0)
			{
				str2+=s[i].charAt(n-1);
				str2+=s[i].charAt(n);
			}
			else
			{
				str2+=s[i].charAt(n);
			}
		}
		return str2;
	}
}
