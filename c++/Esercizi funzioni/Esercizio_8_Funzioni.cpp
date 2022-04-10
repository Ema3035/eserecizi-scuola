#include <iostream>
using namespace std;

bool Divisori(int x){
    int numeroDivisori=0;
    for(int i=2; i<x; i++){
        if (x%i==0){
            numeroDivisori++;
        }
    }
    return (numeroDivisori>=3) ? true : false;
}

int main()
{
    int numero;
    cout<<"inserisci un numero e ti dirò se ha 3 divisori: ";
    cin>>numero;
    if (Divisori(numero)){
        cout<<"Il tuo numero ha 3 divisori.";
    } else {
        cout<<"Il tuo numero non ha 3 divisori.";
    }
    return 0;
}