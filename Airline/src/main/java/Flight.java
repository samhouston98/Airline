import java.util.ArrayList;
import java.util.List;

public class Flight {
    private List<Pilot> pilots;
    private List<CabinCrewMember> cabinCrewMembers;
    private List<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(List<Pilot> pilots, List<CabinCrewMember> cabinCrewMembers, Plane plane,
                  String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.bookedPassengers = new ArrayList<>();
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - bookedPassengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (getAvailableSeats() > 0) {
            bookedPassengers.add(passenger);
            System.out.println("Passenger " + passenger.getName() + " booked successfully.");
        } else {
            System.out.println("Sorry, no available seats.");
        }
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public List<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(List<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers = cabinCrewMembers;
    }

    public List<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public void setBookedPassengers(List<Passenger> bookedPassengers) {
        this.bookedPassengers = bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
