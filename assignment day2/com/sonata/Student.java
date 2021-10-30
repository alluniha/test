package com.sonata;

public class Student {
	int stdID;
	String stdName;
	int stdClass;
	Student()
	{
	}
	Student(int id,String name,int stdclass)
	{
		this.stdID=id;
		this.stdName=name;
		this.stdClass=stdclass;
	}
	public void display()
	{
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdClass);
	}
	public static void main(String args[])
	{
		Student s=new Student();
		s.stdID=1;
		s.stdName="niha";
		s.stdClass=9;
		s.display();
		
		Student s1=new Student(2,"hani",10);
		s1.display();
	}

}

