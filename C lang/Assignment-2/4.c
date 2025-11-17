#include<stdio.h>

int main()
{
    int iMarks = 53;

    if(iMarks >= 75)
    {
        printf("Distinction");
    }
    else if(75 > iMarks && iMarks >= 65)
    {
        printf("First Class");
    }
    else if(iMarks >= 55 && iMarks < 65)
    {
        printf("Second Class");
    }
    else if(iMarks >= 40 && iMarks < 55)
    {
        printf("pass");
    }
    else if(iMarks < 40)
    {
        printf("Fail");
    }

    return 0;
}