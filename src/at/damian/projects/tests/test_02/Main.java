package at.damian.projects.tests.test_02;

public class Main {
    public static void main(String[] args) {
        Serie s1 = new Serie(1,"Nejou",50f,"Film über Nejo");
        Film f1 = new Film(2, "Manasek",10f,"Film über Manasek",300f);
        Film f2 = new Film(3,"Test",10f,"Testdescription",100f);

        System.out.println(f1.getDuration());

        Mediamanager mediamanager = new Mediamanager();
        mediamanager.addMedia(f2);
        mediamanager.getAllMedia();
        mediamanager.calculateTotalMediaValue();

        mediamanager.addMedia(s1);
        mediamanager.addMedia(f1);

        GUI1 gui1 = new GUI1(mediamanager);
        gui1.start();


    }
}
