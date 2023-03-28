package lone_wolf.rest;

public class PrivateCons 
{
	int a;
	private PrivateCons(int a)
	{
		 this.a = a+a;
	}
	public PrivateCons() 
	{
	}
	public int return1()
	{
		PrivateCons p = new PrivateCons(10);
		a=p.a;
		return a;
	}
	
}
