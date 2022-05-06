/*
    Trovare il massimo tra due numeri tramite puntatori
*/
#include <iostream>

using namespace std;

int main()
{
    int a, b;
    
    cout<<"Inserisci due numeri: "<<endl;
    ci>>a>>b;
    int *d=&a; 
    int *c=&b;
    if (*d>*c){
        cout<<"Il più grande è " <<*d;
    } else {
        cout<<"Il più grande è " <<*c;
    } 

    return 0;
}