package at.damian.projects.OO_Programming.Zusatzaufgabe;

public class Passenger {
    private String firstName;
    private String lastName;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String inform(String message) {
        System.out.println(message + " " +  firstName + " informed.");
        return message;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
