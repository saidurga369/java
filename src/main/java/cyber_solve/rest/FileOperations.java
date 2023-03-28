package cyber_solve.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.glassfish.internal.api.Public;

public class FileOperations 
{
	public String CopyFile() throws Exception 
	{
		File f1 = new File("D:\\iam_b4\\sai_details.txt");
		File f2 = new File("D:\\iam_b4\\sai\\"+f1.getName());
		FileInputStream in = new FileInputStream(f1);
		FileOutputStream out = new FileOutputStream(f2);
		int ch = in.read();
		while(ch!=-1)
		{
			out.write(ch);
			ch=in.read();
		}
		return "File Copied Sucessfully..!!";
	}
	
	public String cutFile() throws Exception
	{
		File f1 = new File("D:\\iam_b4\\compress.txt");
		File f2 = new File("D:\\iam_b4\\sai\\"+f1.getName());
		FileInputStream in = new FileInputStream(f1);
		FileOutputStream out = new FileOutputStream(f2);
		int ch = in.read();
		while(ch!=-1)
		{
			out.write(ch);
			ch = in.read();
		}
		in.close();
		f1.delete();
		return "Cut Operation done Sucessfully...!!!";
	}
}
