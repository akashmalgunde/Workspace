package p1;

public class Student implements Comparable<Student>
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
	
	public int compareTo(Student o)//UpCasting
	{
		System.out.println("Inside the compareTo");
		//Student s = (Student)o;   // DownCasting
		//return o.iRollNo - this.iRollNo ;
		return this.sName.compareTo(o.sName);
		
		
		}
	
	public int hashCode()
	{
		return this.iRollNo;
	}
}