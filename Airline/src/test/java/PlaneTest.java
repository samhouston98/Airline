import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane( PlaneType.BOEING747, 100,1000.00);

    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(100, plane.getCapacity());
    }

    @Test
    public void canGetPlaneWeight() {
        assertEquals(1000.00, plane.getTotalWeight(), 0.0);
    }

}