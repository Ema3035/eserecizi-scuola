#include <iostream>
using namespace std;

int main(){
    double angoloA,angoloB,angoloC, angolotot;
    cout<<"Inserisci tre angoli"<<endl;
    cin>>angoloA;
    cin>>angoloB;
    cin>>angoloC;
    angolotot= angoloA + angoloB + angoloC;
    if (angoloA==90 or angoloB==90 or angoloC==90 && angolotot == 180){
        cout<<"È un triangolo rettangolo";
    }
    else {
        cout<<"Non è un triangolo rettangolo";
    }
    return 0;
}