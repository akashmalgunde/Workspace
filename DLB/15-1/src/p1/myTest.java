package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class myTest 
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(101,"Rohit",25000);
		Employee e2 = new Employee(103,"Virat",35000);
		Employee e3 = new Employee(1,"Dhoni",1000);
		Employee e4 = new Employee(11,"Ram",95000);
		Employee e5 = new Employee(13,"Vihan",15000);
		Employee e6 = new Employee(144,"Dharmendra",100000);
		
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		
		
		int iChoise = 0;
		Scanner sobj = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Sort on the basis of Id");
			System.out.println("2.Sort on the basis of salary");
			System.out.println("3.Sort on the basis of name");
			System.out.println("4.Exit");
			System.out.println("Enter the choise:");
			iChoise = sobj.nextInt();
			
			switch(iChoise)
			{
			case 1:
				MyIdComparator myId = new MyIdComparator();
				Collections.sort(al,myId);
				
				System.out.println(al);
				break;
				
			case 2:
				MySalaryComparator mySalary = new MySalaryComparator();
				Collections.sort(al,mySalary);
				
				System.out.println(al);
				break;
				
			case 3:
				MyNameComparator myName = new MyNameComparator();
				Collections.sort(al,myName);
				
				System.out.println(al);
				break;
				
			case 4 :
				break;
				
			}
			
			if(iChoise == 4)
				break;
		}
	}

}
