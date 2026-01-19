package p1;

import java.util.TreeMap;

public class MyTest
{
	
	public static void main(String args[])
	{
		TreeMap<MyKey,Player> tm = new TreeMap<Integer,Player>();
		tm.put(new MyKey(10), new Player(7,"Dhoni",100));
		tm.put(new MyKey(8), new Player(7,"Rohit",10));
		tm.put(new MyKey(25), new Player(7,"Virat",1000));
		tm.put(new MyKey(77), new Player(7,"Sachin",900));
		
		System.out.println(tm);
	}

}
