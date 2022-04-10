#include <iostream>
using namespace std;

int differenzaDueNumeri(int numero1, int numero2, int numero3){
    
    int grande, piccolo, differenza;
    
    if (numero1>numero2){
        if (numero1>numero3){
            grande=numero1;
            piccolo=numero2;
        }
        else{
            grande=numero3;
            piccolo=numero2;
        }
    } else {
        if (numero2>numero3){
            grande=numero2;
            piccolo=numero1;
        }
        else{
            grande=numero3;
            piccolo=numero1;
        }
    }
    differenza=grande-piccolo;
    return differenza;
}

int main()
{
    int primoNumero, secondoNumero, terzoNumero;
    cout<<"Inserisci tre nuemri:"<<endl;
    cin>>primoNumero;
    cin>>secondoNumero;
    cin>>terzoNumero;
    cout<<"La differenza tra il più grande è il più piccolo è: "<<differenzaDueNumeri(primoNumero, secondoNumero, terzoNumero);

    return 0;
}