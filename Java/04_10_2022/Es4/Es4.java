
public class Es4 {
        public static void main(String[] args){
            int vettore[] = {9,34,4,3,43,2,52,69};
            for (int i = 0; i<8; i++){
                if (vettore[i]%2==0){
                    System.out.println("I numeri pari sono: " + vettore[i] );
                }
                else {
                    System.out.println("I numeri dispari sono: " + vettore[i] );
                }
            }
        }
}