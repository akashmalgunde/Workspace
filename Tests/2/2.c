#include<stdio.h>

void CheckNumber(int iValue)
{
    if(iValue > 0)
    {
        printf("%d is positive\n",iValue);
    }
    else if(iValue < 0)
    {
        printf("%d is negative\n",iValue);
    }
    else if(iValue == 0)
    {
        printf("%d is neutral\n",iValue);
    }
}

int main()
{
    int iNo = 0;

    printf("Enter the number:\n");
    scanf("%d",&iNo);

    CheckNumber(iNo);

    return 0;
}