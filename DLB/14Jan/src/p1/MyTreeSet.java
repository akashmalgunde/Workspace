package p1;
import java.util.TreeSet;

public class MyTreeSet 
{
	public static void main(String args[])
	{
		TreeSet<Student> ts = new TreeSet<Student>();
		
		Student s1 = new Student(18,"Kohli");
		Student s2 = new Student(10,"Sachin");
		Student s3 = new Student(7,"Dhoni");
		Student s4 = new Student(45,"Rohit");
		
		ts.add(s4);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		System.out.println(ts);
		
		if(ts.contains(new Student(7,"Dhoni")))
			System.out.println("Found");
		else
			System.out.println("Not found");
			
	}
}
