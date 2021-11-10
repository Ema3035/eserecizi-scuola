#include <iostream>
using namespace std;
int main() {
	double numero;
	cout << "Inserisci il numero di numeri da sommare: ";
	int i=1;
	double n1=0;
	int quantita;
	cin>>quantita;
	cout<<"Inserisci i numeri \n";
	while (i<=quantita) {
		cin>>numero;
		n1=n1+numero;
		i++;
	}
	cout<<"La somma è "<<n1;
	return 0;
}