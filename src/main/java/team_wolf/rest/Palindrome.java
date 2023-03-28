package team_wolf.rest;

public class Palindrome 
{
	public String checkPalin(int num)
	{
		int temp = num;
		int rev = 0;
		while(num!=0)
		{
			int last = num%10;
			rev=last+rev*10;
			num/=10;
		}
		if(rev==temp)
		{
			return "Given number "+temp+" is palindrome.";
		}
		else
		{
			return "Given number "+temp+" is not a palindrome.";
		}
	}
}
