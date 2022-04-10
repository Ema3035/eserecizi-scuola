#include <iostream>
using namespace std;

bool verificaLettera(char lettera){
    if (lettera>='A' and lettera<='Z') return true;
    else return false;
}

int main()
{
   char carattere;
   cout<<"Inserire uan lettera: ";
   cin>>carattere;
   if (verificaLettera(carattere)) {
       cout<<"Lettera maiuscola.";
   } else {
       cout<<"Lettera minuscola.";
   }
   return 0;
}