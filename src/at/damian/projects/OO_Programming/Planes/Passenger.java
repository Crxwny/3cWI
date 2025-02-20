package at.damian.projects.OO_Programming.Planes;

public class Passenger {
    private String firstName;
    private String lastName;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void inform() {
        System.out.println("Informing " + firstName + " " + lastName);
    }
}
