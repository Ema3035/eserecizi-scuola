class Tabellone {
    private int[][] numeri;
    private Giocatore[] giocatori;
    private Sacchetto sacchetto;

    public Tabellone(Giocatore[] giocatori) {
        this.giocatori = giocatori;
        // inizializzazione della matrice di numeri per il tabellone
        numeri = new int[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                numeri[i][j] = -1;
            }
        }
        // inizializzazione del sacchetto
        sacchetto = new Sacchetto();
    }

    // metodo per estrarre un numero dal sacchetto e annunciarlo ai giocatori
    public int estraiNumero() {
        int numero = sacchetto.estraiNumero();
        System.out.println("Estratto il numero: " + numero);
        for (int i = 0; i < giocatori.length; i++) {
            if (giocatori[i].controllaNumero(numero)) {
                giocatori[i].copriNumero(numero);
                System.out.println(giocatori[i].getNome() + " ha coperto il numero " + numero + " sulla sua cartella!");
            }
        }
        // inserire il numero estratto nel tabellone
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (numeri[i][j] == -1) {
                    numeri[i][j] = numero;
                    return numero;
                }
            }
        }
        return -1;
    }
}