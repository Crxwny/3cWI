package at.damian.projects.basics.tasks;

import java.util.Random;
import java.util.Scanner;

public class Word_Guesser {
    public static void main(String[] args) {

        String[] guessingWords = {
                "apple", "banana", "cat", "dog", "tree", "chair", "table", "car", "bicycle", "flower",
                "window", "door", "lamp", "sun", "moon", "star", "cloud", "sky", "water", "fire",
                "ice", "snow", "rain", "leaf", "house", "street", "mountain", "river", "forest", "bridge",
                "school", "teacher", "book", "bag", "train", "airplane", "bus", "suitcase", "phone", "computer",
                "keyboard", "mouse", "screen", "radio", "music", "movie", "game", "color", "city", "country"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isFinished = false;
        int counter = 0;
        int randomNumber = random.nextInt(guessingWords.length);


        String guessingWord = guessingWords[randomNumber];
        char[] starWord = new char[guessingWord.length()];

        for (int i = 0; i < guessingWord.length(); i++) {
            starWord[i] = '*';

        }


        while (!isFinished) {
            System.out.println("Welches Wort könnte das sein?");
            System.out.println(starWord);

            System.out.println("Gib einen Buchstaben ein:");
            char guessingLetters = scanner.next().charAt(0);

            for (int i = 0; i < guessingWord.length(); i++) {
                if (guessingLetters == guessingWord.charAt(i)) {
                    starWord[i] = guessingLetters;
                    counter++;

                }

            }




            if (counter == guessingWord.length()) {
                System.out.println("Wort erraten!");
                System.out.println(guessingWord);
                isFinished = true;
            }



        }



    }


    }
