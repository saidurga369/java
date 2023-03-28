package lone_wolf.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class EncrypttImg 
{
	public String name() throws Exception 
	{
		FileInputStream fin = new FileInputStream("D:\\iam_b4\\Untitled.PNG");
		DeflaterInputStream din =  new DeflaterInputStream(fin);
		FileOutputStream fout = new FileOutputStream("D:\\iam_b4\\Untitled.txt");
		int ch = din.read();
		while(ch!=-1)
		{
			fout.write(ch);
			ch=din.read();
		}
		return "encrypted";
	}
	
	public String decompress() throws Exception
	{
		FileInputStream fin  = new FileInputStream("D:\\iam_b4\\compress.txt");
		InflaterInputStream inn = new InflaterInputStream(fin);
		FileOutputStream fout = new FileOutputStream("D:\\iam_b4\\004.PNG");
		int ch = inn.read();
		while(ch!=-1)
		{
			fout.write(ch);
			ch =inn.read();
		}
		
		return "Decrypted3";
	}
	
}
