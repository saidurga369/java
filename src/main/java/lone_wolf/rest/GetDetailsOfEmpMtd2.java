package lone_wolf.rest;

import java.io.FileInputStream;

public class GetDetailsOfEmpMtd2 
{
	public String readValue(String str) throws Exception
	{
		FileInputStream fin = new FileInputStream("D://iam_b4//sai.txt");
		int ch = fin.read();
		String data = "";
		while (ch!=-1)
		{
			data += (char)ch;
			ch = fin.read();
		}
		String val = "";
		String ar[] = data.split("\n");
		for (String s : ar)
		{
			if (s.substring(0,s.indexOf('=')).equals(str.toLowerCase()))
			{
				val = s.substring(s.indexOf('=')+1);
			}
		}
		if(val.length() == 0)
		{
			return "No data";
		}
		else
		{
			return val;
		}
		
	}
}
