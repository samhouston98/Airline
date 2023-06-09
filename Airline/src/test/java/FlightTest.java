import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;

    @Before
    public void setUp() {
        List<Pilot> pilots = new ArrayList<>();
        pilots.add(new Pilot("Bruce", Rank.CAPTAIN, "123456"));

        List<CabinCrewMember> crewMembers = new ArrayList<>();
        crewMembers.add(new CabinCrewMember("Brian", Rank.FLIGHT_ATTENDANT));

        plane = new Plane(PlaneType.BOEING747, 300, 50000);

        flight = new Flight(pilots, crewMembers, plane, "FR756", "GLA", "EDI", "10:00");
}

    @Test
    public void canGetNumberOfAvailableSeats() {
        assertEquals(300, flight.getAvailableSeats());
        Passenger passenger = new Passenger("Sam", 1);
        flight.bookPassenger(passenger);
        assertEquals(299, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassengerIfSeatsAvailable() {

        assertEquals(300, flight.getAvailableSeats());

        Passenger passenger = new Passenger("Sam", 1);
        flight.bookPassenger(passenger);

        assertEquals(299, flight.getAvailableSeats());
        assertEquals(1, flight.getBookedPassengers().size());
        assertEquals(passenger, flight.getBookedPassengers().get(0));
    }

    @Test
    public void cannotBookPassengerIfNoSeatsAvailable() {
        for (int i = 0; i < 300; i++) {
            Passenger passenger = new Passenger("Passenger " + (i + 1), 1);
            flight.bookPassenger(passenger);
        }

        Passenger extraPassenger = new Passenger("Extra Passenger", 1);
        flight.bookPassenger(extraPassenger);

        assertEquals(0, flight.getAvailableSeats());
        assertEquals(300, flight.getBookedPassengers().size());

    }
}

