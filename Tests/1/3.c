#include<stdio.h>


int main()
{
    int iNo = 0;
    int iDigit = 0;

    printf("Enter the number:\n");
    scanf("%d",&iNo);

    for(int i = 1; i <= 2; i++)
    {
        iDigit = iNo % 10;

        printf("%d\t",iDigit);

        iNo = iNo / 10;
    }

    return 0;
}