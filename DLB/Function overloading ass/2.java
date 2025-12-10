class Triangle
{
    double dBase;
    double dHeight;
}

class Rectangle
{
    double dLen;
    double dBreadth;
}

class Circle
{
    double dRadius;
}

class Shape
{
    double Area(double rad)
    {
        return 3.14 * rad * rad;
    }

    double Area(double dBase,double dHeight)
    {
        return 0.5 * dBase * dHeight;
    }

    int Area(int iLen,int iBredth)
    {
        return iLen * iBredth;
    }
}

class TestShape
{
    public static void main(String args[])
    {
        Shape s = new Shape();

        System.out.println(s.Area(10));
        System.out.println(s.Area(2,4));
        System.out.println(s.Area(10.0000,5.0000));
    }
}