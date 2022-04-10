#include <iostream>

using namespace std;

int cubo (int numero){
    int cubo1;
    cubo1= numero * numero * numero;
    return cubo1;
}
 
int main(){
    int risultato;
    int valore=10;
    risultato = cubo(valore);
    cout<<risultato;
}