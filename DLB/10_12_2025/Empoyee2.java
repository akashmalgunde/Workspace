import java.util.*;

class Employee
{
    int id;
    String Name;
    double dSalary;

	Employee()
	{	
		this.id = 101;
		this.Name = "Emp1";
		this.dSalary = 25000;
	}

   public Employee(int id,String name,double salary)
	{
		this.id = id;
		this.Name = name;
		this.dSalary = salary;
	}
	

    void Display()
    {
        System.out.println("Employee id is : "+this.id);
        System.out.println("Name of the employee : "+this.Name);
        System.out.println("Salary of the employee is : "+this.dSalary);
    }

	void setID(int id)
	{this.id = id;}
		
	void setName(String Name)
	{this.Name = Name;}
	
	void setSalary(double Salary)
	{this.dSalary = Salary;}

	int getID()
	{return this.id;}

	String getName()
	{return this.Name;}
	
	double getSalary()
	{return this.dSalary;}

}

class TestEmployee
{
    public static void main(String args[])
    {
        Employee E = new Employee();

        E.Display();

        Employee E1 = new Employee(2,"E2",52000);

	Employee E2 = new Employee(3,"E3",25000);

        E1.Display();
	E2.Display();

	Scanner sobj = new Scanner(System.in);
	
	System.out.println("Enter the id");
	int id = sobj.nextInt();
	
	sobj.nextLine();
	System.out.println("Enter the name");
	String str = sobj.nextLine();

	System.out.println("Enter the salary");
	double dsal = sobj.nextDouble();

	Employee e3 = new Employee(id,str,dsal);
	e3.Display();
    }
}