#include <iostream>
using namespace std;
int main()
{
    double numero,successivo,quadrato;
    cout<<"Inserisci un numero il quale calcoleremo il successivo del quadrato "<<"\n";
    cin>>numero;
    quadrato=(numero*numero);
    successivo=(quadrato+1);
    cout<<"il numero è ";
    cout<<successivo;
    return 0;

}
