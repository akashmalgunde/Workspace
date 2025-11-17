#include<stdio.h>

int main()
{
    int iYear = 0;

    printf("Enter the year:\n");
    scanf("%d",&iYear);

    if(iYear < 0)
    {
        printf("Invalid input\n");
        return;
    }

    if(iYear % 4 == 0)
    {
        printf("Leap year\n");
    }
    else
    {
        printf("Not a leap year\n");
    }

    return 0;
}