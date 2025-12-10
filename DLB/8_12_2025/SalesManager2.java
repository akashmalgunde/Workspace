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
}

class TestSalesManager
{
    public static void main(String args[])
    {
        SalesManager s =new SalesManager();

        s.Display();

	SalesManager s1 = new SalesManager(2,"S2",26000,1500,25);

	s1.Display();
    }
}