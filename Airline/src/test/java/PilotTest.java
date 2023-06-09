import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Bruce", Rank.CAPTAIN, "C0D3C1AN");

    }

    @Test
    public void canGetPilotName() {
        assertEquals("Bruce", pilot.getName());
    }

    @Test
    public void canGetPilotRankFromEnum() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("Plane is flying",pilot.flyPlane());
    }

}