#include<stdio.h>

int main()
{
    int iNo1 = 4;
    int iNo2 = 3;

    char ch = '*';

    if(ch == '+')
    {
        printf("Addition is: %d\n",iNo1 + iNo2);
    }
    else if(ch == '-')
    {
        printf("Subtraction is %d \n",iNo1 - iNo2);
    }
    else if(ch == '*')
    {
        printf("Multiplication is %d \n",iNo1 * iNo2);
    }
    else if(ch == '/')
    {
        printf("Division is %d\n",iNo1 / iNo2);
    }
    else if(ch == '%')
    {
        printf("Mod is %d\n",iNo1 % iNo2);
    }

    return 0;
}