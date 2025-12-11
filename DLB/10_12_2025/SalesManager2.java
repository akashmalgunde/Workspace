import java.util.*;

class SalesManager
{
    int id;
    String Name;
    double Salary;
    double dIncentive;
    int iTarget;

    public SalesManager()
    {
        this.id = 1;
        this.Name = "S1";
        this.Salary = 25000;
        this.dIncentive = 1000;
        this.iTarget = 10;
    }

	public SalesManager(int id,String name,double dsal,double incentive,int tar)
	{
		this.id = id;
		this.Name = name;
		this.Salary = dsal;
		this.dIncentive = incentive;
		this.iTarget = tar;
	}
    void Display()
    {
        System.out.println("Id of the SalesManager is :" + this.id);
        System.out.println("Name os the salesmanager is : "+this.Name);
        System.out.println("Salary of salesManager is : "+this.Salary);
        System.out.println("Incentive is : "+this.dIncentive);
        System.out.println("Target of the salesmanager is :" +this.iTarget);
    }

	void setID(int iID)
	{this.id = iID;}

	void setName(String sName)
	{this.Name = sName;}

	void setSalary(double dSalary)
	{this.Salary = dSalary;}

	void setIncentive(double dIncentive)
	{this.dIncentive = dIncentive;}

	void setTarget(int iTarget)
	{this.iTarget = iTarget;}

	int getID()
	{
		return this.id;

	}

	String getName()
	{
		return this.Name;
	}

	double getSalary()
	{return this.Salary;}

	double getIncentive()
	{return this.dIncentive;}

	int getTarget()
	{return this.iTarget;}

}

class TestSalesManager
{
    public static void main(String args[])
    {
        SalesManager s =new SalesManager();

        s.Display();

	SalesManager s1 = new SalesManager(2,"S2",26000,1500,25);

	s1.Display();

	Scanner sobj = new Scanner(System.in);
	
	System.out.println("Enter the id:");
	int id = sobj.nextInt();
	
	sobj.nextLine();

	System.out.println("Enter name:");
	String sName = sobj.nextLine();

	System.out.println("Enter salary:");
	double dSalary = sobj.nextDouble();

	System.out.println("Enter Incentive:");
	double dIncentive = sobj.nextDouble();

	System.out.println("Enter the target:");
	int iTarget = sobj.nextInt();

	SalesManager s2 = new SalesManager(id,sName,dSalary,dIncentive,iTarget);
	s2.Display();
    }

}