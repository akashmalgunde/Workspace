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
}

class TestDate
{
    public static void main(String args[])
    {
        Date d = new Date();

        d.Display();

        Date d1 = new Date(1,1,2025,"Wednesday");

        d1.Display();
    }
}