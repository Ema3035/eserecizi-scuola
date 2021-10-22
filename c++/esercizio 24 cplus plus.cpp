#include <iostream>
using namespace std;
int main()
{
    double prezzo,aumento,sconto,prezzoscont;
    cout<<"Dimmi la cifra dell'aumento ";
    cin>>aumento;
    cout<<"Dimmi il prezzo della merce ";
    cin>>prezzo;
    sconto=(prezzo*10/100);
    prezzoscont=(prezzo-sconto);
    cout<<"In totale devi pagare ";
    cout<<prezzoscont;
    return 0;
}
