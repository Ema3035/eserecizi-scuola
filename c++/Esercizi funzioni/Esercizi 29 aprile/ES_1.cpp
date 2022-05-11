#include <iostream>

using namespace std;

double a, b, c;

string Triangolo(double a, double b, double c){
    if (a==b and b==c){
        cout<<"Il triangolo è equilatero.";
    } else if ((a==b or b==c or a==c) and (a!=b or b!=c or a!=c)){
        return "Isoscele";
    } else {
        return "Scaleno";
    }
}

int main()
{
    string calcolo;
    cout<<"Inserisci il alto a: ";
    cin>>a;
    cout<<"Inserisci il alto b: ";
    cin>>b;
    cout<<"Inserisci il alto c: ";
    cin>>c;
    cout<<"Il triangolo inserito è: "<<Triangolo(a,b,c);
}
