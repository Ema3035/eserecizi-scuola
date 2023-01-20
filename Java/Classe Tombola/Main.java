public class Main{
    
public static void main(String[] args) {

    Giocatore giocatore1 = new Giocatore("Emanuele");
    Giocatore giocatore2 = new Giocatore("Marco");
    Giocatore[] giocatori = {giocatore1, giocatore2};

    for (int i = 0; i < giocatori.length; i++) {
        giocatori[i].riempiCarte();
    }

    Tombola tombola = new Tombola(giocatori);

    tombola.gioca();
}
}
