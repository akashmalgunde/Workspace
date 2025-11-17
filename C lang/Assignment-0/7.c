#include<stdio.h>

int main()
{
    int iMin = 70;
    int iHr = 0;
    
    iHr = iMin / 60;
    iMin = iMin % 60;

    printf("Time in Hr and remaining minute is %d and %d\n",iHr,iMin);

    return 0;
}