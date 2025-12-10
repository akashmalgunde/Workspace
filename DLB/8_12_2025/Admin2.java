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
}

class TestAdmin
{
    public static void main(String args[])
    {
        Admin a = new Admin();

       a.Display();

       Admin a1 = new Admin(2,"S1",26000,2000);

       a1.Display();
    }
} 
