#include <iostream>
using namespace std;

void numeroReale(int numero){
    if (numero>=0){
        cout<<"E' un numero reale.";
    }
    else {
        cout<<"Non è un numero reale.";
    }
}

int main()
{
    int cifra;
    cout<<"Inserisci un numero: ";
    cin>>cifra;
    numeroReale(cifra);
    return 0;
}