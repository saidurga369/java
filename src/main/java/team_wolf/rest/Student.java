package team_wolf.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student
{
	public String id;
	public String name;
	public String course;
	public String college;
	
	public Student(String id,String name,String course,String college)
	{
		this.id=id;
		this.name=name;
		this.course=course;
		this.college=college;
	}
}
