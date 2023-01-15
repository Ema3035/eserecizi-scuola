public class Main {
    public static void main(String[] args){
        Palazzo palazzo1 = new Palazzo(4, 100, "Via Roma", 2, "Caltanissetta");
        Palazzo palazzo2 = new Palazzo(8, 150, "Via Rossi", 3, "Genova");
        Palazzo palazzo3 = new Palazzo(9, 20, "Via Cataldo", 4, "San Cataldo");
        palazzo1.info();
        System.out.println("-----------------------------------------");
        palazzo2.info();
        System.out.println("-----------------------------------------");
        palazzo3.info();
    }
}
