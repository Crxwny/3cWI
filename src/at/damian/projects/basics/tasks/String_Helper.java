package at.damian.projects.basics.tasks;

import java.util.Scanner;

public class String_Helper {

        public static void main(String[] args) {

            // Palindrome
            boolean isPalindrome = isPalindrome("anna");

            if (isPalindrome) {
                System.out.println("Palindrome true");

            } else {
                System.out.println("Palindrome false");
            }

            // Count Letters
            char c = 'a';
            int amount = countLetters("ansadi",  c);
            System.out.println("Amount of "+c+"'s in this word: "+amount);

            //Reverse String
            String reversed = reverseString("hello");
            System.out.println("Reversed Word: "+reversed);


            // Amount of Letters
            int amountOfLetters = getAmountOfLetters("sepp");
            System.out.println("Amount of Letters: " + amountOfLetters);
        }

        public static boolean isPalindrome(String word) {
            for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
                if (word.charAt(i) != word.charAt(j)) {
                    return false;
                }
            }
            return true;
        }

        public static int countLetters(String word, char c) {
            int amount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    amount++;
                }
            }

            return amount;
        }

        public static String reverseString(String word) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            return reversed;
        }

        public static int getAmountOfLetters(String word) {
            return word.length();
        }



    }

