// Implementare la classe Numero che memorizzi un numero intero. La classe dovrà avere i seguenti metodi:
// - quadrato, che restituisca il quadrato del numero;
// - radice, che ne restituisca la radice;
// - fattoriale, che ne restituisca il fattoriale, esempio: !5 = 5*4*3*2*1
// - negazione, che inverta il segno di Numero
// - binario ed esadecimale, che restituisca rispettivamente il corrispondente in binario ed esadecimale.
// - Incrementa (di uno)
// - Decrementa (di uno)
// -  Metodo che ritorna il calcolo della seguente formula x^2 + x + 1
import java.lang.Math;

public class ClasseNumero{
    private int numero; //
    
    public ClasseNumero(int n){ //
        this.numero = n; //
    }

    public double quadrato(){
        return numero*numero;
    }

    public double radice(){
        return Math.sqrt(numero);
    }

    public double fattoriale(){
        int fatt = 1;
        for(int i = 1; i <= numero; i++) {
            fatt*=i;
        }
        return fatt;
    }

    public int negazione() {
        return numero*-1;
    }

    public String binario() {
        return Integer.toBinaryString(numero);
    }

    public String esadecimale() {
        return Integer.toHexString(numero);
    }
    
    public int incrementa(){
        return numero+1;
    }

    public int decrementa(){
        return numero-1;
    }

    public String equazione(double a, double b, double c) {
        double delta;
        double soluzione1, soluzione2;

        delta=b*b-4*a*c;

        if( delta==0 ) {
            soluzione1=(-b - Math.sqrt( b*b -4*a*c ))/(2*a);
            soluzione2=soluzione1;
            return "Soluzione: " + soluzione1;
        }

        if( delta>0 ) {
            soluzione1=(-b - Math.sqrt( b*b -4*a*c ))/(2*a);
            soluzione2=(-b + Math.sqrt( b*b -4*a*c ))/(2*a);
            return "Soluzione: " + soluzione1 + " " + soluzione2;
        }

        if( delta<0 ) {
            return "Delta negativo";
        }
        return "Errore";
    }
}