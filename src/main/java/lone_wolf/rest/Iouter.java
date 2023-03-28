package lone_wolf.rest;

public interface Iouter 
{
	int b = 20;
	interface Iinner
	{
		int a = 10;
	}
	class InnClass implements Iinner
	{
		int a = 300;
	}
}
