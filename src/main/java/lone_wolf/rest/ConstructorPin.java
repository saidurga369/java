package lone_wolf.rest;

public class ConstructorPin 
{
	String s;
	public ConstructorPin(String str)
	{
		
		if(str.equals("1234") )
		{
			s = ConstructorPin.access();
		}
		else
		{
			s = ConstructorPin.accessDenied();
		}
	}
	public static String access()
	{
		return "details accessed";
	}
	public static String accessDenied()
	{
		return "access denied";
	}
	public String print()
	{
		return s;
	}
}
