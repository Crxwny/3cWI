package at.damian.projects.basics.general;


import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class String_Manipulation {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in your string:");
        String S = in.nextLine();
        char[] data = S.toCharArray();
        for (int i = 0; i < data.length; i++) {
            char c = data[i];
            if (c == 'O' || c == 'o') {
                data[i] = '0';
            }
            if (c == 'L' || c == 'l') {
                data[i] = '1';
            }
            if (c == 'Z' || c == 'z') {
                data[i] = '2';
            }
            if (c == 'E' || c == 'e') {
                data[i] = '3';
            }
            if (c == 'A' || c == 'a') {
                data[i] = '4';
            }
            if (c == 'S' || c == 's') {
                data[i] = '5';
            }
            if (c == 'G' || c == 'g') {
                data[i] = '6';
            }
            if (c == 'T' || c == 't') {
                data[i] = '7';
            }
            if (c == 'B' || c == 'b') {
                data[i] = '8';
            }
            if (c == 'Q' || c == 'q') {
                data[i] = '9';
            }

        }

        System.out.println(String.valueOf(data));
    }
}

