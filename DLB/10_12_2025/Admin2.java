import java.util.*;

class Admin
{
    int id;
    String Name;
    double Salary;
    double Allowance;

	Admin()
	{
		this.id = 1;
		this.Name = "S";
		this.Salary = 25000;
		this.Allowance = 1000; 
	}

    Admin(int id,String name,double salary,double allowance)
	{
		this.id = id;
		this.Name = name;
		this.Salary = salary;
		this.Allowance = allowance; 
	}

    void Display()
    {
        System.out.println("Id of the Admin is :" + this.id);
        System.out.println("Name os the Admin is : "+this.Name);
        System.out.println("Salary of Admin is : "+this.Salary);
        System.out.println("Allowance of Admin is : "+this.Allowance);
    }

    void setId(int id)
    {
        this.id = id;
    }

    void setName(String name)
    {
        this.Name = name;
    }

    void setSalary(double salary)
    {
        this.Salary = salary;
    }

    void setAllowance(double allowance)
    {
        this.Allowance = allowance;
    }

    int getId()
    {
        return this.id;
    }

    String getName()
    {
        return this.Name;
    }

    double getSalary()
    {
        return this.Salary;
    }

    double getAllowance()
    {
        return this.Allowance;
    }
}

class TestAdmin
{
    public static void main(String args[])
    {
        Admin a = new Admin();

       a.Display();

       Admin a1 = new Admin(2,"S1",26000,2000);

       int id = 0;
       String name = "\0";
       double salary = 0;
       double Allowance = 0;

       Scanner sobj = new Scanner(System.in);

       id = sobj.nextInt();
       sobj.nextLine();
       name = sobj.nextLine();
       salary = sobj.nextDouble();
       Allowance = sobj.nextDouble();

       Admin a2 = new Admin(id,name,salary,Allowance);

       a1.Display();

       a2.Display();

    }
} 
