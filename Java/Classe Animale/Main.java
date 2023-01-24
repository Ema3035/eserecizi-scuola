public class Main{
    public static void main(String[] args) {
        Cane cane = new Cane("Cataldo", 4);
        cane.stampa();
        cane.abbaia();
        Gatto gatto = new Gatto("Milù", 4);
        gatto.stampa();
        gatto.miagola();
        Uccello uccello = new Uccello("Antonio", 2);
        uccello.stampa();
        uccello.cinguetta();
    }
}