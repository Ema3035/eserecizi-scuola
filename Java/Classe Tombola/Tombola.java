
class Tombola {
    private Tabellone tabellone;
    private Giocatore[] giocatori;

    public Tombola(Giocatore[] giocatori) {
        this.giocatori = giocatori;
        tabellone = new Tabellone(giocatori);
    }

    public void gioca() {

        while (true) {
            int numeroEstratto = tabellone.estraiNumero();
            // controllare se un giocatore ha vinto
            for (int i = 0; i < giocatori.length; i++) {
                if (giocatori[i].haVinto()) {
                    System.out.println("Il giocatore " + giocatori[i].getNome() + " ha vinto la tombola!");
                    return;
                }
            }

            for (int i = 0; i < giocatori.length; i++) {
                int combinazione = giocatori[i].controllaCombinazione();
                if (combinazione > 0) {
                    System.out.println("Il giocatore " + giocatori[i].getNome() + " ha completato una combinazione di " + combinazione + "!");
                }
            }
        }
    }
}
