import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight;
    private FlightManager flightManager;
    private Plane plane;
    private Person passenger1;
    private Person passenger2;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING256);
        flight = new Flight(plane, "TLN4565", "TLN", "EDI", "06.55");
        flightManager = new FlightManager();
        passenger1 = new Person("Sam Smith", 2);
        passenger2 = new Person("Arthur Apple", 2);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
    }

    @Test
    public void canCalculateBaggageAllowancePerPassenger() {
        double allowance = flightManager.baggageAllowancePerPassenger(flight);
        assertEquals(100.0, allowance, 0.01);
    }

    @Test
    public void canCalculateAmountOfBaggageBooked() {
        double baggageBooked = flightManager.baggageBooked(flight);
        assertEquals(200.0, baggageBooked, 0.01);
    }
}
