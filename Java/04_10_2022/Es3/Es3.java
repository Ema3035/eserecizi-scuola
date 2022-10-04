
import java.util.Scanner;

public class Es3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = 15;
        int[] vettore = new int[n];

        System.out.println("Inserire dei valori da sommare fra di loro: ");
        for (int i = 0; i < n; i++){
            System.out.print(i+1 + ": ");
            vettore[i] = input.nextInt();
        }
        int somma = 0;
        for(int i = 0; i < n; i++){
            somma += vettore[i];
        }
        System.out.println("La somma è: "+somma);
    }
    
}