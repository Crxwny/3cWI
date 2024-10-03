import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {

        // Diese Aufgabe setzt sich aus allen gelernten Inhalten zusammen!
        //Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:
        //1. Einzahlen
        //2. Abheben
        //3. Kontostand
        //4. Beenden
        //Folgendes Video zeigt dir die Funktionsweise

        boolean isFinished = false;
        double balance = 0;

        Scanner scanner = new Scanner(System.in);


        while (!isFinished) {

            System.out.println("Selektieren Sie die gewünschte Funktion");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");

            int selection = scanner.nextInt();


            switch (selection) {

                case 1:
                    System.out.println("Sie haben Option " +selection + " gewählt!");
                    System.out.println("Wieviel möchten Sie einzahlen?");

                    double value = scanner.nextDouble();
                    balance+=value;

                    System.out.println("------------------------------------------------");



                    break;

                case 2:
                    System.out.println("Sie haben Option " +selection + " gewählt!");
                    System.out.println("Wieviel möchten Sie abheben?");
                    System.out.println("------------------------------------------------");


                    value = scanner.nextDouble();
                    balance-=value;
                    break;

                case 3:
                    System.out.println("Sie haben Option " +selection + " gewählt!");

                    System.out.println("Ihr Kontostand beträgt " + balance +"€");
                    System.out.println("------------------------------------------------");
                    break;


                case 4:
                    System.out.println("Sie haben Option " +selection + " gewählt!");
                    System.out.println("System wird beendet.");
                    isFinished = true;
                    break;




            }
        }


    }
}
