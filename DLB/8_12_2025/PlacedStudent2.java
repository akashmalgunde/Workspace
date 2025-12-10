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
        PlacedStudent pobj = new PlacedStudent();

        pobj.Display();

	PlacedStudent pobj1 = new PlacedStudent(123,"sp1",250,"ncircle","SDE");
	
	pobj1.Display();

 
    }
}