package lone_wolf.rest;

public class Factorial 
{
	public String factorial(int num)
	{
		int fac = 1;
		String str="";
		for (int i = 1; i <=num; i++) 
		{
			fac*=i;
			
		}
		return fac+"";
	}
}
