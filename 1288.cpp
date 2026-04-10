#include<iostream>
using namespace std;

class Numbers
{
    private:
    int iNo;

    public:

    Numbers(int i)
    {
        this->iNo = i;
    }

    int calFact(int j)
    {
        int iFact = 1;

        for(int i = 2; i <= j; i++)
        {
            iFact = iFact * i;
        }

        return iFact;
    }

    int calsum()
    {
        int iSum = 0;
        int iDigit = 0;
        int iTemp = this->iNo;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;
            iSum = iSum + calFact(iDigit);
            iTemp = iTemp / 10;
        }

        return iSum;
    }

    bool checkPeterson()
    {
        bool bRet = false;

        //cout<<calsum()<<"and "<<this->iNo<<"\n";

        if(calsum() == this->iNo)    
            bRet = true;

        return bRet;
    }
};


int main()
{

    Numbers *n = new Numbers(145);

    if(n->checkPeterson())
        cout<<"Peterson";
    else
        cout<<"Not Peterson";

    return 0;
}