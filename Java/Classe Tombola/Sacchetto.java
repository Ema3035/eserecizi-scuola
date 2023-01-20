import java.util.Random;

class Sacchetto {
    private int[] numeri;
    private int indice;

    public Sacchetto() {
        // inizializzazione dell'array di numeri
        numeri = new int[90];
        for (int i = 0; i < 90; i++) {
            numeri[i] = i + 1;
        }
        indice = numeri.length - 1;
    }

    // metodo per estrarre un numero casuale dal sacchetto
    public int estraiNumero() {
        if (indice < 0) {
            return -1;
        }
        // utilizzare una classe Random per generare un indice casuale
        Random rand = new Random();
        int randomIndex = rand.nextInt(indice + 1);

        // scambiare il numero estratto con l'ultimo numero nel sacchetto
        int estratto = numeri[randomIndex];
        numeri[randomIndex] = numeri[indice];
        numeri[indice] = estratto;
        indice--;
        
        return estratto;
    }
}