// Realizzare un programma per un agenzia immobiliare
// calcolare il valore dell'immobile in funzione dei:
// -mq;
// -categoria; (residenziale, pertinenza, commerciale)
// -vetustà;

// al volore dell'immobile verrà applicato un correttivo in diminuzione in funzione delle vetustà
// dell'immobile

// la classe deve contenere:
// 1.inserimento dati immobile;
// 2.calcolo valore immobile secondo le seguenti tabelle;
// 3.calcolare le tasse di registro pari al 6% sul valore;
// 4.calcolare il canone di affitto pari a 7€ al mq + uteriori 2€ in caso di locale commerciale;

public class Main{
    public static void main(String[] args) {
        Immobile immobile = new Immobile();
        immobile.init();
        System.out.println("Valore totale: " + immobile.getvTot());
        System.out.println("Tasse registro: " + immobile.getTasseRegistro());
        System.out.println("Canone affitto: " + immobile.getCanoneAffitto());
    }
}
