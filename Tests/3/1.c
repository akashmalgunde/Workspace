#include<stdio.h>

void Display(int iStart,int iEnd)
{
    for(int i = iStart; i <= iEnd; i++)
    {
        if(i % 2 == 0)
        {
            printf("%d is even\n",i);
        }
        else
        {
            printf("%d is odd\n",i);
        }
    }
}

int main()
{
    int iStart = 0;
    int iEnd = 0;

    printf("enter the start:");
    scanf("%d",&iStart);

    printf("Enter the end:\n");
    scanf("%d",&iEnd);

    Display(iStart,iEnd);

    return 0;
}