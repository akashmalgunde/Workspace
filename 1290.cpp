#include<iostream>
using namespace std;

class Pattern
{
    private:
    int iRows;

    public:

    Pattern(int i)
    {
        this->iRows = i;
    }

    void display()
    {
        int iCnt = this->iRows;
        for(int i = 1; i <= this->iRows; i++)
        {
            for(int j = 1; j <= iRows; j++)
            {
                if(j <= i)
                    cout<<j<<" ";
                else
                    cout<<"  ";
            }

            // Right part
        for(int k = 1; k <= this->iRows; k++)
        {
            if(k > iCnt - i)
                cout << (iCnt - k + 1) << " ";
            else
                cout << "  ";
        }


            cout<<"\n";
        }
    }
};

int main()
{
    Pattern p(5);

    p.display();

    return 0;
}