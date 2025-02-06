package at.damian.projects.OO_Programming.finalExplanation;

// Eine Klasse mit final-Variablen
class Person {
    private final String name;  // final Variable -> Name kann nicht geändert werden
    private int alter;  // normale Variable

    // Konstruktor zur Initialisierung des Namens
    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    // Eine finale Methode -> kann NICHT überschrieben werden
    public final void zeigeInfo() {
        System.out.println("Name: " + name + ", Alter: " + alter);
    }
}

// Eine finale Klasse -> kann NICHT erweitert werden
final class Student extends Person {
    private final int studentID;

    public Student(String name, int alter, int studentID) {
        super(name, alter);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    // Diese Methode wird von Person geerbt, aber "zeigeInfo" kann NICHT überschrieben werden, da sie final ist
}

// Eine Klasse kann nicht von `final class Student` erben
// class Hochschulstudent extends Student { }  // FEHLER! Student ist final

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Damian", 17, 12345);
        s.zeigeInfo(); // Name: Damian, Alter: 17
        System.out.println("Studenten-ID: " + s.getStudentID());
    }
}

