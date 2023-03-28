package lone_wolf.rest;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.osgi.ee.resources.ResourcesExtender;

import lone_wolf.rest.OuterClass.Innerclass;

@Path("/home")
public class Home 
{
	@GET
	@Path("/sup")
	@Produces(MediaType.TEXT_HTML)
	public String disply()
	{
		SubClass s = new SubClass();
		return s.str;
	}
	
	@GET
	@Path("/998/{str}")
	@Produces(MediaType.TEXT_HTML)
	public String encr(@PathParam("str") String str)
	{
		EncrpAndDecrp e = new EncrpAndDecrp();
		return e.encryp(str);
	}
	
	@GET
	@Path("/lambda/{int}")
	@Produces(MediaType.TEXT_HTML)
	public String lambda(@PathParam("int") int num)
	{
		AirthImplimenation a = new AirthImplimenation(); 
		return "Given number is : "+num+"<br>"+a.evenOdd(num)+"<br>"+a.prime(num)+"<br>"+a.squre(num)+"<br>"+StaticImpli.returnh();
		
	}
	
	@GET 
	@Path("/replace/{str},{str2},{str3}")
	@Produces(MediaType.TEXT_HTML)
	public String replaceLetter(@PathParam("str") String str,@PathParam("str2") String str2,@PathParam("str3") String str3)
	{
		ReplaceLetter rl = new ReplaceLetter();
		return rl.replaceLet(str, str2);
	}
	
	@GET
	@Path("/dupli/{str}")
	@Produces(MediaType.TEXT_HTML)
	public String removeDuplicates(@PathParam("str") String str)
	{
		ReplaceLetter rl = new ReplaceLetter();
		return "Original word is : "+str+"<br>"+rl.removeDupli(str);
	}
	
	@GET
	@Path("/sort/{str}")
	@Produces(MediaType.TEXT_HTML)
	public String sort(@PathParam("str") String str)
	{ 
		ReplaceLetter rl = new ReplaceLetter();
		return "Original word is : "+str+"<br>"+"Sorted String is : "+rl.sort(str);
	}
	
	@GET
	@Path("/fac/{num}")
	@Produces(MediaType.TEXT_HTML)
	public String factorial(@PathParam("num") int num)
	{ 
		Factorial f = new Factorial();
		return f.factorial(num);
	}
	
	@GET
	@Path("compound/{str}")
	@Produces(MediaType.TEXT_HTML)
	public String compoundStr(@PathParam("str") String str)
	{ 
		CompoundString s = new CompoundString();
		return s.compoundStr(str);
	}
	
	@GET
	@Path("/call")
	@Produces(MediaType.TEXT_HTML)
	public String call()
	{ 
		Iouter.Iinner in = new SubOuter.InnClass();
		return in.a+"";
	}
	
	@GET
	@Path("/pri")
	@Produces(MediaType.TEXT_HTML)
	public String pri()
	{ 
		PrivateCons p = new PrivateCons();
		return p.return1()+"";
	}
	
	@GET
	@Path("/in")
	@Produces(MediaType.TEXT_HTML)
	public String inn()
	{ 
		// OuterClass o = new OuterClass();
		InnerOut e = new InnerOut();
		return e.main();
	}
	
	@GET
	@Path("/array/{size},{ind},{val}")
	@Produces(MediaType.TEXT_HTML)
	public String array(@PathParam("size") int size,@PathParam("ind") int ind,@PathParam("val") int val)
	{ 
		Array array = new Array();
		array.createArray(size);
		array.addValue(ind, val);
		return array.readArray();
	}
	
	@GET
	@Path("/mathtab/{size},{val}")
	@Produces(MediaType.TEXT_HTML)
	public String array(@PathParam("size") int size,@PathParam("val") int val)
	{ 
		Array array = new Array();
		array.createArray(size);
		for (int i = 0; i < size; i++) 
		array.addValue(i, val*(i+1));
		return array.readArray();
	}
	
	@GET
	@Path("/employee")
	@Produces(MediaType.TEXT_HTML)
	public String emp()
	{
		String[] ids = {"101","102","103","104"};
		String[] names = {"sai","nani","suni","mani"};
		int[] sals = {1000,2000,3000,4000};

		
		Employee emp[] = new Employee[4];
		
		for (int i = 0; i < emp.length; i++)
		{
			emp[i] = new Employee(ids[i], names[i], sals[i]);
			emp[i].bonus = (int) (0.15*emp[i].sal);
			emp[i].total = emp[i].sal+emp[i].bonus;
		}

		String result = "";
		for (Employee e: emp) 
		{
			result+=e.toString();
		}
		return result;
	}
	
	@GET
	@Path("/assci/{str}")
	@Produces(MediaType.TEXT_HTML)
	public String assci(@PathParam("str") String str)
	{
		ConAssci c = new ConAssci();
		return c.assciRev(str);
	}
	
	@GET
	@Path("/emp2")
	@Produces(MediaType.TEXT_HTML)
	public String emp2()
	{
		int[] ids = {101,102,103,104};
		String[] names = {"sai","nani","suni","mani"};
		int[] exps = {1,2,3,4};
		int[] skils = {1,2,3,4};
		
		Emp2 emp[] = new Emp2[4];
		for (int i = 0; i < emp.length; i++)
		{
			emp[i] = new Emp2(ids[i], names[i], exps[i], skils[i]);
			emp[i].sal = emp[i].exp*10000+emp[i].skil*1000;
		}
		
		String result = "";
		for(Emp2 e : emp)
		{
			result+= e.toString();
		}
		return result;
	}
	
