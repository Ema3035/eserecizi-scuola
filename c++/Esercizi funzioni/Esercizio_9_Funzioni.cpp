#include <iostream>
using namespace std;

bool VerificaVocale(string lettera){
    if (lettera =="A" or lettera=="E" or lettera=="I" or lettera=="O" or lettera=="U" or lettera=="a" or lettera=="e" or lettera=="i" or lettera=="o" or lettera=="u") return true;
    else return false;
}

int main()
{
   string vocale;
   cout<<"Inserire una vocale: ";
   cin>>vocale;
   if (VerificaVocale(vocale)) {
       cout<<"E' una vocale.";
   } else {
       cout<<"Non è una vocale.";
   }
   return 0;
}