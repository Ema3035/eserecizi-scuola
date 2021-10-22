#include <iostream>
using namespace std;
int main()
{
    int numero;
    cout<<"Inserito un numero ti dirò se pari o dispari"<<endl;
    cin>>numero;
    if (numero%2==0)
    {
        cout<<"Numero pari";
    } else 
    {
        cout<<"Numero dispari";
    }
    
}