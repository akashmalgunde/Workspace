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
}

class TestBankAccount
{
    public static void main(String args[])
    {
        BankAccount b = new BankAccount();

        b.Display();

        BankAccount b1 = new BankAccount(2314,"Acc2",26000,1.5f);

        b1.Display();

    }
}