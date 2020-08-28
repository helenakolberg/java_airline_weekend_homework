import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING812);
        flight = new Flight(plane, "TLN4565", "TLN", "EDI", "06.55");
    }

    @Test
    public void passengersStartAtZero() {
        assertEquals(0, flight.getNumOfPassengers());
    }
}
