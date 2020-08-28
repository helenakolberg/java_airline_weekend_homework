import java.util.ArrayList;

public class Flight {

    private ArrayList<Person> passengers;
    private Plane plane;
    private String number;
    private String destination;
    private String departure;
    private String time;
    private int seats;

    public Flight(Plane plane, String number, String destination, String departure, String time, int seats) {
        this.passengers = new ArrayList<Person>();
        this.plane = plane;
        this.number = number;
        this.destination = destination;
        this.departure = departure;
        this.time = time;
        this.seats = seats;
    }

    public int getNumOfPassengers() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getNumber() {
        return this.number;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getTime() {
        return time;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
