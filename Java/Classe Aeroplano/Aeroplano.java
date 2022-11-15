// Implementare la classe Aeroplano con i seguenti attributi: 
// velocità massima, velocità di crociera, nome aereo,numero di motori. Implementare il metodo info

public class Aeroplano{

    private int velocitaMassima;
    private int velocitaCrociera;
    private String nomeAereo;
    private int numeroMotori;

    public Aeroplano(int velocitaMassima, int velocitaCrociera, String nomeAereo, int numeroMotori){
        this.velocitaMassima = velocitaMassima;
        this.velocitaCrociera = velocitaCrociera;
        this.nomeAereo = nomeAereo;
        this.numeroMotori = numeroMotori;
    }

    public void setVelocitaMassima(int velocitaMassima){
        this.velocitaMassima = velocitaMassima;
    }

    public void setVelocitaCrociera(int velocitaCrociera){
        this.velocitaCrociera = velocitaCrociera;
    }

    public void setNomeAereo(String nomeAereo){
        this.nomeAereo = nomeAereo;
    }

    public void setNumeroMotori(int numeroMotori){
        this.numeroMotori = numeroMotori;
    }

    public int getVelocitaMassima(){
        return velocitaMassima;
    }

    public int getVelocitaCrocera(){
        return velocitaCrociera;
    }

    public String getNomeAereo(){
        return nomeAereo;
    }

    public int getNumeroMotori(){
        return numeroMotori;
    }

    public void info(){
        System.out.println("La velocità massima dell'aereo è: " + velocitaMassima);
        System.out.println("La velocità di crociera è: " + velocitaCrociera);
        System.out.println("Il nome dell'aereo è: " + nomeAereo);
        System.out.println("Il numero dei motori dell'aereo è: " + numeroMotori);
    }
}

