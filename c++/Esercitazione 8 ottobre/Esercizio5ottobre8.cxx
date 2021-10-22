#include <iostream>
using namespace std;

int main() {
	int numero;
	cout << "Inserendo un numero capirò se è divisore di 36" << endl;
	cin >> numero;
	if (36 % numero == 0) {
		cout << "Il numero inserito è divisore di 36";
		}
	else {
		cout << "Il numero insrito non è divisore di 36";
	}
	return 0;
}