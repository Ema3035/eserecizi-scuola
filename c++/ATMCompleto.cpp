//disponibilità di 6000€, prelievi che versamenti, limite di prelievo giornaliero 250€, 
//inserire pin per qualsiasi transazione
#include <iostream>
using namespace std;
int main()
{
    int atmsoldi=6000; 
    int limitegiorn=250;
    int scelta;
    int prelievo;
    int deposito;
    int soldi;
    int depositati;
    const string pin="3032005e";
    cout<<"Salve""\n\n";
    cout<<"1.Depositare.\n";
    cout<<"2.Prelevare.\n\n";
    cout<<"Cosa desidera fare? ";
    cin>>scelta;
    if (scelta==1) 
    {
        cout<<"Inserire pin: ";
        string pininser;
        cin>>pininser;
        if (pininser==pin){
            cout<<"Quanto desidera depositare?\n";
            cin>>deposito;
                depositati=atmsoldi+deposito;
                cout<<"Soldi depositati con successo. In totale ha "<<depositati;
                cout<<"€";
            }
    }
    else if (scelta==2) {
        cout<<"Inserire pin: ";
        string pininser;
        cin>>pininser;
        if (pininser==pin){
            cout<<"Quanto desidera prelevare?\n";
            cin>>prelievo;
             if (prelievo>limitegiorn){
                cout<<"Impossibile prelevare, ha superato il limite giornaliero. ";
            } 
            else 
            {
                soldi=atmsoldi-prelievo;
                cout<<"Transazione eseguita, le rimangono "<<soldi;
                cout<<"€";
            }
        } else {
            cout<<"Pin errato.";
        }
    }
    else {
        cout<<"Selezione sbagliata, riprovi.";
    }
}