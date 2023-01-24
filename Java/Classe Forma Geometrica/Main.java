// Implementare l’oggetto forma geometrica con il nome della forma mettere il costruttore e il metodo stampa
// Poi due classi figlie: triangolo e quadrato e stamperanno sia l’area che il perimetro
public class Main {
    public static void main(String[] args) {
        Triangolo triangolo1 = new Triangolo("Triangolo", 15, 2);
        Quadrato quadrato1 = new Quadrato("Quadrato", 18);
        
        triangolo1.stampa();
        quadrato1.stampa();
    }
}
