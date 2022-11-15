// Realizzare un programma per un agenzia immobiliare

// Calcolare il valore dell'immobile in funzione dei:
// -mq;
// -category; (residenziale, pertinenza, commerciale)
// -Vetustà;

// Al volore dell'immobile verrà applicato un correttivo in diminuzione in funzione delle vetustà
// dell'immobile

// La classe deve contenere:
// 1. Inserimento dati immobile;
// 2. Calcolo valore immobile secondo le seguenti tabelle;
// 3. Calcolare le tasse di registro pari al 6% sul valore;
// 4. Calcolare il canone di affitto pari a 7€ al mq + uteriori 2€ in caso di locale commerciale;

import java.util.Scanner;

public class Immobile {

    Scanner input = new Scanner(System.in);

    private String category;
    private int mq, vetusta, vTot = 0;
    private int ResValoreMq = 700, PerValoreMq = 500, CommValoreMq = 950;
    private int rV10_20 = 15, rVo20 = 27, pV10_20 = 10, pVo20 = 18, cV10_20 = 13, cVo20 = 22;

    public void init() {
        try{
            System.out.println("Inserisci la categoria dell'immobile: ");
            category = input.nextLine();
            setcategory(category.toLowerCase());
            System.out.println("Inserisci i mq dell'immobile: ");
            mq = input.nextInt();
            setmq(mq);
            System.out.println("Inserisci la percentuale di vetustà dell'immobile: ");
            vetusta = input.nextInt();
            setvetusta(vetusta);
        }catch(Exception e){
            System.out.println("Errore: " + e);
        }
    }

    private void setmq(int mq) {
        this.mq = mq;
    }
    private void setvetusta(int vetusta) {
        if(vetusta <= 30) {
            this.vetusta = vetusta;
        }
    }
    private void setcategory(String cat) {
        if(cat.equals("Residenziale") || cat.equals("Pertinenza") || cat.equals("Commerciale")) {
            this.category = cat;
        }
    }

    public int getvTot() {
        if (vTot == 0){
            setvTot();
        }
        return vTot;
    }

    private void setvTot() {
        int val = 0;
        if(category.equals("Residenziale")) {
            val = (mq * ResValoreMq);
            val = calcCorrettivovetusta(val); 
        } else if(category.equals("Pertinenza")) {
            val = (mq * PerValoreMq);
            val = calcCorrettivovetusta(val);
        } else if(category.equals("Commerciale")) {
            val = (mq * CommValoreMq);
            val = calcCorrettivovetusta(val);
        }
        vTot = val;
    }

    private int calcCorrettivovetusta(int valore) {
        try{
            if(vetusta >= 10 && vetusta < 20) {
                if(category.equals("Residenziale")) {
                    valore -= (valore/100) * rV10_20;
                } else if(category.equals("Pertinenza")) {
                    valore -= (valore/100) * pV10_20;
                } else if(category.equals("Commerciale")) {
                    valore -= (valore/100) * cV10_20;
                }
            } else if(vetusta >= 20 && vetusta <= 30) {
                if(category.equals("Residenziale")) {
                    valore -= (valore/100) * rVo20;
                } else if(category.equals("Pertinenza")) {
                    valore -= (valore/100) * pVo20;
                } else if(category.equals("Commerciale")) {
                    valore -= (valore/100) * cVo20;
                }
            }
            return valore;
        } catch(Exception e) {
            System.out.println("Errore: " + e);
            return 0;
        }
    }

    public int getTasseRegistro() {
        if(vTot == 0){
            setvTot();
        }
        try{
            return (vTot * 6) / 100;
        }catch(Exception e) {
            System.out.println("Errore: " + e);
            return 0;
        }
    }

    public int getCanoneAffitto() {
        if(vTot == 0){
            setvTot();
        }
        try{
            if(category.equals("Residenziale") || category.equals("Pertinenza")) {
                return mq * 7;
            } else if(category.equals("Commerciale")) {
                return mq * 9;
            } else {
                return 0;
            }
        }catch(Exception e) {
            System.out.println("Errore: " + e);
            return 0;
        }
    }

}