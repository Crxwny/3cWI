package at.damian.projects.tests.test_02;

import java.util.Scanner;

public abstract class AbstractGUI {
    Mediamanager mediamanager;
    Scanner scanner = new Scanner(System.in);

    public AbstractGUI(Mediamanager mediamanager) {
        this.mediamanager = mediamanager;
    }

    public void start() {
        while (true) {
            System.out.println("Select Method");
            System.out.println("1: getAllMedia");
            System.out.println("2: calculateTotalMediaValue");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    mediamanager.getAllMedia();
                    System.out.println("------------");
                    break;

                case 2:
                    mediamanager.calculateTotalMediaValue();
                    System.out.println("------------");
                    break;

                default:
                    System.out.println("Invalid");
                    System.out.println("------------");
                    break;

            }

        }
    }
}

