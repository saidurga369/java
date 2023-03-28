package lone_wolf.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class B4 
{
	public String nameSelect(int num) throws Exception
	{
		FileInputStream in = new FileInputStream("D:\\iam_b4\\b4.txt");
		int ch = in.read();
		String data = "";
		int count = 0;
		while (ch!=-1)
		{
			if(ch==13)
			{
				count++;
			}
			if(count==num-1 )
			{
				data+=(char)ch;
			}
			ch=in.read();
		}
		return data;
	}
}
