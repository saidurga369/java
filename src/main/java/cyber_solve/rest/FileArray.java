package cyber_solve.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileArray 
{
	public String fileArray(String str) throws Exception
	{
		int[] ar = {0,1,2,3,4,5,6,7,8,9};
		FileOutputStream out = new FileOutputStream("D:\\iam_b4\\"+str+".txt");
		String data = Arrays.toString(ar);
		out.write(data.getBytes());
		return "array created";
	}
	
	public String fileArrayIn(String str,int num) throws Exception
	{
		FileInputStream in = new FileInputStream("D:\\iam_b4\\"+str+".txt");
		int ch = in.read();
		String s = ""; 
		String val = "";
		while(ch!=-1)
		{
			if(ch!=91&&ch!=93)
			{
				s+=(char)ch;
			} 
			ch = in.read();
		}
		String[] sArray = s.split(",");
		if(num<=sArray.length-1)
		{
			val+=sArray[num];
		}
		else
		{
			val+="invalid index number";
		}
		return val;
	}
}
