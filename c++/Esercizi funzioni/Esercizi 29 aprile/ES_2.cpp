#include <iostream>
using namespace std;

int Elevamento(int numero, int esponente)
{
	int risultato=1;
	for (int i=0;i<esponente;i++)
	{
		risultato*=numero;
	}
	return risultato;
}

int main() {
	
	int numero, esponente;
	cout<<"Inserisci la base: ";
	cin>>numero;
	cout<<"Inserisci l'esponente: ";
	cin>>esponente;
	cout<<"Il risultato dell'elevamento a potenza è: " << Elevamento(numero, esponente) << endl;
	
	return 0;
}	