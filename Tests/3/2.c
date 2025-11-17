#include<stdio.h>

void DisplayAlternate(int iStart,int iEnd)
{
    for(int i = iStart; i <= iEnd; i = i + 2)
    {
        printf("%d\t",i);
    }

}

int main()
{
    int iStart = 0;
    int iEnd = 0;

    printf("Enter the start:");
    scanf("%d",&iStart);

    printf("Enter the end:");
    scanf("%d",&iEnd);

    DisplayAlternate(iStart,iEnd);

    return 0;
}