#include <iostream>
using namespace std;
int main() {
	double numero,multiplo;
	cout << "Inserisci un numero\n";
	cin >> numero;
	cout << "Ora inserisci il numero di multipli che vuoi\n";
	cin >>multiplo;
	int i=1;
	while (i<multiplo) {
		double multipli=numero*i;
		cout<<multipli<<endl;
		i++;
	}
	return 0;
}