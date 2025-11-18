#include<stdio.h>

void Withdraw(double dAccountBal,double dWithdraw)
{
    if(dAccountBal < 3000)
    {
        printf("Cant withdraw account balance is less than 3000\n");
        return;
    }
    dAccountBal = dAccountBal - dWithdraw;
    printf("%lf is total amount after the %lf withdrawal amount\n",dAccountBal,dWithdraw);
}

void Deposit(double dAccountBal,double dDeposite)
{
    dAccountBal = dAccountBal + dDeposite;
    printf("%lf is total amount after the %lf deposite\n",dAccountBal,dDeposite);
}

int main()
{
    double dAccountBal = 0.0f;
    double dWithdraw = 00.0f;
    double dDeposit = 0.0f;
    int iChoise = 0;

    printf("Enter the amount:\n");
    scanf("%lf",&dAccountBal);

    printf("Which Operation do you want to do:\n");
    printf("1.Withdraw\n");
    printf("2.Deposit\n");
    scanf("%d",&iChoise);

    if(iChoise == 1)
    {
        printf("Enter the amount that you want to withdraw:\n");
        scanf("%lf",&dWithdraw);

        Withdraw(dAccountBal,dWithdraw);
    }



    return 0;
}