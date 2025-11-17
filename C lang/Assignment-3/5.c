#include<stdio.h>

int main()
{
    int n = 15;
    int iDigit = 0;
    int iSum = 0;
    int iOrig = n;

    while(n != 0)
    {
        iDigit = n % 10;
        iSum = iSum + iDigit * iDigit * iDigit;
        n = n /10;
    }

    if(iSum == iOrig)
    {
        printf("%d is an armstrong number\n",iOrig);
    }
    else
    {
        printf("%d is not an armstrong number\n",iOrig);
    }

    return 0;
}