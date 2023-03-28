package lone_wolf.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GetDetailsOfEmp 
{
	public String getDetails(String str) throws Exception
	{
		FileInputStream in = new FileInputStream("D:\\iam_b4\\sai.txt");
		int ch = 0;
		int count = 1;
		String val = "";
		String s = "";
		do {
			ch=in.read();
			val="";
			s="";
			while(ch!=61)
			{
				s+=(char)ch;
				ch = in.read();
			}
			System.out.println(s+","+str);
			if(str.equals(s))
			{
				System.out.println("in if");
				count=0;
				ch = in.read();
				while(ch!=13)
				{
					val+=(char)ch;
					ch = in.read();
				}
				 
			}
			else
			{
				while(ch!=13)
				{
					ch=in.read();
				}
			}
		}while(count!=0);
		
		return val;
	}
}
