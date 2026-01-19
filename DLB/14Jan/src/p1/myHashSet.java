package p1;
import java.util.HashSet;

public class myHashSet 
{
	public static void main(String args[])
	{
		HashSet<Student> hs = new HashSet<Student>();
		Student s1 = new Student(18,"Kohli");
		Student s2 = new Student(10,"Sachin");
		Student s3 = new Student(7,"Dhoni");
		Student s4 = new Student(45,"Rohit");
		
		hs.add(s1);
		hs.add(s4);
		hs.add(s3);
		hs.add(s2);
		hs.add(s4);
		
		System.out.println(hs);
		
		
		
		
		
	}
}
