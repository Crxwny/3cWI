package at.damian.projects.basics.tasks;

import java.util.Scanner;

public class caesar_decryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib den Text ein: ");
        String text = scanner.nextLine();

        System.out.print("Gib die Verschiebung ein: ");
        int shift = scanner.nextInt();

        String encrypted = encrypt(text, shift);
        System.out.println("Verschlüsselter Text: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Entschlüsselter Text: " + decrypted);

    }

    public static String encrypt(String data, int shift) {
        String encrypted = "";
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            encrypted += (char) (ch + shift);
        }
        return encrypted;
    }

    public static String decrypt(String data, int shift) {
        String decrypted = "";
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            decrypted += (char) (ch - shift);
        }
        return decrypted;
    }
}
