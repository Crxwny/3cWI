import java.util.Scanner;

public class Caeser_Encryption {
    public static void main(String[] args) {

        //Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen verschoben
        // (z.B. 2) a wird zu c, f wird zu h, z wird zu b usw.
        //  Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String
        Scanner scanner = new Scanner(System.in);
        Scanner word = new Scanner(System.in);
        boolean isFinished = false;

        while (!isFinished) {
        System.out.println("Press 1 to encrypt a word");
        System.out.println("Press 2 to decrypt a word");
        System.out.println("Press 3 to End");

        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                System.out.println("You choose Encryption");
                System.out.println("Type in your word");
                String wordEncrypt = word.nextLine();
                char[] charArray1 = wordEncrypt.toCharArray();

                System.out.println("------------------------");

                System.out.println("Array: "+charArray1[3]);
                break;


            case 2:
                System.out.println("You choose Decryption");
                System.out.println("Type in your word");
                String wordDecrypt = word.nextLine();
                char[] charArray2 = wordDecrypt.toCharArray();

                System.out.println("-----------------------");
                System.out.println("Array: " +charArray2[2]);
                System.out.println(charArray2);

                break;

            case 3:
                System.out.println("Closed the Application");
                isFinished = true;
                break;
        }





        }












    }
}
