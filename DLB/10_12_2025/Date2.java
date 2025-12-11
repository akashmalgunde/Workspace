import java.util.*;

class Date
{
    int day;
    int month;
    int iYear;
    String dow;

	Date()
	{

        System.out.println("Default constructor called");
		this.day = 8;
		this.month = 12;
		this.iYear = 2025;
		this.dow = "Monday";
	}

    public Date(int day,int month,int year,String dow)
	{
		this.day = day;
		this.month = month;
		this.iYear = year;
		this.dow = dow;		
	}

    void Display()
    {
        System.out.println("Day is :"+this.day);
        System.out.println("Month is : "+this.month);
        System.out.println("Year is :"+this.iYear);
        System.out.println("DOW is :"+this.dow);
        System.out.println("\n");
    }

	void setDay(int day)
	{this.day = day;}
	
	void setMonth(int month)
	{this.month = month;}
	
	void setYear(int year)
	{this.iYear = year;}

	void setDOW(String dow)
	{this.dow = dow;}

	int getDay()
	{return this.day;}
	
	int getMonth()
	{return this.month;}
	
	int getYear()
	{return this.iYear;}

	String getDOW()
	{return this.dow;}
}

class TestDate
{
    public static void main(String args[])
    {
        Date d = new Date();

        d.Display();

        Date d1 = new Date(1,1,2025,"Wednesday");

        d1.Display();

	Scanner sobj = new Scanner(System.in);

	System.out.println("Enter day:");
	int iDay = sobj.nextInt();

	System.out.println("Enter month");
	int iMonth = sobj.nextInt();

	System.out.println("Enter year");
	int iYear = sobj.nextInt();

	sobj.nextLine();
	System.out.println("Enter day");
	String dow = sobj.nextLine();

	Date d2 = new Date(iDay,iMonth,iYear,dow);
	d2.Display();

    }
}