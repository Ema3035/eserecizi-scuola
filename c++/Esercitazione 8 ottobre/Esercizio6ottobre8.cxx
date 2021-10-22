#include <iostream>
using namespace std;

int main() {
	int a, b, c;
	cout << "Inserisci due numeri diversi" << endl;
	cin >> a;
	cin >> b;
	if (a > b) 
	{
		c = b + (a + b);
		cout << c;
		}
	else if (a < b) 
	{
		c = a + (a + b);
		cout << c;
		}
	else if (a == b) 
	{
		cout << "Sono stati inseriti due numeri uguali";
	}	
	return 0;
	}