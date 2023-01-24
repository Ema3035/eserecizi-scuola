// Implementare l’oggetto forma geometrica con il nome della forma mettere il costruttore e il metodo stampa
// Poi due classi figlie: triangolo e quadrato e stamperanno sia l’area che il perimetro
public class FormaGeom {
    
    private String nome;
    private int perimetro;
    private int area;

    public FormaGeom(String nome, int perimetro, int area) {
        this.nome = nome;
        this.perimetro = perimetro;
        this.area = area;
    }
    
    public void stampa() {
        System.out.println("Nome: " + nome);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area + "\n");
    }
}

