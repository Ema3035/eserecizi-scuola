/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;
int main()
{
    int prezzo,soldi;
    cout<<"inserisci prezzo ";
    cin>>prezzo;
    cout<<"inserisci soldi ";
    cin>>soldi;
    if (soldi>=prezzo)
        {
            cout<<"acquistato";
        }
    else 
        {
            cout<<"soldi non sufficienti";
        }

cout<<"il risultato e' ";
cout<<soldi<<"\n";
system ("pause");
}
