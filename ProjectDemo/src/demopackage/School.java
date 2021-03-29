package demopackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class School {
public static void main(String args[])
{
	ArrayList<Teacher> list=new ArrayList<Teacher>();
	list.add(new Teacher(104,25000,"Priya","Maths"));
	list.add(new Teacher(101,20000,"Gayathri","English"));
	list.add(new Teacher(102,15000,"Anu","Tamil"));
	list.add(new Teacher(105,26000,"Ravi","Science"));
	list.add(new Teacher(103,19000,"Kavi","Social"));
	
	Collections.sort(list);
	for(Teacher t:list)
	{
		System.out.println("Teacher ID: "+t.id+" "+"Teacher salary: "+" "+t.salary+" "+"Teacher Name: "+" "+t.name+"  "+"Teacher Subject: "+" "+t.subject);;	
	}
}
}

class Teacher implements Comparable<Teacher>
{
	int id,salary;
	String name,subject;
	public Teacher(int id, int salary, String name, String subject) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.subject = subject;
	}
	@Override
	public int compareTo(Teacher o) {
		if(salary==o.salary)
		{
			return 0;
		}
		else if(salary<o.salary)
		{
		return 1;
		}
		else
		{
			return -1;
		}
	}
}
