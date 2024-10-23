package at.damian.projects.basics.games;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int playerOne = 0;
        int playerTwo = 0;
        boolean isFinished = false;
        int rounds = 0;

        //Erstelle ein Würfelspiel! Du spielst gegen den Computer.
        // Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
        // Er spielt dabei gegen den Computer.
        // Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen, ansonsten der Computer.

        while (!isFinished) {

            System.out.println("Press 1 to roll the dice");
            System.out.println("Press 2 to end the game");

            int selection = scanner.nextInt();


            switch (selection) {

                case 1:
                    int randomNumber1 = random.nextInt(1, 7);
                    playerOne += randomNumber1;

                    int randomNumber2 = random.nextInt(1, 7);
                    playerTwo += randomNumber2;
                    rounds += 1;

                    System.out.println("Rolls:");

                    System.out.println("You: " +randomNumber1);
                    System.out.println("Computer: " +randomNumber2);

                    System.out.println("---------------------------------");


                    break;


                case 2:
                    System.out.println("You chose to close the game");
                    System.out.println("The current points are:");
                    System.out.println("You: " + playerOne);
                    System.out.println("Computer: " + playerTwo);

                    isFinished = true;
                    break;
            }

            if (rounds == 6) {
                System.out.println("End of the Game");
                System.out.println("The current points are:");
                System.out.println("You: " + playerOne);
                System.out.println("Computer: " + playerTwo);

                if (playerOne > playerTwo) {
                    System.out.println("You won");
                } else {
                    System.out.println("You loose");
                }

                isFinished = true;
            }

        }

    }
}
