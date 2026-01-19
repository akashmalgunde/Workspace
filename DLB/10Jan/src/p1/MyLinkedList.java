package p1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList 
{
	public static void main(String args[])
	{
		List<Integer> L1 = new LinkedList<Integer>();
		//L1.add("First Bit");
		L1.add(10);
		L1.add(30);
		L1.add(20);
		
		//System.out.println(L1);
		
		L1.add(20);
		
		System.out.println(L1.size());
		
		System.out.print("[ ");
		for(int i = 0; i < L1.size(); i++)
			System.out.print(L1.get(i)+", ");
		System.out.print("]");
		
		for(Object o : L1)
			System.out.println(o);
		
		
		int iArr[] = new int[5];
		
		for(int i : iArr)
			System.out.println(i);
		
		if(L1.contains(220))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		System.out.println(L1.remove(1));
	}
	
	/*public static void main123(String args[])
	{
		
		ArrayList<Integer> L1 = new ArrayList<Integer>();
		
		L1.add(10);
		L1.add(30);
		L1.add(20);
		
		System.out.println(L1);
	}*/
}
