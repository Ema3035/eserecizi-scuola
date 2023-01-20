public class Main{
    
public static void main(String[] args) {
    // creazione dei giocatori
    Giocatore giocatore1 = new Giocatore("Giocatore 1");
    Giocatore giocatore2 = new Giocatore("Giocatore 2");
    Giocatore[] giocatori = {giocatore1, giocatore2};
    // riempimento delle cartelle dei giocatori
    for (int i = 0; i < giocatori.length; i++) {
        giocatori[i].riempiCarte();
    }
    // creazione della tombola
    Tombola tombola = new Tombola(giocatori);
    // inizio del gioco
    tombola.gioca();
}
}