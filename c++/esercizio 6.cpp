#include <iostream>
using namespace std;
int main()
{
	int prezzo=30,giorni,sconto,totale;
	cout << "inserire i giorni di noleggio ";
	cin >> giorni;
	if (giorni>6)
	{
		cout<<"Scontato, lo sconto è di €";
		prezzo = prezzo * giorni;
		sconto = prezzo/10;
	    cout<<sconto<<"\n";
		cout<<"In totale devi pagare €";
		cout<<prezzo-sconto;
	}
	else
	{
		cout<<"niente sconto";
	}
	return 0;
}