/*
    date due variabili con valore 2 e 4, sommarli tramite 2 puntatori 
*/
#include <iostream>

using namespace std;

int main()
{
    int a=2;
    int b=4;
    
    int *c;
    int *d;
    
    c=&a;
    d=&b;
    
    int z=*c+*d;
    cout<<z;

    return 0;
}