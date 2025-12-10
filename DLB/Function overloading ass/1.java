class Calculator
{
    int Addition(int a,int b)
    {
        System.out.println("Inside the addition fun both parameters are int");
        return a + b;
    }

    double Addition(double a,double b)
    {
        System.out.println("Inside the addition fun both parameters are double");
        return a + b;
    }

    double Addition(int a,double b)
    {
        System.out.println("Inside the addition fun one parameters is int and 1 is double");
        return a + b;
    }

    double Addition(double a,int b)
    {
        System.out.println("Inside the addition fun one parameters is  double and other is int");
        return a + b;
    }

    int Subtraction(int a,int b)
    {
        System.out.println("Inside the Subtraction fun both parameters are int");
        return a - b;
    }

    double Subtraction(double a,double b)
    {
        System.out.println("Inside the Subtraction fun both parameters are double");
        return a - b;
    }

    double Subtraction(int a,double b)
    {
        System.out.println("Inside the Subtraction fun one parameters is  int and other is double");
        return a - b;
    }

    double Subtraction(double a,int b)
    {
        System.out.println("Inside the Subtraction fun one parameters double and other is int");
        return a - b;
    }

    int Multiply(int a,int b)
    {
        System.out.println("inside mul fun both are int");
        return a * b;
    }

    double Multiply(double a,double b)
    {
        System.out.println("inside mul fun both are double");
        return a * b;
    }

    double Multiply(int a,double b)
    {
        System.out.println("inside mul fun one is int and other is  double");
        return a * b;
    }

    double Multiply(double a,int b)
    {
        System.out.println("Inside mul fun one param is double and other is int");
        return a * b;
    }

    int Division(int a,int b)
    {
        System.out.println("Inside division both param are int");
        return a / b;
    }

    double Division(double a,double b)
    {
        System.out.println("Inside division both param are double");
        return a / b;
    }

    double Divivsion(int a,double b)
    {
        System.out.println("Inside division one param is int and 2nd double");
        return a / b;
    }

    double Divivsion(double a,int b)
    {
        System.out.println("Inside division one param is double and 2nd int");
        return a / b;
    }
}


class TestArithmetic
{
    public static void main(String args[])
    {
        Calculator aobj = new Calculator();
        

        System.out.println(aobj.Subtraction(2,2.00));

        System.out.println(aobj.Addition(2,2));


        System.out.println(aobj.Multiply(50f, 20f));

        System.out.println(aobj.Division(2, 04f));



    }
}

