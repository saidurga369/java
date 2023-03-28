package lone_wolf.rest;

public class Employee 
{
	String id;
	String name;
	int sal;
	int bonus;
	int total;
	
	public Employee(String id, String name, int sal)
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + sal +", "+bonus+", "+total+"<br>";
	}
	
	
}
