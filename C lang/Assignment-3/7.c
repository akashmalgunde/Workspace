#include<stdio.h>

int main()
{
    int iCnt = 0;
    int iFact = 1;

    iCnt = 1;
    while(iCnt <= 5)
    {
        iFact = iFact * iCnt;
        iCnt++;
    }
    printf("%d\n",iFact);

    return 0;
}