#include<stdio.h>

void DisplayFactor(int iStart,int iEnd)
{
    for(int i = iStart; i <= iEnd; i++)
    {
        printf("Factors of %d\t:",i);
        for(int j = 1; j <= i; j++)
        {
            if(i % j == 0)
            {
                printf("%d\t",j);
            }
        }
        printf("\n");
    }
}

int main()
{
    int iStart = 0;
    int iEnd = 0;

    printf("Enter the Start:");
    scanf("%d",&iStart);

    printf("Enter the End:");
    scanf("%d",&iEnd);

    DisplayFactor(iStart,iEnd);

    return 0;
}