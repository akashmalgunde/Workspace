import java.util.Scanner;

class PlacedStudent
{
    int iFRN;
    String SName;
    double Distance;
    String sCompanyName;
    String Designation;

    PlacedStudent()
    {
        this.iFRN = 1;
        this.SName = "S1";
        this.Distance = 100;
        this.sCompanyName = "C1";
        this.Designation = "D1";
    }
	
	public PlacedStudent(int frn,String name,double dist,String scompanyname,String Designation)
	{
		this.iFRN = frn;
		this.SName = name;
		this.Distance = dist;
		this.sCompanyName = scompanyname;
		this.Designation = Designation;	
	}


	void setFRN(int frn)
	{this.iFRN = frn;}

	void setName(String name)
	{this.SName = name;}

	void setDistance(double distance)
	{this.Distance = distance;}
	
	void setCompanyName(String companyname)
	{this.sCompanyName = companyname;}
	
	void setDesignation(String designation)
	{this.Designation = designation;}


	int getFRN()
	{return this.iFRN;}

	String getName()
	{return this.SName;}
	
	double getDistance()
	{return this.Distance;}
	
	String getCompanyName()
	{return this.sCompanyName;}
	
	String getDesignation()
	{return this.Designation;}
    void Display()
    {
        System.out.println("FRN number of placed student is : "+this.iFRN);
        System.out.println("Name of student is : "+this.SName);
        System.out.println("Distance is : "+this.Distance);
        System.out.println("Name of the company is :"+this.sCompanyName);
        System.out.println("Designation of student is : "+this.Designation);
    }
}

class TestPlacedStudent
{
    public static void main(String args[])
    {

	int frn = 0;
 	String name = "\0";
	double distance = 0;
	String companyname = "\0";
	String designation = "\0";

        PlacedStudent pobj = new PlacedStudent();

        pobj.Display();

	PlacedStudent pobj1 = new PlacedStudent(123,"sp1",250,"ncircle","SDE");
	
	pobj1.Display();

	Scanner sobj = new Scanner(System.in);

	System.out.println("Enter the frn:");
	frn = sobj.nextInt();
	
	System.out.println("Enter the name:");
	sobj.nextLine();
	name = sobj.nextLine();

	System.out.println("Enter the distance:");
	distance = sobj.nextDouble();
	
	sobj.nextLine();
	System.out.println("Enter the company name:");
	companyname = sobj.nextLine();

	System.out.println("Enter the Designation:");
	designation = sobj.nextLine();


	PlacedStudent pobj2 = new PlacedStudent(frn,name,distance,companyname,designation);
	
	pobj2.Display();	

 
    }
}