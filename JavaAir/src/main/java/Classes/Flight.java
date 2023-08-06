package Classes;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;             // List of pilots for the flight
    private ArrayList<CabinCrewMember> cabinCrew;// List of cabin crew members for the flight
    private final ArrayList<Passenger> passengers;     // List of passengers for the flight
    private final Plane plane;                         // Plane for the flight
    private String flightNumber;                 // Flight number
    private String destination;                  // Destination of the flight
    private String departureAirport;             // Departure airport of the flight
    private String departureTime;                // Departure time of the flight

    // Constructor to initialize the flight details
    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrew, Plane plane,
                  String flightNumber, String destination, String departureAirport, String departureTime) {
        if (pilots == null || cabinCrew == null || plane == null ||
                flightNumber == null || destination == null || departureAirport == null || departureTime == null) {
            throw new IllegalArgumentException("None of the parameters can be null.");
        }

        this.pilots = pilots;
        this.cabinCrew = cabinCrew;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
    }

    // Method to return the number of available seats
    public int getAvailableSeats() {
        return plane.getCapacity() - passengers.size();
    }

    // Method to book a passenger (if there are remaining seats)
    public boolean bookPassenger(Passenger passenger) {
        if (passenger == null) {
            throw new IllegalArgumentException("Passenger cannot be null.");
        }

        if (getAvailableSeats() > 0) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<Pilot> pilots) {
        this.pilots = pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(ArrayList<CabinCrewMember> cabinCrew) {
        this.cabinCrew = cabinCrew;
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
