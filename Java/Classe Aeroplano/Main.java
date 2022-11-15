// Implementare la classe aeroplano con i seguenti attributi: 
// velocità massima, velocità di crociera, nome aereo,numero di motori. Implementare il metodo info
public class Main {
    public static void main(String[] args){
        Aeroplano aeroplano1 = new Aeroplano(809, 753, "Ryanair", 4);
        Aeroplano aeroplano2 = new Aeroplano(709, 690, "Easyjet", 2);
        //

        aeroplano1.info();
        System.out.println("\n");
        aeroplano2.info();
    }
}
