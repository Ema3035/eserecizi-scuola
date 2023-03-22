public class Abbigliamento extends Merce {
    private String taglia;
    private String colore;
    private String tipo;
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    public Abbigliamento(int numeroProgressivo, String descrizione, String codiceFornitore, int quantita, double prezzoUnitario, int scortaMinima, String taglia, String colore, String tipo) {
        super(numeroProgressivo, descrizione, codiceFornitore, quantita, prezzoUnitario, scortaMinima);
        this.taglia = taglia;
        this.colore = colore;
        this.tipo = tipo;
    }
    
    public String getTaglia() {
        return taglia;
    }
    
    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }
    
    public String getColore() {
        return colore;
    }
    
    public void setColore(String colore) {
        this.colore = colore;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void infoMerce() {
        
        System.out.println("--------------------");
        System.out.println(YELLOW + "ABBIGLIAMENTO" + RESET);
        System.out.println("Numero progressivo: " + getNumeroProgressivo());
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Codice fornitore: " + getCodiceFornitore());
        System.out.println("Quantità: " + getQuantita());
        System.out.println("Prezzo unitario: " + getPrezzoUnitario());
        System.out.println("Scorta minima: " + getScortaMinima());
        System.out.println("Taglia: " + getTaglia());
        System.out.println("Colore: " + getColore());
        System.out.println("Tipo: " + getTipo());
    }
}    