#include<stdio.h>

float CeltoFer(int iValue)
{
    float Fer = iValue *  + 32;

    return Fer;
}

int main()
{
    int iCel = 0;
    float fFer = 0.0;

    printf("Enter the temperature in Celcius : \n");
    scanf("%d",&iCel);

    fFer = CeltoFer(iCel);

    printf("%2f is the temperature in Fahreneit\n",fFer);


}