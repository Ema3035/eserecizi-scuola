public class Main {

	public static void main(String[] args) {
		for(int i = 1; i < 7; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("      ");
			for(int l = 7-i; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

}