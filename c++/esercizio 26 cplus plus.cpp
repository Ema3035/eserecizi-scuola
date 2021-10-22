#include <iostream>
using namespace std;
int main()
{
    double stipendio,extra,enciclopedie,stipendioextra,trattenuti,stipendiofinale;
    stipendio=(1000);
    extra=(100);
    cout<<"Quante enciclopedie sono state vendute?"<<"\n";
    cin>>enciclopedie;
    stipendioextra=(extra*enciclopedie+stipendio);
    trattenuti=(18*stipendioextra/100);
    stipendiofinale=(stipendioextra-trattenuti);
    cout<<"Il tuo stipendio mensile è di ";
    cout<<stipendiofinale;
    return 0;
}
