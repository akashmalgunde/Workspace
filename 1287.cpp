#include<iostream>
using namespace std;


class Digits
{
    private:

    int iNo = 0;

    public:

    Digits(int i)
    {
        this->iNo = i;
    }

    int calDif()
{
    int iTemp = iNo;
    int iSmall = 9;
    int iGreat = 0;
    int iDigit = 0;

    while(iTemp != 0)
    {
        iDigit = iTemp % 10;
        if(iDigit > iGreat)
            iGreat = iDigit;
        if(iDigit < iSmall)
            iSmall = iDigit;

        iTemp = iTemp / 10;

        cout<<"small value : "<<iSmall<<"\n";
        cout<<"great value : "<<iGreat<<"\n";
    }

    cout<<"great :"<<iGreat<<"\n";
     cout<<"small :"<<iSmall<<"\n";


    return iGreat - iSmall;
}
};



int main()
{
    Digits d(83921);

    cout<<d.calDif()<<"\n";

    return 0;
}