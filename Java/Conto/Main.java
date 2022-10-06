import java.util.Scanner;

public class Main {
        static Conto Emanuele = new Conto( "Emanuele", "Roccaro", "30/03/2005", 27764, "IT33Q0300203280612543457523");
        static Conto Filippo = new Conto( "Filippo", "Caio", "12/07/2005", 88678, "IT02X0300203280747732267696");
        static Conto Giorgio = new Conto( "Giorgio", "Puzzangara", "04/01/2006", 23786, "IT14Z0300203280514824256475");
    
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            while(true){
                System.out.println("Scegli un utente: ");
                System.out.println("1. Emanuele Roccaro");
                System.out.println("2. Filippo Caio");
                System.out.println("3. Giorgio Puzzangara");
                System.out.println("4. Esci");
                int scelta = input.nextInt();

                if (scelta == 1){
                    System.out.println("Scegli un opzione: ");
                    System.out.println("1. Deposito.");
                    System.out.println("2. Prelievo.");
                    System.out.println("3. Trasferisci fondi.");
                    System.out.println("4. Dati.");
                    System.out.println("5. Esci.");
                    scelta = input.nextInt();

                    if (scelta == 1){
                        System.out.println("Quanto vuole depositare?");
                        int deposito = input.nextInt();
                        Emanuele.deposito;
                    }

                    else if (scelta == 2){
                        System.out.println("Quanto vuole prelevare?");
                        int prelievo = input.nextInt();
                        Emanuele.prelievo;
                    }

                    else if (scelta == 3){
                        System.out.println("Quanto vuole trasferire?");
                        int trasferimento = input.nextInt();
                        Emanuele.trasferimento;
                    }

                    else if (scelta == 4){
                        Emanuele.showData();
                    }

                    else if (scelta == 5){
                        break;
                    }

                }
                else if(scelta == 2){
                    System.out.println("Scegli un opzione: ");
                    System.out.println("1. Deposito.");
                    System.out.println("2. Prelievo.");
                    System.out.println("3. Trasferisci fondi.");
                    System.out.println("4. Dati.");
                    System.out.println("5. Esci.");
                    scelta = input.nextInt();

                    if (scelta == 1){
                        System.out.println("Quanto vuole depositare?");
                        int deposito = input.nextInt();
                        Filippo.deposito;
                    }

                    else if (scelta == 2){
                        System.out.println("Quanto vuole prelevare?");
                        int prelievo = input.nextInt();
                        Filippo.prelievo;
                    }

                    else if (scelta == 3){
                        System.out.println("Quanto vuole trasferire?");
                        int trasferimento = input.nextInt();
                        Filippo.trasferimento;
                    }

                    else if (scelta == 4){
                        Filippo.showData();
                    }

                    else if (scelta == 5){
                        break;
                    }
                }
                else if(scelta == 3){
                    System.out.println("Scegli un opzione: ");
                    System.out.println("1. Deposito.");
                    System.out.println("2. Prelievo.");
                    System.out.println("3. Trasferisci fondi.");
                    System.out.println("4. Dati.");
                    System.out.println("5. Esci.");
                    scelta = input.nextInt();

                    if (scelta == 1){
                        System.out.println("Quanto vuole depositare?");
                        int deposito = input.nextInt();
                        Filippo.deposito;
                    }

                    else if (scelta == 2){
                        System.out.println("Quanto vuole prelevare?");
                        int prelievo = input.nextInt();
                        Filippo.prelievo;
                    }

                    else if (scelta == 3){
                        System.out.println("Quanto vuole trasferire?");
                        int trasferimento = input.nextInt();
                        Filippo.trasferimento;
                    }

                    else if (scelta == 4){
                        Filippo.showData();
                    }

                    else if (scelta == 5){
                        break;
                    }
                    
                }
                else if(scelta == 4){
                    break;
                }
                else{
                    System.out.println("Scelta non valida");
                }
        }
            }
}