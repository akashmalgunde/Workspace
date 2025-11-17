#include<stdio.h>

int main()
{
    int iCnt = 0;
    int n = 28;
    int iSum = 0;
    iCnt = 1;

    while(iCnt <= n/2)
    {
        if(n % iCnt == 0)
        {
            iSum = iSum + iCnt;
            printf("iSum is %d\n",iSum);
        }
        iCnt++;
    }

    if(iSum == n)
    {
        printf("%d is a perfect number\n",n);
    }
    else
    {
        printf("%d is not a perfect number\n",n);
    }

    return 0;
}