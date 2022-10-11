package esercizio_20_settembre;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int moltiplicazione;
		for(int i=1;i<11;i++) {
			moltiplicazione=n*i;
			System.out.println(moltiplicazione);
		}
		
	}

}
