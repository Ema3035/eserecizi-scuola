import java.util.Random;
class Giocatore {
    private int[][] cartelle;
    private String nome;

    public Giocatore(String nome) {
        this.nome = nome;
        // inizializzazione della matrice di numeri per le cartelle
        cartelle = new int[3][9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                cartelle[i][j] = -1;
            }
        }
    }
    
    public String getNome() {
        return nome;
    }

    // metodo per riempire le cartelle con numeri casuali
    public void riempiCarte() {
        // utilizzare una classe Random per generare numeri casuali
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                int numero = rand.nextInt(90) + 1;
                cartelle[i][j] = numero;
            }
        }
    }

    // metodo per controllare se un numero estratto è presente sulla cartella
    public boolean controllaNumero(int numero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (cartelle[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    // metodo per coprire un numero estratto sulla cartella
    public void copriNumero(int numero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (cartelle[i][j] == numero) {
                    cartelle[i][j] = -1;
                }
            }
        }
    }

    // metodo per controllare se un giocatore ha vinto
    public boolean haVinto() {
        for (int i = 0; i < 3; i++) {
            boolean rigaCompleta = true;
            for (int j = 0; j < 5; j++) {
                if (cartelle[i][j] != -1) {
                    rigaCompleta = false;
                    break;
                }
            }
            if (rigaCompleta) {
                return true;
            }
        }
        return false;
    }

    // metodo per controllare se un giocatore ha completato una combinazione intermedia
    public int controllaCombinazione() {
        for (int i = 0; i < 3; i++) {
            int numeriCoperti = 0;
            for (int j = 0; j < 5; j++) {
                if (cartelle[i][j] == -1) {
                    numeriCoperti++;
                }
            }
            if (numeriCoperti == 2) {
                return 2; // ambo
            } else if (numeriCoperti == 3) {
                return 3; // terno
            } else if (numeriCoperti == 4) {
                return 4; // quaterna
            } else if (numeriCoperti == 5) {
                return 5; // cinquina
            }
        }
        return 0; // nessuna combinazione
    }
}