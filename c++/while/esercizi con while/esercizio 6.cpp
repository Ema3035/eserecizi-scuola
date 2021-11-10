#include <iostream>
using namespace std;
int main() {
	double numero;
	cout<<"Inserisci un numero\n";
	cin>>numero;
	int i=1;
	while (i<11) {
		double multipli=numero*i;
		cout<<multipli<<endl;
		i++;
	}
	return 0;
}