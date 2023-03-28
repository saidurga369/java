package cyber_solve.rest;

import java.io.File;

public class FolderCreation 
{
	public String fileCreation(String str)
	{
		File folder = new File("D://iam_b4//"+str);
		if(folder.mkdir())
			return "Folder created";
		else
			return "Folder not created";
	}
}
