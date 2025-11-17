#include<stdio.h>

int main()
{
    int iHr = 2;

    int iMin = 36;

    int iSec = 6;

    int iTotalSec = 0;

    iTotalSec = iHr * 60 * 60 + iMin * 60 + iSec;

    printf("%d is the total seconds of time %d:%d:%d\n",iTotalSec,iHr,iMin,iSec);

    return 0; 
}