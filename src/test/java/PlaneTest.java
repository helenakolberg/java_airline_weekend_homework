import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING256);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING256, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(200, plane.getCapacity());
    }

    @Test
    public void canGetWeight() {
        assertEquals(40000, plane.getWeight());
    }
}
