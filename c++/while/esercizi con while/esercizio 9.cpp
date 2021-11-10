#include <iostream>
using namespace std;
int main() {
	int numero;
	cout << "Inserisci la quantità dei numeri da controllare:\n";
	cin >>numero;
	int i = 1;
	int volte=numero;
	int pari=0;
	int dispari=0;
	while (i<=volte) {
		cout<<"Inserisci il numero "<<i<<endl;
		cin>>numero;
		if (numero%2==0) {
			pari++;
		}
		else {
			dispari++;
		}
		i++;
	}
	cout <<"Controllando i numeri inseririti ne hai "<< pari<<" pari e "<<dispari<<" dispari";
	return 0;
}