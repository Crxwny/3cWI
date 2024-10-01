import java.util.Random;
//Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
//Das Programm soll die Zufallszahlen zusammenzählen.
//Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!

public class While_A1 {

    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;
        int summe = 0;

        while (!isFinished) {

            int randomValue = random.nextInt(10, 31);
            System.out.println("Random Zahl ist " + randomValue);

            summe += randomValue;

            if (randomValue == 15 || randomValue == 25) {
                isFinished = true;
                System.out.println("Summe der Random Zahlen ist " + summe);
            }
        }
    }
}
