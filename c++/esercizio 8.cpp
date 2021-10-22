#include <iostream> 
using namespace std;
int main()
{
    double a,b,c;
    cout<<"Fra tre numeri, mostrerò il maggiore "<<endl;
    cin>>a;
    cin>>b;
    cin>>c;
    if (a>b){
        if (a>c){
            cout<<"il numero più grande è "<<a;
        }
        else{
            cout<<"il numero più grande è "<<c;
        }
    }
    else if (b>c){
        cout<<"il numero più grande è "<<b;
    }
    else {
        cout<<"il numero più grande è "<<c;
    }

 return 0;   
}