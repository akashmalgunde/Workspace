import java.util.*;

class BankAccount
{
    long AccountNumber;
    String HolderName;
    double CurrentBalance;
    float intrestRate;

	BankAccount()
	{	
		this.AccountNumber = 996666;
		this.HolderName = "ACC1";
		this.CurrentBalance = 25000;
		this.intrestRate = 10.0f;
	}

    	public BankAccount(long accno,String holdername,double currbal,float intrestrate)
	{
		this.AccountNumber = accno;
		this.HolderName = holdername;
		this.CurrentBalance = currbal;
		this.intrestRate = intrestrate;
	}

    void Display()
    {
        System.out.println("Account number is : "+this.AccountNumber);
        System.out.println("Account Holder name is :"+this.HolderName);
        System.out.println("Current Balance is : "+this.CurrentBalance);
        System.out.println("IntrestRate of the account : "+this.intrestRate);
    }

	void setAccountNumber(long accno)
	{
		this.AccountNumber = accno;
	}
	
	void setHolderName(String holdername)
	{
		this.HolderName = holdername;
	}
	
	void setCurrentBalance(double currentbalance)
	{
		this.CurrentBalance = currentbalance;
	}

	void setIntrestRate(float intrestrate)
	{
		this.intrestRate = intrestrate;
	}

	long getAccountNumber()
	{
		return this.AccountNumber;
	}
	
	String getHolderName()
	{
		return this.HolderName;
	}
	
	double getCurrentBalance()
	{
		return this.CurrentBalance;
	}

	float getIntrestRate()
	{
		return this.intrestRate;
	}
	}

class TestBankAccount
{
    public static void main(String args[])
    {
        BankAccount b = new BankAccount();

        b.Display();

        BankAccount b1 = new BankAccount(2314,"Acc2",26000,1.5f);

        b1.Display();

	long accno = 0;
	String name = "\0";
	double curbal = 0;
	float interstrate = 0.0f;

	Scanner sobj = new Scanner(System.in);
	
	System.out.println("Enter the acc no:");
	accno = sobj.nextLong();
	System.out.println("Enter the Name:");
	sobj.nextLine();
	name = sobj.nextLine();
	System.out.println("Enter the current balance:");
	curbal = sobj.nextDouble();
	System.out.println("Enter the intrest rate:");
	interstrate = sobj.nextFloat();

	
	BankAccount b2 = new BankAccount();
	
	b2.Display();

	BankAccount b3 = new BankAccount(accno,name,curbal,interstrate);

    }
}