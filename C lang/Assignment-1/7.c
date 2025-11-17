#include<stdio.h>

int main()
{
    double dBasicSal = 5005;
    double dDa = 0.0;
    double dTa = 0.0;
    double dHra = 0.0;
    double dTotalSal = 0.0;
    
    if(dBasicSal <= 5000)
    {
        dDa = dBasicSal * 10 / 100;
        dTa = dBasicSal * 20 / 100;
        dHra = dBasicSal * 20 / 100;
    }
    else
    {
        dDa = dBasicSal * 15 / 100;
        dTa = dBasicSal * 25 / 100;
        dHra = dBasicSal * 30 / 100;
    }

    dTotalSal = dBasicSal + dDa + dTa + dHra;

    printf("Total salary is %lf ",dTotalSal);


    return 0;
}