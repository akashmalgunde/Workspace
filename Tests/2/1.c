#include<stdio.h>

int CalculateBill(int iUnit)
{
    int iRet = 0;

    if(iUnit < 0)
    {
        iUnit = - iUnit;
    }

    if(iUnit >= 1 && 50 > iUnit)
    {
        iRet = iUnit * 30;
    }
    else if(iUnit >= 51 && 150 >= iUnit)
    {
        iRet = 40 * iUnit;
    }
    else if(iUnit > 150)
    {
        iRet = 50 * iUnit;
    }

    return iRet;
}

int main()
{
    int iUnit = 0;
    int iRet = 0;

    printf("Enter the Units:\n");
    scanf("%d",&iUnit);

    iRet = CalculateBill(iUnit);

    printf("%d is total bill for %d\n",iRet,iUnit);

    return 0;
}