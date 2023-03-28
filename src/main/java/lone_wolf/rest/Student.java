package lone_wolf.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable
{
	String id;
	String name;
	String course;
	public Student(String id, String name, String course)
	{
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]"+"<br>";
	}
	
	public String serialization() throws Exception
	{
		Student s1 = new Student("101", "sai", "mpc");
		Student s2 = new Student("102", "teja", "mpc");
		Student s3 = new Student("103", "sushu", "mpc");
		Student s4 = new Student("104", "ankitha", "mpc");
		Student std[] = new Student[4];
		std[0]= s1;
		std[1]= s2;
		std[2]= s3;
		std[3]= s4;
		 
		FileOutputStream fout = new FileOutputStream("D:\\iam_b4\\object_file.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(std);
		return "Data Saved Sucessfully..!!";
	}

	public String deSerialization() throws Exception
	{
		FileInputStream fin = new FileInputStream("D:\\iam_b4\\object_file.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Student[] s = (Student[]) oin.readObject();
		
		String str = "";
		for (int i = 0; i < s.length; i++) 
		{
			str+=s[i].toString()+"<br>";
		}
		return str;
	}
	
	
}
