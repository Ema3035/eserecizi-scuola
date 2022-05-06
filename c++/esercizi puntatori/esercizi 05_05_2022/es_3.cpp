/*
    Implementare la funzione swap passandogli i valori tramite puntatori.
*/
#include <iostream>

using namespace std;

void swap(int *a, int *b){
    int tmp;
    tmp=*a;
    *a=*b; 
    *b=tmp;
}

int main()
{
    int a;
    int b;
    cout<<"inserisci due numeri che verranno scambiati: "<<endl;
    cin>>a;
    cin>>b;
    swap(a,b);
    cout<<a<<" "<<b;
    return 0;
}