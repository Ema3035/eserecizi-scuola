// Implementare la classe Numero che memorizzi un numero intero. La classe dovrà avere i seguenti metodi:
// - quadrato, che restituisca il quadrato del numero;
// - radice, che ne restituisca la radice;
// - fattoriale, che ne restituisca il fattoriale, esempio: !5 = 5*4*3*2*1
// - negazione, che inverta il segno di Numero
// - binario ed esadecimale, che restituisca rispettivamente il corrispondente in binario ed esadecimale.
// - Incrementa (di uno)
// - Decrementa (di uno)
// -  Metodo che ritorna il calcolo della seguente formula x^2 + x + 1

public class Main{

    public static void main(String[] args) {
        ClasseNumero numero = new ClasseNumero(20); //
        System.out.println("Il quadrato del numero è: " + numero.quadrato()); //
        System.out.println("La radice del numero è: " + numero.radice());
        System.out.println("Il fattoriale del numero è: " + numero.fattoriale());
        System.out.println("La negazione del numero è: " + numero.negazione());
        System.out.println("Il binario del numero è: " + numero.binario());
        System.out.println("L'incremento del numero è: " + numero.incrementa());
        System.out.println("Il decremento del numero è: " + numero.decrementa());
        System.out.println("equazione è: " + numero.equazione(3,4,5));
    }


}