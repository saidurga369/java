package team_wolf.rest;

import java.util.Arrays;

public class AlphaOrder 
{
	public String alphaOrder(String str)
	{
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		/*String s = "";
		for (int i = 0; i < ch.length; i++) 
		{	
			s+=ch[i];
		}*/
		return (new String(ch));
	}
}
