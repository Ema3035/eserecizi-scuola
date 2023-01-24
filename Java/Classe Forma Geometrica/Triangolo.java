public class Triangolo extends FormaGeom {
     
    public Triangolo(String nome, int base, int altezza) {
        super(nome, base*3, (base * altezza) / 2);
    }
}