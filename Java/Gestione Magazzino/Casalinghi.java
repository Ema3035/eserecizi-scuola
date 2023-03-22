public class Casalinghi extends Merce {
    private String tipo;
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    
    public Casalinghi(int numeroProgressivo, String descrizione, String codiceFornitore, int quantita, double prezzoUnitario, int scortaMinima, String tipo) {
        super(numeroProgressivo, descrizione, codiceFornitore, quantita, prezzoUnitario, scortaMinima);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void infoMerce() {
        
        System.out.println("--------------------");
        System.out.println(YELLOW + "CASALINGHI" + RESET);
        System.out.println("Numero progressivo: " + getNumeroProgressivo());
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Codice fornitore: " + getCodiceFornitore());
        System.out.println("Quantità: " + getQuantita());
        System.out.println("Prezzo unitario: " + getPrezzoUnitario());
        System.out.println("Scorta minima: " + getScortaMinima());
        System.out.println("Tipo: " + getTipo());
    }
}