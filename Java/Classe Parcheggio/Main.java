public class Main {
    public class main {
        public static void main(String[] args) {
        Veicolo Auto = new Auto("Ferrari", 2020, 4499, 3, "Benzina");
        Veicolo Furgone = new Furgone("Mercedes", 2015, 2000, 1000);
        Veicolo Moto = new Moto("KTM",2023, 125, 2);
        
        System.out.println(Auto.getInfo());
        System.out.println(Furgone.getInfo());
        System.out.println(Moto.getInfo());
        }
    }
}