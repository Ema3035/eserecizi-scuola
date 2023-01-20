import java.util.Random;

class Sacchetto {
    private int[] numeri;
    private int indice;

    public Sacchetto() {

        numeri = new int[90];
        for (int i = 0; i < 90; i++) {
            numeri[i] = i + 1;
        }
        indice = numeri.length - 1;
    }


    public int estraiNumero() {
        if (indice < 0) {
            return -1;
        }

        Random rand = new Random();
        int randomIndex = rand.nextInt(indice + 1);


        int estratto = numeri[randomIndex];
        numeri[randomIndex] = numeri[indice];
        numeri[indice] = estratto;
        indice--;
        
        return estratto;
    }
}
