public class Main {

        public static void main(String[] args) {
            AgenziaFinanziaria investimento = new AgenziaFinanziaria(0, 0, 0, 0, 0, 0, 0, 0);
            investimento.distribuisciImporto(10000);
            investimento.calcolaRendimentoAnnuoMaturato(10000);
            investimento.calcolaSommaTreRendimenti(10000);
            investimento.calcolaIndiceDiRischio(10000);
            investimento.calcolaSommaIndiciDiRischio(10000);
        }
    }
