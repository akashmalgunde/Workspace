class Student
{
    int iRollno;
    String Name;
    float Percentage;
}

class Employee
{
    int id;
    String Name;
    double AnnualSalary;
}

class Bank
{
    void ApproveLoan(float fper)
    {
        if(fper > 80)
        {
            System.out.println("2 lakh loan will get approve");
        }

        else if(fper >= 60 && fper <= 80)
        {
            System.out.println("1 lakh loan will get approve");
        }

        else if(fper < 60 && fper >= 40) 
            System.out.println("5o thousand loan will get approve");
    
        else
            System.out.println("No loan will get approve");
    }

    void ApproveLoan(double dSal)
    {
        if(dSal >= 12)
            System.out.println("7 lakh loan will get approve");

        else if(dSal >= 10 && dSal < 12)
            System.out.println("6 lakh loan will get approve");

        else if(dSal >= 6 && dSal <= 10)
            System.out.println("5 lakh loan will get approved");
        else if(dSal >= 4 && dSal < 6)
            System.out.println("4 lakh loan will get approve");
        else if(dSal < 4)
            System.out.println("No loan will get approve");

    }


}

class TestBank
{
    public static void main(String args[])
    {
        Bank aobj = new Bank();

        aobj.ApproveLoan(85.20f);
        aobj.ApproveLoan(1000000.00);

    }
}