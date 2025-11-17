#include<stdio.h>

int Swapping(int iValue1,int iValue2)
{
    int iTemp = 0;

    iTemp = iValue2;
    iValue2 = iValue1;
    iValue1 = iTemp;

    printf("%d and %d after swapping",iValue1 , iValue2);
}

int main()
{
    int iNo1 = 0;
    int iNo2 = 0;
    
    printf("Enter the value of first number: ");
    scanf("%d",&iNo1);

    printf("Enter the value of second number:");
    scanf("%d",&iNo2);

    printf("Before swapping: %d and %d",iNo1,iNo2);

    Swapping(iNo1,iNo2);

    //printf("After swapping : %d and %d",iNo1,iNo2);

    return 0;
}