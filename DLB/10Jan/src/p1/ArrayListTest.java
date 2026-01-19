package p1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest 
{
	public static void main(String args[])
	{
		ArrayList L1 = new ArrayList();
		L1.add( 10);
		L1.add(30);
		L1.add(20);
		
		System.out.println(L1);
		
		L1.add(20);
		
		Collections.sort(L1);
		
		System.out.println(L1);
		
	}
}
