#include <iostream>

using namespace std;

string SegnoZodiacale(int giorno, int mese) {
   
    string mesi[] = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
    string segno;

    int mesiLun=12;

    for(int i=0; i <= mesiLun; i++) {
        if (mese == i) {
            if (giorno <= 31 and giorno > 0) {
                cout<<"Giorno: "<<giorno<<endl;
                cout<<"Mese: "<<mesi[i-1]<<endl<<endl;
                
                switch (mese) {
                    case 1: 
                        if(giorno <= 21) {
                            segno = "CAPRICORNO";
                        } else {
                            segno = "ACQUARIO";
                        }
                        break;
                        
                    case 2: 
                        if (giorno <= 19) {
                            segno = "ACQUARIO"; 
                        } else {
                            segno = "PESCI";
                        }
                        break;
                        
                    case 3:
                        if (giorno <= 20) {
                            segno = "PESCI"; 
                        } else {
                            segno = "ARIETE"; 
                        }
                        break;
                        
                    case 4:  
                        if (giorno <= 20) {
                            segno = "ARIETE"; 
                        } else {
                            segno = "TORO"; 
                        }
                        break;
                        
                    case 5: 
                        if (giorno <= 21) {
                            segno = "TORO"; 
                        } else {
                            segno = "GEMELLI"; 
                        }
                        break;
                        
                    case 6:
                        if (giorno <= 21) {
                            segno = "GEMELLI"; 
                        } else {
                            segno = "CANCRO"; 
                        }
                        break;
                        
                    case 7:  
                        if (giorno <= 22) {
                            segno = "CANCRO"; 
                        } else {
                            segno = "LEONE"; 
                        }
                        break;
                        
                    case 8: 
                        if (giorno <= 22) {
                            segno = "LEONE";
                        } else {
                            segno = "VERGINE";
                        }
                        break;
                        
                    case 9:  
                        if (giorno <= 22) {
                            segno = "VERGINE"; 
                        } else {
                            segno = "BILANCIA"; 
                        }
                        break;
                        
                    case 10:  
                        if (giorno <= 22) {
                            segno = "BILANCIA";
                        } else {
                            segno = "SCORPIONE"; 
                        }
                        break;
                        
                    case 11:  
                        if (giorno <= 21) {
                            segno = "SCORPIONE"; 
                        } else {
                            segno = "SAGITTARIO";
                        }
                        break;
                        
                    case 12:  
                        if (giorno <= 21) {
                            segno = "SAGITTARIO"; 
                        } else {
                            segno = "CAPRICORNO"; 
                        }
                        break;
                }
            }
        }
    }

    return segno;
}

int main()
{
    
    int giorno, mese;

    cout<<"Inserisci il giorno in cui sei nato: ";
    cin>>giorno;
    
    cout<<"Inserisci il mese in cui sei nato: ";
    cin>>mese;
    
    cout<<SegnoZodiacale(giorno, mese);

    return 0;
}