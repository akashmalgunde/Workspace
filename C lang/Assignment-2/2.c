#include<stdio.h>

int main()
{   
    int iSide1 = 4;
    int iSide2 = 5;
    int iSide3 = 3;

    if(iSide1 == iSide2 && iSide2 == iSide3)
    {
        printf("Triangle is Equilatral triangle\n");
    }
    else if(iSide1 != iSide2 && iSide2 !=iSide3 && iSide1 != iSide3)
    {
        printf("Triangle is scalen trianle\n");
    }
    else if(iSide1 == iSide2 || iSide1 == iSide3 || iSide2 == iSide3)
    {
        printf("Tringle is isoscalen tringle\n");
    }

    return 0;
}