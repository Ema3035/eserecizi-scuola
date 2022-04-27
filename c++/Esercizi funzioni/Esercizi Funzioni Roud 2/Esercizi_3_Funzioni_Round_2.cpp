#include <iostream>

using namespace std;

int alunni,voto;
double media;

double calcolo_media(int voto){
    for (int i=0; i< alunni; i++){
        cout<<"Inserisci voto: ";
        cin>>voto;
        media += voto;
        }
        media /= alunni;
        cout<<"La media della classe è di: "<<media;
        
        return media;
    }
    
int main()
{
    cout<<"Inserisci il numero degli alunni: ";
    cin>>alunni;
    calcolo_media(voto);
    
}
