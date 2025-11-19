#include<stdio.h>

void Accept(int *Arr,int iSize)
{
    printf("Enter the numbers:\n");
    for(int i = 0; i < iSize; i++)
    {
        scanf("%d",&Arr[i]);
    }
}

void Display(int *Arr,int iSize)
{
    printf("Entered numbers are:\n");
    for(int i = 0; i < iSize; i++)
    {
        printf("%d\t",Arr[i]);
    }
    printf("\n");
}

void Replace(int *Arr,int iSize,int x,int y)
{
    if(x < 0 || y >= iSize)
    {
        printf("Please enter valid position\n");
        return;
    }

    int iTemp = 0;

    iTemp = Arr[x - 1];
    Arr[x - 1] = Arr[y - 1];
    Arr[y - 1] = iTemp;
}

int main()
{
    int Arr[7];

    Accept(Arr,7);

    Display(Arr,7);

    Replace(Arr,7,2,5);

    Display(Arr,7);

    return 0;
}