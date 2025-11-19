#include<stdio.h>
#include<stdbool.h>

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
    printf("Entered elements are:\n");
    for(int i = 0; i < iSize; i++)
    {
        printf("%d\t",Arr[i]);
    }
    printf("\n");
}

bool CheckPalindrome(int *Arr,int iSize)
{
    bool bRet = true;
    int Brr[5];

    for(int i = 0,j = iSize - 1; i < iSize; i++,j--)
    {
        Brr[i] = Arr[j];
    }

    for(int i = 0; i < iSize; i++)
    {
        if(Arr[i] != Brr[i])
        {
            bRet= false;
            break;
        }
    }

    return bRet;

    Display(Brr,5);
}


int main()
{
    int Arr[5];
    bool bRet = false;


    Accept(Arr,5);

    Display(Arr,5);

    bRet = CheckPalindrome(Arr,5);

    if(bRet == true)
    {
        printf("Array is palindrome\n");
    }
    else
    {
        printf("Array is not palindrome\n");
    }

    return 0;
}