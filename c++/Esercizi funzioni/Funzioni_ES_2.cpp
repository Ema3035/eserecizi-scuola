#include <iostream>
using namespace std;

void valoreassoluto(int i){
    if (i<0){
        i = i*-1;
    }
}

int main()
{
    int numero;
    cout << "Inserisci un numero: ";
    cin >> numero;
    valoreassoluto(numero);
    cout <<"Il valore assoluto è: "<<numero;
    return 0;
}