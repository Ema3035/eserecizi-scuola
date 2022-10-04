public class Es5 {
    static Computer pc1 = new Computer(8, 1000, 500, "Intel Core i7-9700K", "Nvidia GeForce RTX 2060 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200);
    static Computer pc2 = new Computer(16, 2000, 550, "Amd Ryzen 5 5600X", "Nvidia GeForce RTX 3080 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200);
    static Computer pc3 = new Computer(32, 1000, 500, "Intel Core i8-9800K", "Nvidia GeForce RTX 2080 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200);
    static Computer pc4 = new Computer(64, 2500, 700, "Intel Core i9-12900K", "Nvidia GeForce RTX 4080 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200);
    static Computer pc5 = new Computer(12, 1000, 500, "Intel Core i7-9700K", "Nvidia GeForce RTX 2080 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200);
    static Computer pc6 = new Computer(4, 500, 500, "Amd Ryzen 9 7950X", "Nvidia GeForce RTX 1650 Ti", "Corsair Carbide 275R", 1500, 4.9, 1.8, 3200);



public static void main(String[] args){
    while(true){
        System.out.println("Scegli un computer da vedere i dati: ");
        System.out.println("1. PC1");
        System.out.println("2. PC2");
        System.out.println("3. PC3");
        System.out.println("4. PC4");
        System.out.println("5. PC5");
        System.out.println("6. PC6");
        System.out.println("7. Esci");
        
        int choice = input.nextInt();
        if (choice == 1){
            pc1.showData();
            pc1.addRam(11);
        }
        else if(choice == 2){
            pc2.showData();
            pc2.addRam(10);
        }
        else if(choice == 3){
            pc3.showData();
            pc3.addRam(256);
        }
        else if(choice == 4){
            pc4.showData();
            pc4.addRam(16);
        }
        else if(choice == 5){
            pc5.showData();
            pc5.addRam(2);
        }
        else if(choice == 6){
            pc6.showData();
            pc6.addRam(6);
        }
        else if(choice == 7){
            break;
        }
        else{
            System.out.println("Scelta non valida");
        }
}



}