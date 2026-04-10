#include<iostream>
using namespace std;

class MyArray
{
    private:
    int iSize;
    int *iArr;

    public:

    MyArray(int iSize)
    {
        this->iSize = iSize;
        this->iArr = new int[iSize];
    }

    void accept()
    {
        cout<<"Enter the number:\n";

        for(int i = 0; i < this->iSize; i++)
        {
            cin>>this->iArr[i];
        }
    }

    void display()
    {
        cout<<"Entered array elements are:\n";

        for(int i = 0; i < this->iSize; i++)
        {
            cout<<this->iArr[i]<<" ";
        }
        cout<<"\n";
    }

    void findNum(int iTarget)
    {

        for(int i = 0; i < this->iSize; i++)
        {
            for(int j = i + 1; j < this->iSize; j++)
            {
                if(this->iArr[i] + this->iArr[j] == iTarget)
                {
                    cout<<"["<<this->iArr[i]<<","<<this->iArr[j]<<"]";
                   // return;
                }
            }
        }

    }
};

int main()
{   
    
    MyArray m(5);

    m.accept();
    m.display();

    m.findNum(6);

    return 0;
}