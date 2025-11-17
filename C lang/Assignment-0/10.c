#include<stdio.h>

int main()
{
    int iSub1 = 90;

    int iSub2 = 85;

    int iSub3 = 95;

    int iSub4 = 90;

    int iSub5 = 95;

    int iSum = 0;

    float fPer = 0;

    iSum = iSub1 + iSub2 + iSub3 + iSub4 + iSub5;

    fPer = iSum / 5;

    printf("Your percentage is : %f\n",fPer);

    return 0;
}