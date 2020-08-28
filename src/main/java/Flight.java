import java.util.ArrayList;

public class Flight {

    private ArrayList<Person> passengers;
    private Plane plane;
    private String number;
    private String destination;
    private String departure;
    private String time;

    public Flight(Plane plane, String number, String destination, String departure, String time) {
        this.passengers = new ArrayList<Person>();
        this.plane = plane;
        this.number = number;
        this.destination = destination;
        this.departure = departure;
        this.time = time;
    }

    public int getNumOfPassengers() {
        return this.passengers.size();
    }

    public String getNumber() {
        return this.number;
    }
}
