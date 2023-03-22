public class Main {
    
    public static void main (String[] args) {
    Alimentari alimentari1 = new Alimentari(2, "Latte fresco", "DFSF963", 27, 1.50, 7, "30/03/2024", "Si", "No");
    Casalinghi casalinghi1 = new Casalinghi(3, "Scopa", "LMKB741", 12, 5.00, 8, "Oggetto per la pulizia");
    Abbigliamento abbigliamento1 = new Abbigliamento(4, "Maglietta", "PODC036", 67, 10.99, 12, "L", "Giallo", "Cotone");
    
    alimentari1.infoMerce();
    casalinghi1.infoMerce();
    abbigliamento1.infoMerce();
    }
}
