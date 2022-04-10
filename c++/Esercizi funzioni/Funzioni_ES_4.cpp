#include <iostream>

using namespace std;

int max(int ora1, int ora2){
    if (ora1>ora2) return ora1;
    else return ora2;
}

int main()
{
    int a=20;
    int b=13;
    int maggiore;
    maggiore= max(a, b);
    cout<<maggiore;
}
