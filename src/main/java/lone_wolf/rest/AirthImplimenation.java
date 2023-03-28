package lone_wolf.rest;

public class AirthImplimenation 
{
	public String squre(int num)
	{
		Airth squ =(a)->{
			int n = a*a;
			return "squre of given number is : "+n;
		};
		return squ.doIt(num);
		
	}
	
	public String evenOdd(int num)
	{
		Airth type = (a)->{
			if(a%2==0)
			{
				return "even";
			}
			else
			{
				return "odd";
			}
		};
		return type.doIt(num);	
	}
	
	public String prime(int num)
	{
		Airth pri =(a)->{
			int count=0;
			for (int i = 1; i <= a; i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				return "Given number is prime number";
			}
			else
			{
				return "Given number is not an prime number";
			}
		};
		return pri.doIt(num);
	}
}
