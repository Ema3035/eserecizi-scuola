/*
    date due variabili con valore 2 e 4, sottrarli tramite 2 puntatori 
*/
#include <iostream>

using namespace std;

int main()
{
    int a;
    int b;
    
    cout<<"inserisci due numeri: "<<endl;
    cin>>a;
    cin>>b;
    
    int *c;
    int *d;
    
    c=&a;
    d=&b;
    
    int z=*c-*d;
    cout<<z;

    return 0;
}