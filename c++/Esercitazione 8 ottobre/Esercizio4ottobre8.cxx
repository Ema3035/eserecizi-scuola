#include <iostream>
using namespace std;

int main(){
    double lato, raggio, quadratoarea, quadratoperimetro, cerchioarea, cerchioperimetro;
    cout<<"Inserisci il lato del quadrato e il raggio della circonferenza"<<endl;
    cin>>lato;
    cin>>raggio;
    quadratoperimetro= lato * 4;
    cerchioperimetro= raggio * 2 * 3.14;
    if (quadratoperimetro > cerchioperimetro){
        cout<<"Il quadrato ha un perimetro piú grande"<<endl;
    }
    else {
        cout<<"Il cerchio ha un perimetro più grande"<<endl;
    }
    quadratoarea = lato * lato;
    cerchioarea = raggio * raggio * 3.14;
        if (quadratoarea > cerchioarea){
        cout<<"Il quadrato ha un area maggiore"<<endl;
    }
    else {
        cout<<"Il cerchio ha un area maggiore"<<endl;
    }
    return 0;
}