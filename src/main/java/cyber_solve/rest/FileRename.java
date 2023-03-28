package cyber_solve.rest;

import java.io.File;

public class FileRename 
{
	public String rename(String fname) 
	{
		File name = new File("D:\\iam_b4\\sai.txt");
		File Nname= new File("D:\\iam_b4\\"+fname+".txt");
		name.renameTo(Nname);
		return "File Name Changed Sucessfully";
	}
}
