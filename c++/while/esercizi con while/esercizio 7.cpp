#include <iostream>
using namespace std;
int main() {
	int numero;
	cout<<"Inserisci un numero\n";
	cin>>numero;
	int i=1;
	while (i<11) {
		int somma=numero+i;
		cout<<somma<<endl;
		i++;
	}
	return 0;
}