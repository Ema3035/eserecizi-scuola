#include <iostream>
using namespace std;

int main() {
	int angolo1, angolo2, angolo3, angolotot;
	cout << "Inserisci i tre angoli e capiró il tipo di triangolo" << endl;
	cin >> angolo1;
	cin >> angolo2;
	cin >> angolo3;
	angolotot= angolo1 + angolo2 + angolo3;
	if (angolo1 == 90 or angolo2 == 90 or angolo3 == 90 && angolotot == 180) {
			cout << "È un triangolo rettangolo";
		}
	else if (angolo1 < 90 && angolo2 < 90 && angolo3 < 90 ) {
			cout << "È un triangolo acuto";
		}
	else if (angolo1 > 90 or angolo2 > 90 or angolo3 > 90) {
		cout << "È un triangolo ottuso";
		}
	return 0;
}