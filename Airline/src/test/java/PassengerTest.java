import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Sam", 1);

    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Sam", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }






}
