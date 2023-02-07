
public class AgenziaFinanziaria {
    // Realizzare un algoritmo che permetta di:
    // Dare in input la somma da investire;
    // Distribuisca in maniera Random l’importo dato input nei tre tipi di finanziamento con un minimo di 2000€ per ogni investimento;
    // Calcoli il rendimento annuo maturato per ogni prodotto di investimento;
    // Calcoli la somma dei tre rendimenti;
    // Calcoli l’indice del rischio per ogni prodotto finanziario così calcolato:
    // Rendimento*Rate Risk/%Rendimento annuo;
    // Sommi il totale degli indici di rischio
    // Confronti che il totale degli indici di rischio rientri nel Range 200<>600;
    // Il ciclo si conclude dopo che verranno visualizzate 3 ipotesi valide.

    private double sommaDaInvestire;
    private int indiceDiRischio;
    private double rendimentoAnnuoMaturato;
    private double sommaTreRendimenti;
    private double indiceDiRischioTotale;
    private double indiceDiRischio1;
    private double indiceDiRischio2;
    private double indiceDiRischio3;


    public AgenziaFinanziaria(double sommaDaInvestire, int indiceDiRischio, double rendimentoAnnuoMaturato, double sommaTreRendimenti, double indiceDiRischioTotale, double indiceDiRischio1, double indiceDiRischio2, double indiceDiRischio3) {
        this.sommaDaInvestire = sommaDaInvestire;
        this.indiceDiRischio = indiceDiRischio;
        this.rendimentoAnnuoMaturato = rendimentoAnnuoMaturato;
        this.sommaTreRendimenti = sommaTreRendimenti;
        this.indiceDiRischioTotale = indiceDiRischioTotale;
        this.indiceDiRischio1 = indiceDiRischio1;
        this.indiceDiRischio2 = indiceDiRischio2;
        this.indiceDiRischio3 = indiceDiRischio3;
    }

    public double getSommaDaInvestire() {
        return sommaDaInvestire;
    }

    public void setSommaDaInvestire(double sommaDaInvestire) {
        this.sommaDaInvestire = sommaDaInvestire;
    }

    public double getRendimentoAnnuoMaturato() {
        return rendimentoAnnuoMaturato;
    }

    public void setRendimentoAnnuoMaturato(double rendimentoAnnuoMaturato) {
        this.rendimentoAnnuoMaturato = rendimentoAnnuoMaturato;
    }

    public double getSommaTreRendimenti() {
        return sommaTreRendimenti;
    }

    public void setSommaTreRendimenti(double sommaTreRendimenti) {
        this.sommaTreRendimenti = sommaTreRendimenti;
    }

    public double getIndiceDiRischioTotale() {
        return indiceDiRischioTotale;
    }

    public void setIndiceDiRischioTotale(double indiceDiRischioTotale) {
        this.indiceDiRischioTotale = indiceDiRischioTotale;
    }

    public double getIndiceDiRischio1() {
        return indiceDiRischio1;
    }

    public void setIndiceDiRischio1(double indiceDiRischio1) {
        this.indiceDiRischio1 = indiceDiRischio1;
    }

    public double getIndiceDiRischio2() {
        return indiceDiRischio2;
    }

    public void setIndiceDiRischio2(double indiceDiRischio2) {
        this.indiceDiRischio2 = indiceDiRischio2;
    }

    public double getIndiceDiRischio3() {
        return indiceDiRischio3;
    }

    public void setIndiceDiRischio3(double indiceDiRischio3) {
        this.indiceDiRischio3 = indiceDiRischio3;
    }

    public int getIndiceDiRischio() {
        return indiceDiRischio;
    }

    public void setIndiceDiRischio(int indiceDiRischio) {
        this.indiceDiRischio = indiceDiRischio;
    }

