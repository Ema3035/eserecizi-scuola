public class Palazzo{
    private int piano;
    private int nCivico;
    private int mq;
    private String via;
    private String città;

    public Palazzo(int piano, int mq, String via, int nCivico, String citta){
        setPiani(piano);
        setMq(mq);
        setVia(via);
        setNCivico(nCivico);
        setCitta(citta);
    }

    public void setPiani(int piano){
        if(piano >= 3 && piano <= 30){
            this.piano = piano;
        }else{
            System.out.print("Errore, inserisci un nuovo numero di piano.");
        }
    }
    public void setMq(int mq){
        if(mq <= 200){
            this.mq = mq;
        }else{
            System.out.print("Errore, inserisci un nuovo numero di metri quadri valido.");
        }
    }
    public void setVia(String via){
        this.via = via;
    }
    public void setNCivico(int nCivico){
        this.nCivico = nCivico;
    }
    public void setCitta(String citta){
        this.città = citta;
    }
    public float getValore(){
        return this.piano * this.mq * 150;
    }

    public void info(){
        System.out.println("La Città è: " + this.città);
        System.out.println("La via è: " + this.via);
        System.out.println("Il numero civico è: " + this.nCivico);
        System.out.println("Il numero di piani sono: " + this.piano);
        System.out.println("I metri quadri per appartamento sono: " + this.mq);
        System.out.println("Il valore del palazzo è: " + getValore());
    }
}