import java.util.Scanner;

public class Es1 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Quanti elementi vuoi avere?");
        int n = 0;
        n = input.nextInt();
        int[] elementi= new int[n];
        for (int i = 0; i<n; i++){
            elementi[i]= input.nextInt();
        }
    }
}