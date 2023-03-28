 package lone_wolf.rest;

public class ConAssci
{
	public String assciRev(String str)
	{
		char[] ch = str.toCharArray();
		String s = "";
		for (int i = 0; i < ch.length; i++)
		{
			int a = ch[i];
			int rev =  0 ;
			while(a!=0)
			{
				int last = a%10;
				rev = rev*10+last;
				a/=10;
			}
			char c = (char)rev;
			s+=c;
		}
		return s;
	}
}
