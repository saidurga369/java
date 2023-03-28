package lone_wolf.rest;

import java.io.FileOutputStream;

public class FileOp
{
	public String loadData(String fName) throws Exception
	{
		FileOutputStream out = new FileOutputStream("D:\\iam_b4\\"+fName+".text");
		String data = "Hello team ready for battle..!!";
		out.write(data.getBytes());
		return "massege sent";
	}
}
