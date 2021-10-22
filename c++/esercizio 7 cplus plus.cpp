#include <iostream>
using namespace std;
int main()
{
    int temperatura;
    cout<<"Inserire temperatura";
    cin>>temperatura;
    if (temperatura>0)
       cout<<"sopra lo zero";
	    else if (temperatura=0)
            cout<<"uguale a zero";
            else 
            cout<<"sotto lo zero";
            return 0;
    
}