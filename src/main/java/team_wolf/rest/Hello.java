package team_wolf.rest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType; 

@Path("/hello")
public class Hello
{
	@GET 
	@Path("/rev")
    @Produces(MediaType.TEXT_HTML)
    public String method()
    {
        return "<center><h1><font color=red size=50>Welcome To REST</font></h1></center>";
    }
	
	@GET
	@Path("/detail")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudentDetails()
    {
        Student s1 = new Student( "101", "Sai", "MSC", "a");
        Student s2 = new Student("102", "teja", "IT", "b");
        Student s3 = new Student("103","susmitha","CSC","c");
        Student s4 = new Student("104","vedantam","BE","d");
        
        List<Student> arr = new LinkedList<Student>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        
		return arr;
		
		
    }
	
	@GET
	@Path("/add/{x},{y}")
	@Produces("text/plain")
	public String add(@PathParam("x") int a,@PathParam("y") int b)
	{
		return (a+b)+"";
		
	}
	
	@GET
	@Path("/mathTab/{num}")
	@Produces("text/html")
	public String mathTable(@PathParam("num") int a)
	{
		String result="";
		for (int i = 1; i <= 10; i++) 
		{
			result+=a+" * "+i+" = "+ a*i+"<br>";
		}
		return result;
		
	}
	
	@GET
	@Path("/array/{len}/{size}")
	@Produces("text/html")
	public String array(@PathParam("len") int len,@PathParam("size") String sz)
	{
		String[] strArr = new String[len];
		for (int i = 0; i < len; i++) 
		{
			strArr[i]="0";
		}
		String[] ch = sz.split(",");
		if(ch.length<=strArr.length)
		{
			for (int j = 0; j < ch.length; j++) 
			{
				
				strArr[j]=ch[j];
			
			}
		}
		else
		{
			for (int j = 0; j < len; j++) 
			{
				
				strArr[j]=ch[j];
			
			}
		}

		return Arrays.toString(strArr);
	}
		
	@GET
	@Path("/arrRep/{str}")
	@Produces("text/html")
	public String replaceOvlIntoCap1(@PathParam("str") String str)
	{
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if( ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i'||ch[i] == 'o'||ch[i] == 'u')
			{
				switch (ch[i]) 
				{ 
				case 'a':ch[i]='A';
					
				break;

				case 'e':ch[i]='E';
				
				break;
				
				case 'i':ch[i]='I';
				
				break;
				case 'o':ch[i]='O';
				
				break;
				case 'u':ch[i]='U';
				
				break;
				}
			}
		}
		String s = "";
		for (int j = 0; j < ch.length; j++)
		{
			s+=ch[j];
		}
		return s;
		
	}
	
	@GET
	@Path("/replaceWrd/{str}")
	@Produces(MediaType.TEXT_PLAIN)
	public String replaceOvlIntoCap(@PathParam("str") String str)
	{
		return str.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U");
		
	}
	
