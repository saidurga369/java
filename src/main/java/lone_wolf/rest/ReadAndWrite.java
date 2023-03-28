package lone_wolf.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite 
{
	public String copyData(String fname/*, String fname1*/) throws Exception
	{
		FileInputStream in = new FileInputStream("D:\\iam_b4\\add.text");
		int ch = in.read();
		String data = "";
		while (ch!=-1) 
		{
			data+=(char)ch;
			ch = in.read();
		}
		FileOutputStream op = new FileOutputStream("D:\\iam_b4\\"+fname+".text");
		op.write(data.getBytes());
		return "data copied";
	}
}