	@GET
	@Path("/const/{str}")
	@Produces(MediaType.TEXT_HTML)
	public String constructor(@PathParam("str") String str)
	{
		ConstructorPin c  = new ConstructorPin(str);
		return c.print();
	}
	
	@GET
	@Path("/emp")
	@Produces(MediaType.TEXT_HTML)
	public String emp22()
	{
		String s="ab";String res="";
		for(int i=0;i<s.length();i++)
		res+=(char)Integer.parseInt(new StringBuffer((int)s.charAt(i)+"").reverse().toString());
		return res;
	}
	
	@GET
	@Path("/office/{str}")
	@Produces(MediaType.TEXT_HTML)
	public String officeDetails(@PathParam("str") String str)
	{
		Office trines = Office.TRAINING_ROOM;
		Office areas[] = Office.values();
		
		try 
		{
				String msg="";
				Office room = Office.valueOf(str.toUpperCase());
				switch (room) 
				{
				case CONFERENCE_ROOM: msg = "Be confident";
					
					break;
					
				case LOBY: msg = "Not related to you";
					
					break;
					
				case MANAGER_ROOM : msg = "Try to not get punished";
				
					break;
				case PANTRY: msg = "haven";
				
					break;
					
				case TRAINING_ROOM: msg = "your kingdom";
				}
				return trines.toString()+"<br>"+Arrays.toString(areas)+"<br>"+trines.siting+"<br>"+msg;
		}
		catch (Exception e) {
			return e.getMessage();
		}
		
	}
	
	@GET
	@Path("/math/{str},{num1},{num2}")
	@Produces(MediaType.TEXT_HTML)
	public String math(@PathParam("str") String str,@PathParam("num1") double num1,@PathParam("num2") double  num2)
	{
		try {
			String op = "";
			AirthmaticOp a = AirthmaticOp.valueOf(str.toUpperCase());
			switch (a) {
			case ADD: op+= "Addition is : " +(num1+num2);
			break;
				
			case DIV: op+= "Division is : " +(num1/num2);
			
			break;
			
			case MUL: op+= "Multiplication is : "+(num1*num2);
			
			break;
			
			case SUB: op+= "Subtraction is : "+(num1-num2);
			
			break;
			}
			
			return op;
			
		}
		catch (Exception e) {
			return e.toString();
		}
	}
	
	@GET                  
	@Path("/team/{char}")
	@Produces(MediaType.TEXT_HTML)
	public String team(@PathParam("char") String ch)
	{
		String res="";
		int len = ch.length();
		Team mem[] = Team.values();
		for (Team t : mem) 
		{
			if (t.toString().substring(0, len).equals(ch.toUpperCase()))
			{
				res+=t.toString()+"<br>";
			}
		}
		if(res.length()==0)
		{
			res="NO SUCH MEMBER";
		}
		return res.toUpperCase();
	}
	
	@GET
	@Path("gen")
	public String genType()
	{
		GenClass<Integer> ge = new GenClass<>();
		ge.assign(25);
		ge.createArray(20,10,3,0,40,50);
		return ge.read()+"<br>"+Arrays.toString(ge.ar);
	}
	
	@GET
	@Path("fdata/{fname}")
	public String fileData(@PathParam("fname") String fName) throws Exception
	{
		FileOp op = new FileOp();
		return op.loadData(fName);
	}
	
	@GET
	@Path("add/{fname},{a},{b}")
	public String fData(@PathParam("fname") String fname,@PathParam("a") int b,@PathParam("b") int a) throws Exception
	{
		InputOutput io = new InputOutput();
		return io.addFile(a, b, fname);
	}
	
	@GET
	@Path("copy/{fname}")
	public String cData(@PathParam("fname") String fname/*,@PathParam("fname1") String fname1*/) throws Exception
	{
		ReadAndWrite rw = new ReadAndWrite();
		return rw.copyData(fname/*, fname1*/);
	}
	
	@GET
	@Path("img")
	public String cData()  throws Exception
	{
		EncrypttImg e = new EncrypttImg();
		return e.decompress();
	}
	
	@GET
	@Path("obj")
	public String objFile()  throws Exception
	{
		Student s = new Student();
		return s.serialization()+"<br>"+s.deSerialization();
	}
	
	@GET
	@Path("b4/{num}")
	public String objFile(@PathParam("num") int num)  throws Exception
	{
		B4 b = new B4();
		return b.nameSelect(num);
	}
	
	@GET
	@Path("get/{str}")
	public String getDetails(@PathParam("str") String str)  throws Exception
	{
		GetDetailsOfEmp gd = new GetDetailsOfEmp();
		return gd.getDetails(str);
	}
	
	@GET
	@Path("get2/{str}")
	public String getDetails2(@PathParam("str") String str)  throws Exception
	{
		GetDetailsOfEmpMtd2 gd = new GetDetailsOfEmpMtd2();
		return gd.readValue(str);
	}
}
  