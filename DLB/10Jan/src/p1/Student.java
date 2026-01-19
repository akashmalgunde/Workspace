package p1;
import java.util.List;
import java.util.ArrayList;

public class Student 
{
	int iRollNo;
	String sName;
	
	public Student(int iRollNo,String sName)
	{
		this.iRollNo = iRollNo;
		this.sName = sName;
	}
	
	public String toString()
	{
		return "iRollNo :"+this.iRollNo+"Name :"+this.sName;
	}
	
	public boolean equals(Object o)
	{
		Student s2 = (Student)o;
		System.out.println("Inside equals of student");
		if(this.iRollNo == s2.iRollNo)
			return true;
		else
			return false;
		
	}
}

class MyStudentTest
{
	public static void main(String args[])
	{
		List<Student> l1 = new ArrayList<Student>();
		
		l1.add(new Student(7,"Dhoni"));
		l1.add(new Student(10,"Sachin"));
		//l1.add(10);
		
		System.out.println(l1);
		
		if(l1.contains(new Student(7,"Dhoni")))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		for(Student s : l1)
			System.out.println(s);
	}
}
