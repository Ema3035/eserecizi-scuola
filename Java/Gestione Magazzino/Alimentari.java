public class Alimentari extends Merce {
    private String dataScadenza;
    private String lattosio;
    private String glutine;
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    public Alimentari(int numeroProgressivo, String descrizione, String codiceFornitore, int quantita, double prezzoUnitario, int scortaMinima, String dataScadenza, String lattosio, String glutine) {
        super(numeroProgressivo, descrizione, codiceFornitore, quantita, prezzoUnitario, scortaMinima);
        this.dataScadenza = dataScadenza;
        this.lattosio = lattosio;
        this.glutine = glutine;
    }

    public String getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public void setLattosio(String lattosio) {
        this.lattosio = lattosio;
    }

    public String getLattosio() {
        return lattosio;
    }
    
    public String getGlutine() {
        return glutine;
    }
    
    public void setGlutine(String glutine) {
        this.glutine = glutine;
    }

    public void infoMerce() {
        
        System.out.println("--------------------");
        System.out.println(YELLOW + "ALIMENTARI" + RESET);
        System.out.println("Numero progressivo: " + getNumeroProgressivo());
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Codice fornitore: " + getCodiceFornitore());
        System.out.println("Quantità: " + getQuantita());
        System.out.println("Prezzo unitario: " + getPrezzoUnitario());
        System.out.println("Scorta minima: " + getScortaMinima());
        System.out.println("Data scadenza: " + getDataScadenza());
        System.out.println("Lattosio: " + getLattosio());
        System.out.println("Glutine: " + getGlutine());
    }
}