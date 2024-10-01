// Erstelle eine Zufallszahl zwischen 5 und 10

// Wenn der Wert 10 ist gib aus Ten
// Wenn der Wert 9 ist gib aus Nine
// Wenn der Wert 8 ist gib aus Eight
// etc.

import java.util.Random;

public class Switch_A1 {

    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(5, 11);
        // Der untere Grenzwert ist eingeschlossen, der obere nicht, deshalb bound 11 und nicht 10

        System.out.println(randomNumber);

        switch (randomNumber) {

            case 5:
                System.out.println("is five");
                break;

            case 6:
                System.out.println("is six");
                break;

            case 7:
                System.out.println("is seven");
                break;

            case 8:
                System.out.println("is eight");
                break;

            case 9:
                System.out.println("is nine");
                break;

            case 10:
                System.out.println("is ten");
                break;
        }


    }
}