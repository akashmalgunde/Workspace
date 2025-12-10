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
    }
}