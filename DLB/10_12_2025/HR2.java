import java.util.Scanner;

class HR
{
    int id;
    String Name;
    double Salary;
    double dCommision;

    void Display()
    {
        System.out.println("Id of the HR is :" + this.id);
        System.out.println("Name os the HR is : "+this.Name);
        System.out.println("Salary of HR is : "+this.Salary);
        System.out.println("Incentive of HR is : "+this.dCommision);
    }

    HR()
    {
        this.id = 2;
        this.Name = "HName";
        this.Salary = 25000;
        this.dCommision = 1500;
    }


    HR(int id,String Name,double salary,double commision)
    {
        this.id = id;
        this.Name = Name;
        this.Salary = salary;
        this.dCommision = commision;
    }

	void setID(int id)
	{this.id = id;}
	
	void setName(String Name)
	{this.Name = Name;}

	void setSalary(double dsal)
	{this.Salary = dsal;}

	void setIncentive(double dincen)
	{this.dCommision = dincen;}

	int getID()
	{return this.id;}

	String getName()
	{return this.Name;}
	
	double getSalary()
	{return this.Salary;}
		
	double getCommision()
	{return this.dCommision;}
	}

class TestHR
{
    public static void main(String args[])
    {

	int id = 0;
	String name = "\0";
	double salary = 0;
	double incentive = 0;

        HR h =new HR();

        h.Display();

        HR h1 = new HR(1,"H@",25000,1500);

        h1.Display();

	Scanner sobj = new Scanner(System.in);

	System.out.println("Enter id:");
	id = sobj.nextInt();

	System.out.println("Enter the name:");
	sobj.nextLine();
	name = sobj.nextLine();
	
	System.out.println("Enter the salary:");
	salary = sobj.nextDouble();

	System.out.println("Enter the Incentive:");
	incentive = sobj.nextDouble();

	HR h2 = new HR(id,name,salary,incentive);
	h2.Display();
    }
} 
