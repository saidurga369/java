package lone_wolf.rest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.sound.sampled.Line;

public class InputOutput
{
	public String addFile(int a,int b,String fname) throws Exception
	{
		FileOutputStream op = new FileOutputStream("D:\\iam_b4\\"+fname+".txt");
		String str = "First element : "+a+" Secong element : "+b;
		op.write(str.getBytes());
		FileOutputStream op1 = new FileOutputStream("D:\\iam_b4\\"+fname+".text",true);
		String str2 = "Total value : "+(a+b);
		op1.write(System.lineSeparator().getBytes());
		op1.write(str2.getBytes());
		return "data saved";
	}
}
