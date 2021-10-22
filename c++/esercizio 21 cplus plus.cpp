#include <iostream>
using namespace std;
int main()
{
    double numero,differenza,quadrato;
    cout<<"Inserisci un numero e calcolerò la differenza tra il quadrato e il numero"<<"\n";
    cin>>numero;
    quadrato=(numero*numero);
    differenza=(quadrato-numero);
    cout<<"il numero è ";
    cout<<differenza;
    return 0;

}
