#include<stdio.h>

int main()
{
    int n1 = 145;
    for(int i = 1; i <= n1; i++)
    {
        int iTemp = i;
        int iDigit = 0;
        int iSum = 0;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;

            int iFact = 1;

            for(int i = iDigit; i >= 1; i--)
            {
                iFact = iFact * i;
            }

            iSum = iSum + iFact;

            iTemp = iTemp / 10;
        }

        if(iSum == i)
        {
            printf("%d is strong number\n",i);
        }
        else
        {
            printf("%d is not a strong number\n",i);
        }
    }


    return 0;
}