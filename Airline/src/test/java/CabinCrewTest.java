import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Brian", Rank.FLIGHT_ATTENDANT);

    }

    @Test
    public void canGetCrewName(){
        assertEquals("Brian", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberGetsRankFromEnum() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }




}
