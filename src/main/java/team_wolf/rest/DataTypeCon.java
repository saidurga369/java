package team_wolf.rest;

public class DataTypeCon
{
	 public String dataType(String str)
	 {
		 
			 if(str.equals("rutwik"))
			 {
				 return "he has another world";
			 }
			 else if(str.equals("ram"))
			 {
				  return "he is from another galaxy";
			 }
			 else if(str.equals("ankitha"))
			 {
				  return "loud speaker";
			 }
			 else if(str.equals("saiteja"))
			 {
				  return "silent killer";
			 }
			 else if(str.equals("saidurga"))
			 {
				  return "only god knows...";
			 }
			 else if(str.equals("ram"))
			 {
				  return "he is from another galaxy";
			 }
			 else if(str.equals("lavanya"))
			 {
				  return "avuana.... nijama....";
			 }
			 else if(str.equals("vandana"))
			 {
				  return "she belongs to play school";
			 }
			 else if(str.equals("susmitha"))
			 {
				  return "aunty...";
			 }
			 else
			 {
				 try
				 {
					 Integer.parseInt(str);
					 return "integer";
				 }
				 catch(Exception e1)
				 { 
					 try
					 {
						 Double.parseDouble(str);
						 return "double";
					 }
					 catch(Exception e2)
					 {
						 return "String";
					 }
				 }
			
			 }
	 }
}
