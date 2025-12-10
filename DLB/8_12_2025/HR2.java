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
}

class TestHR
{
    public static void main(String args[])
    {
        HR h =new HR();

        h.Display();

        HR h1 = new HR(1,"H@",25000,1500);

        h1.Display();
    }
} 
