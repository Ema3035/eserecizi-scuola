#include <iostream>
using namespace std;
int main() {
	double numero,i;
	cout<<"Inserisci un numero"<<endl;
	cin >> numero;
	cin >> i;
	int x = 1;
	while (i*x<numero&&x>0) {
		double multiplo=i*x;
		cout<<multiplo<<endl;
		x++;
	}
	return 0;
}