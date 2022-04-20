#include <iostream>
#include <cmath>

using namespace std;

void calcoloEquazione(double a, double b, double c){
    double delta = (b*b)-(4*a*c);
    if(delta < 0) cout<<"Non esistono soluzioni.";
    else{
        double primaRisposta = (-b + sqrt(delta))/(2*a);
        double secondaRisposta = (-b - sqrt(delta))/(2*a);
        cout<<"La prima soluzione equivale a "<<primaRisposta<<", mentre la seconda a "<<secondaRisposta;
    }
}

int main()
{
    double a,b,c;
    cout<<"Inserisci a: ";
    cin>>a;
    cout<<"Inserisci b (0 se è pura): ";
    cin>>b;
    cout<<"Inserisci c (0 se è spuria): ";
    cin>>c;
    calcoloEquazione(a,b,c);
}