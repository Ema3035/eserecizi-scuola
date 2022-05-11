#include <iostream>
#include <string>
using namespace std;

char *inverti(char *s){
	int i=0, j=strlen(s)-1;
	char temp;
	while(i<j){
		temp=s[i];
		s[i]=s[j];
		s[j]=temp;
		i++;
		j--;
	}
	return s;
}

int main() {
	char s[]="Mi chiamo Emanuele";
	cout << inverti(s) << endl;
	return 0;
}