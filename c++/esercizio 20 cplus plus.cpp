#include <iostream>
using namespace std;
int main()
{
    double numero,doppio,successivo,quadrato;
    cout<<"Inserisci un numero il quale calcoleremo il quadrato del successivo del doppio "<<"\n";
    cin>>numero;
    doppio=(numero*2);
    quadrato=(doppio*doppio);
    successivo=(quadrato+1);
    cout<<"il numero è ";
    cout<<successivo;
    return 0;

}