	@GET
	@Path("/replace/{str}")
	@Produces(MediaType.TEXT_PLAIN)
	public String replaceNxtWrd(@PathParam("str") String s)
	{
		
		char[] ch = s.toCharArray();
		String str="";
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]=='z')
			{
				ch[i]='a';
				str+=ch[i];  
			}
			else
			{
				ch[i]=(char)((int)ch[i]+1);
				str+=ch[i];
			}
		}
		
		
		return str;
		
	}
	
	@GET
	@Path("/root/{num}")
	@Produces(MediaType.TEXT_PLAIN)
	public String squreRoot1(@PathParam("num") int num)
	{
		Root rv = new Root();
		return "Squre root of "+num+" is "+rv.squreRoot(num);
	}
	
	@GET
	@Path("/long/{str}")
	@Produces(MediaType.TEXT_PLAIN)
	public String lengthyWord1(@PathParam("str") String str)
	{
		LongWord lg = new LongWord();
		return lg.lengthyWord(str);
	}
	
	@GET
	@Path("/check/{str}")
	@Produces(MediaType.TEXT_PLAIN)
	public String checkOvelAndConsSum(@PathParam("str") String str)
	{
		Count c = new Count();
		return c.CheckOvlConSum(str);
	}
	
	@GET
	@Path("/arrayind/{ind}")
	@Produces(MediaType.TEXT_PLAIN)
	public String arrayIndexElement(@PathParam("ind") int ind)
	{
		ArrayIndex ai = new ArrayIndex();
		return ai.arrayIndTruValue(ind);
	}
	
	@GET
	@Path("/arrayadd/{arr}")
	@Produces(MediaType.TEXT_PLAIN)
	public int arrayAdd(@PathParam("arr") String arr)
	{
		String[] str = arr.split(",");
		ArraySize as = new ArraySize();
		return as.arraySizeAdd(str);
	}
	
	@GET
	@Path("/palin/{num}")
	@Produces(MediaType.TEXT_PLAIN)
	public String palindrome(@PathParam("num")   int num)
	{
		Palindrome p = new Palindrome();
		return p.checkPalin(num);
	}
	
	@GET
	@Path("/otp/{num}")
	@Produces(MediaType.TEXT_PLAIN)
	public String otpCheck(@PathParam("num") long num)
	{
		OtpCheck oc = new OtpCheck();
		return oc.otpCheck(num);
	}
	
	@GET
	@Path("/hi")
	@Produces(MediaType.TEXT_HTML)
	public String getInput(@Context HttpServletRequest name)
	{
		String str = name.getParameter("user_name");
		return "hello "+str;
	}
	
	@GET
	@Path("/compare/{str1},{str2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String compare(@PathParam("str1") String str1 , @PathParam("str2") String str2 )
	{
		/*if(str1.equals(str2))
		{ 
			return true+"";
		}
		else
		{
			return false+"";
		}*/
		return str1.equals(str2)+"";
	}
	
	@GET
	@Path("/compare2/{str1},{str2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String compare2(@PathParam("str1") String str1 , @PathParam("str2") String str2 )
	{
		String s1 = str1;
		String s2 = new String(str2);
		return (s1==s2)+"";
	}
	
	@GET
	@Path("/order/{str1}")
	@Produces(MediaType.TEXT_PLAIN)
	public String alphaOrder(@PathParam("str1") String str1 )
	{
		AlphaOrder a = new AlphaOrder();
		return a.alphaOrder(str1);
	}
	@GET
	@Path("/addsub/{str1}")
	@Produces(MediaType.TEXT_PLAIN)
	public String addSub(@PathParam("str1") String str1 )
	{
		AddSub a = new AddSub();
		return a.addSub(str1);
	}
	
	@GET
	@Path("/check1/{str1}")
	@Produces(MediaType.TEXT_PLAIN)
	public String check(@PathParam("str1") String str1 )
	{
		DataTypeCon d = new DataTypeCon();
		return d.dataType(str1);
	}
	
	@GET
	@Path("/color/{str}")
	@Produces(MediaType.TEXT_HTML)
	public String getColor(@PathParam("str") String color)
	{
		return "<body bgcolor='"+color+"'>";
	}
	
	@GET
	@Path("/flames/{str1},{str2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String flames(@PathParam("str1") String str1 , @PathParam("str2") String str2 )
	{
		Flames f = new Flames();
		return f.flames(str1, str2);
	}
	
	@GET
	@Path("/encap/{str1}")
	@Produces(MediaType.TEXT_PLAIN)
	public String encp(@PathParam("str1") String str1 )
	{
		Encap e = new Encap();
		return e.month(str1);
	}
	
	@GET
	@Path("/inher/{str1},{str2},{str3},{str4}")
	@Produces(MediaType.TEXT_HTML)
	public String inher(@PathParam("str1") String str1 , @PathParam("str2") String str2 ,@PathParam("str3") String str3 , @PathParam("str4") String str4  )
	{
		Developer dev = new Developer();
		return dev.emp(str1, str2, str3)+"<br>" +dev.role(str4);
	}
	
	@GET
	@Path("/comp/{str1}")
	@Produces(MediaType.TEXT_HTML)
	public String compare(@PathParam("str1") String str1  )
	{
		Compare c = new Compare();
		c.Comp(str1);
		return c.s;
	}
}
  