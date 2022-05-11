#include <iostream>
using namespace std;

int somma(unsigned int n) {
	if (n==0) {
		return n;
	}
	return n+somma(n-1);
}

int main() {
	int numero;
	cout<<"Inserisci un numero: ";
	cin>>numero;
	int sommaTot = somma(numero);
	cout << sommaTot;

	return 0;
}