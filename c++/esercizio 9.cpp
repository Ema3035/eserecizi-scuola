#include <iostream> 
using namespace std;
int main()
{
    double a,b;
    cout<<"inserire un numero "<<endl;
    cin>>a;
    while (a<30)
    {
        cin>>b;
        a=a+b;
    }
    cout<<"La somma dei numeri è maggiore di 30";
    return 0;
}