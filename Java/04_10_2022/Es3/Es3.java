
public class Es3 {
    
    public static void main(String[] args){
        int n = 10;
        int[] vettore= new int[n];
        for (int i = 0; i<n; i++){
            vettore[i]= i;
        }
        for (int j=0; j<i; j++){
            int somma = vettore[i] + vettore[i++];
            System.out.println(vettore[i]);
        }
    }
}