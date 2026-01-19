package p1;

import java.util.Set;
import java.util.TreeSet;

class myClass
{
	//public String toString()
	//{
		//return "My toString of myClass";
	//}
}

public class MyTreeSet 
{
	public static void main(String args[])
	{
		Set s1 = new TreeSet();
		s1.add(10);
		s1.add(30);
		s1.add(20);
		s1.add(25);
		System.out.println(s1.add(20));
		
		//System.out.println(s1);
		
		for(Object i : s1)
			System.out.println(i);
		
		System.out.println(s1.size());
		
		System.out.println(s1.contains(250));
		
		myClass mobj = new myClass();
		
		System.out.println(mobj);
	}
}
