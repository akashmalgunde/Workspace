class Time
{
    int iHour;
    int iMin;
    int iSec;

    public Time(int Hour,int Min)
    {
        this.iHour = Hour;
        this.iMin = Min;
    }

    void Add(Time tobj2)
    {
        int iHour = this.iHour + tobj2.iHour;
        int iMin = this.iMin + tobj2.iMin;
        int iSec = this.iSec + tobj2.iSec;

        System.out.println(iHour+"/"+iMin+"/"+iSec);
    }

    void Add(int iHour,int iMin,int iSec)
    {
        int Hour = this.iHour + iHour;
        int Min = this.iMin + iMin;
        int Sec = this.iSec + iSec;

        System.out.println(Hour +"/"+Min+"/"+Sec);
    }
}

class TestTime
{
    public static void main(String args[])
    {
        Time tobj = new Time(10,20);

        Time tobj1 = new Time(1,20);

        tobj.Add(tobj);
        tobj.Add(10,20,0);  
    }
}