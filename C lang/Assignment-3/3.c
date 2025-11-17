#include<stdio.h>


int main()
{
    int iCnt = 0;
    int iSum = 0;

    iCnt = 1;
    while(iCnt <= 5)
    {
        iSum = iSum + iCnt;
        iCnt++;

    }

    printf("Summation of number from 1 to 5 is : %d\n",iSum);

    return 0;
}
