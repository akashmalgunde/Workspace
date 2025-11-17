#include<stdio.h>

int main()
{
    char ch = 'a';

    if(ch >= 'A' && ch <= 'Z')
    {
        printf("%c is uppercase character\n",ch);
    }
    else
    {
        printf("%c is lowercasse character\n",ch);
    }
}