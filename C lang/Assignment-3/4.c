#include<stdio.h>

int main()
{

    int n = 0;
    int iCnt = 0;
    iCnt = 1;
    int iCnt1 = 0;

    while(iCnt <= n)
    {
        if(n % iCnt == 0)
        {
            iCnt1++;
        }
        iCnt++;
    }

    if(iCnt1 == 2)
    {
        printf("%d is Prime number\n",n);
    }
    else if(n == 0)
    {
        printf("0 is not a prime nor composite number\n",n);
    }
    else
    {
        printf("%d is not a prime number\n",n);
    }



    return 0;
}