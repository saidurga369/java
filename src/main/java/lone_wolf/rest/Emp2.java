package lone_wolf.rest;

public class Emp2
{
	int id;
	String name;
	int exp;
	int skil;
	int sal;
	public Emp2(int id, String name, int exp, int skil) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.skil = skil;
	}
	public Emp2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return id + ", " + name + ", " + exp + ", " + skil+", "+sal+"<br>";
	}
	
	
}
