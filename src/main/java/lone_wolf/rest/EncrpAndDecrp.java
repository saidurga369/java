package lone_wolf.rest;
 
public class EncrpAndDecrp
{
	public String encryp(String str)
	{
		
		String s1 = "abcdefghi";
		String s2 = "jklmnopqr";
		String s3 = "stuvwxyz";
		String s = "";
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(s1.contains(ch+""))
			{
				s+="1"+(s1.indexOf(ch)+1);
			}
			else if(s2.contains(ch+""))
			{
				s+="2"+(s2.indexOf(ch)+1);
			}
			else if(s3.contains(ch+""))
			{
				s+="3"+(s3.indexOf(ch)+1);
			}
			else if(str.contains(" "))
			{  
				s+="0";
			}
		}
		return s;
	}
}
