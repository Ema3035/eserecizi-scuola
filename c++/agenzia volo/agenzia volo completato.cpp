/*Un'agenzia effettua le prenotazioni per i voli della compagnia rapisardi air lines che applica 
delle tariffe standard per le seguenti destinazioni: 
1)Catania-Roma 30€
2)Catania-Praga 55€
3)Catania-New York 400€ 
Al momento della prenotazione il cliente dovrà indicare il numero di passegeri da prenotare (fatto) e l'eventuale
supplemento del bagaglio in stiva che corrisponde a 20€ per le destinazioni europee e di 50€ per i voli 
intercontinentali. (fatto)
Nel mese di novembre l'agenzia applica uno sconto del 10% se il costo della prenotazione è superiore a 500€. (fatto)
Sul posto della prenotazione bisognerà calcolare le imposte di 
imbarco del 10% per destinazione europee e 17% per voli intercontinentale (fatto)
visualizzare:
Totale lordo; (fatto)
Imposte di imbarco; (fatto)
Lo sconto; (fatto)
Il totale netto da pagare; (fatto)
Il messeggio "sconto d'autunno" se è stato applicato lo sconto. (fatto)
Il programma dovrà prevedere il controllo dell'input in maniera tale che non possano essere inseriti
codici di destinazione diversi da quelli prestabiliti.
Se il cliente ha bagagli in stiva visualizzare il messaggio "recarsi per il check-in allo sportello 8".*/
#include <iostream>
using namespace std;
int main ()
{
    int scelta,passeggeri,mese,sconto,quantita,totale,totale2,sconto10,totalefinale,finale;
    int prezzoctrm=30;
    int prezzoctprg=55;
    int prezzoctny=400;
    int pagare,imposta1,imposta2,prezzoimposta;
    int prezzobagaglio=20;
    int prezzobagaglio2=50;
    string nome,bagaglio;
    int impostaroma=3;
    double impostapraga=5.5;
    int impostany=68;
    
    cout<<"Benvenuto, a nome di chi devo fare la prenotazione?\n";
    cin>>nome;
    system ("clear");
    cout<<"Benvenuto "<<nome<<" Siamo la Rapisardi Air Lines✈️!!\n";
    cout<<"-----------------------------------------------\n";
    cout<<"Quale viaggio vuole prenotare?\n\n";
    cout<<"1) Catania-Roma (30€)\n";
    cout<<"2) Catania-Praga (55€)\n";
    cout<<"3) Catania-New York (400€)\n";
    cin>>scelta;
    while (scelta!=1 and scelta!=2 and scelta!=3)
    {
        cout<<"Hai selezionato un'opzione non valida, si prega di riprovare."<<endl;
        cout<<"-----> ";
        cin>>scelta;
    }
        if (scelta==1) {
        cout<<"Perfetto, per quanti passeggeri devo prenotare il volo?\n";
        cin>>passeggeri;
        pagare=passeggeri*prezzoctrm;
        cout<<"In totale dovrebbe pagare "<<pagare<< "€\n";
        cout<<"In che mese desidera partire?\n";
        cout<<"\n10. Gennaio\n 11. Febbraio\n 12. Marzo\n 13. Aprile\n 14. Maggio\n 15. Giugno\n 16. Luglio\n 17. Agosto\n 18. Settembre\n 19. Ottobre\n 20. Novembre\n 21. Dicembre.\n";
        cin>>mese;
        if (mese!=20){
        cout<<"In questo mese non ci sono sconti\n";
        } 
        if (mese==20){
            cout<<"Il mese prevede uno sconto che verrà applicato se la somma finale corrisponde a 500€ o più.\n";
        }
        cout<<"Avete bagagli?\n";
        cin>>bagaglio;
        }
            if (scelta==2){
            cout<<"Perfetto, per quanti passeggeri devo prenotare il volo?\n";
            cin>>passeggeri;
            pagare=passeggeri*prezzoctprg;
            cout<<"In totale dovrebbe pagare "<<pagare<< "€\n";
            cout<<"In che mese desidera partire?\n";
            cout<<"\n10. Gennaio\n 11. Febbraio\n 12. Marzo\n 13. Aprile\n 14. Maggio\n 15. Giugno\n 16. Luglio\n 17. Agosto\n 18. Settembre\n 19. Ottobre\n 20. Novembre\n 21. Dicembre.\n";
            cin>>mese;
            if (mese!=20){
            cout<<"In questo mese non ci sono sconti\n";
            } 
            if (mese==20){
            cout<<"Il mese prevede uno sconto che verrà applicato se la somma finale corrisponde a 500€ o più.\n";
            }
            cout<<"Avete bagagli?\n";
            cin>>bagaglio;
        }
                if (scelta==3){
                cout<<"Perfetto, per quanti passeggeri devo prenotare il volo?\n";
                cin>>passeggeri;
                pagare=passeggeri*prezzoctny;
                cout<<"In totale dovrebbe pagare "<<pagare<< "€\n";
                cout<<"In che mese desidera partire?\n";
                cout<<"\n10. Gennaio\n 11. Febbraio\n 12. Marzo\n 13. Aprile\n 14. Maggio\n 15. Giugno\n 16. Luglio\n 17. Agosto\n 18. Settembre\n 19. Ottobre\n 20. Novembre\n 21. Dicembre.\n";
                cin>>mese;
                if (mese!=20){
                cout<<"In questo mese non ci sono sconti\n";
                } 
                if (mese==20){
                cout<<"Il mese prevede uno sconto che verrà applicato se la somma finale corrisponde a 500€ o più.\n";
                }
                cout<<"Avete bagagli?\n";
                cin>>bagaglio;
                }
        if (bagaglio=="no" or bagaglio=="No" or bagaglio=="NO"){
        cout<<"Perfetto! Il totale da pagare è di "<<pagare<<" €"<<endl;
    }   
        if (bagaglio=="si" or bagaglio=="Si" or bagaglio=="SI") {
        cout<<"Quanti sono?\n";
        cin>>quantita;
        if (scelta==1 or scelta==2){
            totale=prezzobagaglio*quantita;
            cout<<"Avendo numero "<<quantita<< " di bagagli, dovrà pagare "<<totale<<" €\n";
            totale2=totale+pagare;
            cout<<"Il totale complessivo da pagare è di "<<totale2<<" €\n";
            cout<<"Recarsi per il check-in allo sportello 8\n";
        }
            else if (scelta==3){
                totale=prezzobagaglio2*quantita;
                cout<<"Avendo numero "<<quantita<< " di bagagli, dovrà pagare "<<totale<<" €\n";
                totale2=totale+pagare;
                cout<<"Il totale complessivo da pagare è di "<<totale2<<" €\n";
    }
}
            if (pagare>=500 and mese==20){
            cout<<"Attendere, stiamo calcolando lo sconto...\n";
            sconto10=pagare*10/100;
            cout<<"Sconto d'autunno!\n"
                  "E' di "<<sconto10<<" €\n";
            totalefinale=pagare-sconto10;
            cout<<"In agenzia pagherà "<<totalefinale<<" €";
            }   
                else if (totale2>=500 and mese==20){
                cout<<"Attendere, stiamo calcolando lo sconto...\n";
                sconto10=totale2*10/100;
                cout<<"Sconto d'autunno!\n"
                    "E' di "<<sconto10<<" €\n";
                 totalefinale=totale2-sconto10;
                cout<<"In agenzia pagherà "<<totalefinale<<" €";
            }
            if (scelta==1 or scelta==2){
                cout<<"Sta viaggiando verso uan destinazione europea, quindi si applicherà un'imposta del 10%\n";
                if (scelta==1){
                    imposta1=prezzoctrm*10/100;
                    cout<<"Partendo per Roma si applicherà una percentuale aggiuntiva di "<<imposta1<<" €."<<endl;
                    prezzoimposta=prezzoctrm+imposta1;
                    finale=prezzoimposta+pagare;
                    cout<<"Pagherà "<<prezzoimposta<<" € in più per persona."<<endl;
                    cout<<"Quindi il tutto verrà a costare "<<finale<<" €"<<endl;
                }
                if (scelta==2){
                    imposta1=prezzoctprg*10/100;
                    cout<<"Partendo per Roma si applicherà una percentuale aggiuntiva di "<<imposta1<<" €."<<endl;
                    prezzoimposta=prezzoctprg+imposta1;
                    finale=prezzoimposta+pagare;
                    cout<<"Pagherà "<<prezzoimposta<<" € in più per persona."<<endl;
                    cout<<"Quindi il tutto verrà a costare "<<finale<<" €"<<endl;
                
            }}
                    if (scelta==3){
                    cout<<"Sta viaggiando verso uan destinazione europea, quindi si applicherà un'imposta del 10%\n";
                        if (scelta==3){
                        imposta1=prezzoctny*17/100;
                        cout<<"Partendo per New York si applicherà una percentuale aggiuntiva di "<<imposta1<<" €."<<endl;
                        prezzoimposta=prezzoctny+imposta1;
                        finale=prezzoimposta+pagare;
                        cout<<"Pagherà "<<prezzoimposta<<" € in più per persona."<<endl;
                        cout<<"Quindi il tutto verrà a costare "<<finale<<" €"<<endl;
                    }}
}