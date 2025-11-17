#include<stdio.h>

int main()
{
    char cDes = 'n';
    int iPur = 500;

    if(cDes == 'y')
    {
        if(iPur > 500)
        {
            printf("You will get 20 percent discount.\n");
        }
        else
        {
            printf("You will get 10 percent discount.\n");
        }
    }
    else
    {
        if(iPur > 600)
        {
            printf("You are not a student and you wiil get 15 percent discount\n");
        }
        else
        {
            printf("You will not get any discount\n");
        }
    }

    return 0;
}