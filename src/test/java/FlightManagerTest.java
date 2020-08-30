import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING256);
        flightManager = new FlightManager();
    }

    @Test
    public void canCalculateBaggageAllowancePerPassenger() {
        double allowance = flightManager.baggageAllowancePerPassenger(plane);
        assertEquals(100.0, allowance, 0.01);
    }
}
