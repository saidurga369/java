package lone_wolf.rest;

public class GenClass<T> 
{
	T x;
	T ar[];
	public void assign(T x)
	{
		this.x = x;
	}
	public T read()
	{
		return x;
	}
	public void createArray(T... vals)
	{
		ar = vals;
	}
}
