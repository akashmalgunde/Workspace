#include<stdio.h>

double calculateSellingPrice(double dCost,int iDisc)
{
    double dSellingPrice = 0.0f;

    iDisc = dCost * iDisc / 100;

    printf("%d\n",iDisc);
    //printf("%lf\n",dCost);

    dSellingPrice = dCost - iDisc;

    return dSellingPrice;
}

int main()
{
    double dCost = 0.0f;
    int iDisc = 0;
    double dRet = 0.0f;

    printf("Enter the cost price:\n");
    scanf("%lf",&dCost);

    printf("Enter the discount:\n");
    scanf("%d",&iDisc);

    dRet = calculateSellingPrice(dCost,iDisc);

    printf("for %lf",dRet);

    return 0;
}