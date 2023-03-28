package team_wolf.rest;

public class LongWord
{
	public String lengthyWord(String str)
	{
		String[] st = str.split(" ");
		String str2=" ";
		for (int i = 0; i < st.length; i++)
		{
			if(st[i].length()>=str2.length())
			{
				str2=st[i];
			}
			
		}
		return str2;
	}
}