    public void distribuisciImporto(double sommaDaInvestire) {
        double somma = sommaDaInvestire;
        double minimo = 2000;
        double massimo = sommaDaInvestire - 6000;
        double random = Math.random() * (massimo - minimo) + minimo;
        double random2 = Math.random() * (massimo - minimo) + minimo;
        double random3 = Math.random() * (massimo - minimo) + minimo;
        System.out.println("Somma da investire: " + sommaDaInvestire);
        System.out.println("Investimento 1: " + random);
        System.out.println("Investimento 2: " + random2);
        System.out.println("Investimento 3: " + random3);
    }

    public void calcolaRendimentoAnnuoMaturato(double sommaDaInvestire) {
        double somma = sommaDaInvestire;
        double minimo = 2000;
        double massimo = sommaDaInvestire - 6000;
        double random = Math.random() * (massimo - minimo) + minimo;
        double random2 = Math.random() * (massimo - minimo) + minimo;
        double random3 = Math.random() * (massimo - minimo) + minimo;
        double rendimentoAnnuoMaturato = (random * 0.05) + (random2 * 0.07) + (random3 * 0.09);
        System.out.println("Rendimento annuo maturato: " + rendimentoAnnuoMaturato);
    }

    public void calcolaSommaTreRendimenti(double sommaDaInvestire) {
        double somma = sommaDaInvestire;
        double minimo = 2000;
        double massimo = sommaDaInvestire - 6000;
        double random = Math.random() * (massimo - minimo) + minimo;
        double random2 = Math.random() * (massimo - minimo) + minimo;
        double random3 = Math.random() * (massimo - minimo) + minimo;
        double rendimentoAnnuoMaturato = (random * 0.05) + (random2 * 0.07) + (random3 * 0.09);
        double sommaTreRendimenti = rendimentoAnnuoMaturato + (rendimentoAnnuoMaturato * 0.05) + (rendimentoAnnuoMaturato * 0.07) + (rendimentoAnnuoMaturato * 0.09);
        System.out.println("Somma dei tre rendimenti: " + sommaTreRendimenti);
    }

    public void calcolaIndiceDiRischio(double sommaDaInvestire) {
        double somma = sommaDaInvestire;
        double minimo = 2000;
        double massimo = sommaDaInvestire - 6000;
        double random = Math.random() * (massimo - minimo) + minimo;
        double random2 = Math.random() * (massimo - minimo) + minimo;
        double random3 = Math.random() * (massimo - minimo) + minimo;
        double rendimentoAnnuoMaturato = (random * 0.05) + (random2 * 0.07) + (random3 * 0.09);
        double sommaTreRendimenti = rendimentoAnnuoMaturato + (rendimentoAnnuoMaturato * 0.05) + (rendimentoAnnuoMaturato * 0.07) + (rendimentoAnnuoMaturato * 0.09);
        double indiceDiRischio = (rendimentoAnnuoMaturato * 0.05) + (rendimentoAnnuoMaturato * 0.07) + (rendimentoAnnuoMaturato * 0.09);
        System.out.println("Indice di rischio: " + indiceDiRischio);
    }

    public void calcolaSommaIndiciDiRischio(double sommaDaInvestire) {
        double somma = sommaDaInvestire;
        double minimo = 2000;
        double massimo = sommaDaInvestire - 6000;
        double random = Math.random() * (massimo - minimo) + minimo;
        double random2 = Math.random() * (massimo - minimo) + minimo;
        double random3 = Math.random() * (massimo - minimo) + minimo;
        double rendimentoAnnuoMaturato = (random * 0.05) + (random2 * 0.07) + (random3 * 0.09);
        double sommaTreRendimenti = rendimentoAnnuoMaturato + (rendimentoAnnuoMaturato * 0.05) + (rendimentoAnnuoMaturato * 0.07) + (rendimentoAnnuoMaturato * 0.09);
        double indiceDiRischio = (rendimentoAnnuoMaturato * 0.05) + (rendimentoAnnuoMaturato * 0.07) + (rendimentoAnnuoMaturato * 0.09);
        double sommaIndiciDiRischio = indiceDiRischio + indiceDiRischio + indiceDiRischio;
        System.out.println("Somma degli indici di rischio: " + sommaIndiciDiRischio);
        System.out.println("---------------------------------");
    }
}