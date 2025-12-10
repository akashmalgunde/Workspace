class Student
{
    int FRN;
    String Name;
    double Distance;

    public Student()
    {
        this.FRN = 1;
        this.Name = "S1";
        this.Distance = 25;
    }
	public Student(int frn,String name,double dist)
	{
		this.FRN = frn;
		this.Name = name;
		this.Distance = dist;
	}

    void Display()
    {
        System.out.println("FRN no is:"+this.FRN);
        System.out.println("Name is:"+this.Name);
        System.out.println("Distance is:"+this.Distance);
    }
}

class TestStudent
{
    public static void main(String args[])
    {
        Student s = new Student();

        s.Display();

	Student s1 = new Student(1,"S1",2500);
	
	s1.Display();
    }
}