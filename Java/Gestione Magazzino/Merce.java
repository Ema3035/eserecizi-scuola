public class Merce {
    private int numeroProgressivo;
    private String descrizione;
    private String codiceFornitore;
    private int quantita;
    private double prezzoUnitario;
    private int scortaMinima;

    public Merce(int numeroProgressivo, String descrizione, String codiceFornitore, int quantita, double prezzoUnitario, int scortaMinima) {
        this.numeroProgressivo = numeroProgressivo;
        this.descrizione = descrizione;
        this.codiceFornitore = codiceFornitore;
        this.quantita = quantita;
        this.prezzoUnitario = prezzoUnitario;
        this.scortaMinima = scortaMinima;
    }

    public int getNumeroProgressivo() {
        return numeroProgressivo;
    }

    public void setNumeroProgressivo(int numeroProgressivo) {
        this.numeroProgressivo = numeroProgressivo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getCodiceFornitore() {
        return codiceFornitore;
    }

    public void setCodiceFornitore(String codiceFornitore) {
        this.codiceFornitore = codiceFornitore;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public int getScortaMinima() {
        return scortaMinima;
    }

    public void setScortaMinima(int scortaMinima) {
        this.scortaMinima = scortaMinima;
    }
}


