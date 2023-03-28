package cyber_solve.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/service")
public class Service 
{
	@GET
	public String get()
	{
		return "Sucessfully Launched...!!";
	}
	
	@GET
	@Path("/array/{str},{num}")
	public String fileArray(@PathParam("str") String str,@PathParam("num") int num) throws Exception
	{
		FileArray fa = new FileArray();
		return fa.fileArray(str)+"<br>"+fa.fileArrayIn(str, num);
	}
	
	@GET
	@Path("/folder/{fold}")
	public String folderCreation(@PathParam("fold") String fname)
	{
		FolderCreation f = new FolderCreation();
		return f.fileCreation(fname);
	}
	
	@GET
	@Path("/rename/{str}")
	public String fileRename(@PathParam("str") String fname)
	{
		FileRename f = new FileRename();
		return f.rename(fname);
	}
	
	@GET
	@Path("/file")
	public String fileOperations() throws Exception
	{
		FileOperations fo = new FileOperations();
		return fo.CopyFile()+"<br>"+fo.cutFile();
	}
}
