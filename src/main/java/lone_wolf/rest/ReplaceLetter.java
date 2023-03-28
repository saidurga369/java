package lone_wolf.rest;

import java.util.Arrays;

public class ReplaceLetter 
{
	public String replaceLet(String str1, String str2)
	{
		String str =str2;
		for (int i = 0; i < str2.length(); i++)
		{
			char ch = str2.charAt(i);
				if(str1.contains(ch+""))
				{
					str = str.replace(ch , '*');
				}
		}
		
		return "Given strings :"+str1+" and "+str2+"<br>"+"Resulted String : "+str;
	}
	
	public String removeDupli(String str)
	{
		String s = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++)
		{
			if(str.contains(ch[i]+""))
			{
				if(!(s.contains(ch[i]+"")))
				{
					s+=ch[i];
				}
			}
		}
		return "After removing the Duplicates : "+s;
		
	}
	
	public String sort(String str)
	{
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		return Arrays.toString(ch);
	}
}
