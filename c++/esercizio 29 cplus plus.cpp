#include <iostream>
using namespace std;
int main()
{
    double lordo,sconto,percentuale;
    cout<<"Importo lordo "<<"\n";
    cin>>lordo;
    cout<<"Importo scontato "<<"\n";
    cin>>sconto;
    if (lordo>sconto) {
        percentuale=(sconto/lordo*100);
        cout<<"Il tuo sconto è di ";
        cout<<percentuale;
        cout<<"%";
    }

}
