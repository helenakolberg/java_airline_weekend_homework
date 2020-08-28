import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Person passenger;

    @Before
    public void before() {
        passenger = new Person("Arthur Apple", 2);
        plane = new Plane(PlaneType.BOEING812);
        flight = new Flight(plane, "TLN4565", "TLN", "EDI", "06.55");
    }

    @Test
    public void passengersStartAtZero() {
        assertEquals(0, flight.getNumOfPassengers());
    }

    @Test
    public void canGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetNumber() {
        assertEquals("TLN4565", flight.getNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("TLN", flight.getDestination());
    }

    @Test
    public void canGetDeparture() {
        assertEquals("EDI", flight.getDeparture());
    }

    @Test
    public void canGetTime() {
        assertEquals("06.55", flight.getTime());
    }

    @Test
    public void canGetAvailableSeats() {
        assertEquals(250, flight.getSeats());
    }

    @Test
    public void canSetAvailableSeats() {
        flight.setSeats(249);
        assertEquals(249, flight.getSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger);
        assertEquals(1, flight.getNumOfPassengers());
        assertEquals(249, flight.getSeats());
    }
}
