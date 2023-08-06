import Classes.*;
import Enums.PlaneType;
import Enums.Rank;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class FlightTest {
    @Test
    public void testFlightWithFirstOfficerAndPurser() {
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(new Pilot("John", Rank.CAPTAIN, "LN1234"));
        pilots.add(new Pilot("Alice", Rank.FIRST_OFFICER, "LN5678")); // Adding First Officer

        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
        cabinCrew.add(new CabinCrewMember("Mary", Rank.FLIGHT_ATTENDANT));
        cabinCrew.add(new CabinCrewMember("Bob", Rank.PURSER)); // Adding Purser

        Flight flight = new Flight(pilots, cabinCrew, new Plane(PlaneType.BOEING747), "FR756", "GLA", "EDI", "10:00");

        boolean hasFirstOfficer = false;
        for (Pilot pilot : flight.getPilots()) {
            if (pilot.getRank() == Rank.FIRST_OFFICER) {
                hasFirstOfficer = true;
                break;
            }
        }

        boolean hasPurser = false;
        for (CabinCrewMember crewMember : flight.getCabinCrew()) {
            if (crewMember.getRank() == Rank.PURSER) {
                hasPurser = true;
                break;
            }
        }

        assertTrue(hasFirstOfficer);
        assertTrue(hasPurser);
    }

    @Test
    public void testGetAvailableSeats() {
        Plane plane = new Plane(PlaneType.BOEING747);
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), plane, "FR756", "GLA", "EDI", "10:00");

        int expectedAvailableSeats = plane.getCapacity();
        assertEquals(expectedAvailableSeats, flight.getAvailableSeats());
    }

    @Test
    public void testBookPassenger() {
        Plane plane = new Plane(PlaneType.BOEING747);
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), plane, "FR756", "GLA", "EDI", "10:00");

        Passenger passenger = new Passenger("John", 2);
        assertTrue(flight.bookPassenger(passenger));
        assertEquals(plane.getCapacity() - 1, flight.getAvailableSeats());
    }

    @Test
    public void testBookPassengerNoSeats() {
        Plane plane = new Plane(PlaneType.BOEING747);
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), plane, "FR756", "GLA", "EDI", "10:00");

        for (int i = 0; i < plane.getCapacity(); i++) {
            Passenger passenger = new Passenger("Passenger" + i, 2);
            assertTrue(flight.bookPassenger(passenger));
        }

        assertFalse(flight.bookPassenger(new Passenger("Jane", 2)));
        assertEquals(0, flight.getAvailableSeats());
    }

    @Test
    public void testGetPilots() {
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(new Pilot("John", Rank.CAPTAIN, "LN1234"));
        Flight flight = new Flight(pilots, new ArrayList<>(), new Plane(PlaneType.BOEING747), "FR756", "GLA", "EDI", "10:00");

        assertEquals(pilots, flight.getPilots());
    }

    @Test
    public void testSetPilots() {
        ArrayList<Pilot> initialPilots = new ArrayList<>();
        initialPilots.add(new Pilot("John", Rank.CAPTAIN, "LN1234"));
        Flight flight = new Flight(initialPilots, new ArrayList<>(), new Plane(PlaneType.BOEING747), "FR756", "GLA", "EDI", "10:00");

        ArrayList<Pilot> newPilots = new ArrayList<>();
        newPilots.add(new Pilot("Mary", Rank.CAPTAIN, "LN5678"));
        flight.setPilots(newPilots);

        assertEquals(newPilots, flight.getPilots());
    }

    @Test
    public void testGetCabinCrew() {
        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
        cabinCrew.add(new CabinCrewMember("Mary", Rank.FLIGHT_ATTENDANT));
        Flight flight = new Flight(new ArrayList<>(), cabinCrew, new Plane(PlaneType.BOEING747), "FR756", "GLA", "EDI", "10:00");

        assertEquals(cabinCrew, flight.getCabinCrew());
    }

    @Test
    public void testSetCabinCrew() {
        ArrayList<CabinCrewMember> initialCabinCrew = new ArrayList<>();
        initialCabinCrew.add(new CabinCrewMember("Mary", Rank.FLIGHT_ATTENDANT));
        Flight flight = new Flight(new ArrayList<>(), initialCabinCrew, new Plane(PlaneType.BOEING747), "FR756", "GLA", "EDI", "10:00");

        ArrayList<CabinCrewMember> newCabinCrew = new ArrayList<>();
        newCabinCrew.add(new CabinCrewMember("John", Rank.FLIGHT_ATTENDANT));
        flight.setCabinCrew(newCabinCrew);

        assertEquals(newCabinCrew, flight.getCabinCrew());
    }

    @Test
    public void testGetFlightNumber() {
        String flightNumber = "FR756";
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), new Plane(PlaneType.BOEING747), flightNumber, "GLA", "EDI", "10:00");

        assertEquals(flightNumber, flight.getFlightNumber());
    }

    @Test
    public void testSetFlightNumber() {
        String initialFlightNumber = "FR756";
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), new Plane(PlaneType.BOEING747), initialFlightNumber, "GLA", "EDI", "10:00");

        String newFlightNumber = "BA123";
        flight.setFlightNumber(newFlightNumber);

        assertEquals(newFlightNumber, flight.getFlightNumber());
    }

    @Test
    public void testGetDestination() {
        String destination = "GLA";
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), new Plane(PlaneType.BOEING747), "FR756", destination, "EDI", "10:00");

        assertEquals(destination, flight.getDestination());
    }

    @Test
    public void testSetDestination() {
        String initialDestination = "GLA";
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), new Plane(PlaneType.BOEING747), "FR756", initialDestination, "EDI", "10:00");

        String newDestination = "LHR";
        flight.setDestination(newDestination);

        assertEquals(newDestination, flight.getDestination());
    }

    @Test
    public void testGetDepartureAirport() {
        String departureAirport = "EDI";
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), new Plane(PlaneType.BOEING747), "FR756", "GLA", departureAirport, "10:00");

        assertEquals(departureAirport, flight.getDepartureAirport());
    }

    @Test
    public void testSetDepartureAirport() {
        String initialDepartureAirport = "EDI";
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), new Plane(PlaneType.BOEING747), "FR756", "GLA", initialDepartureAirport, "10:00");

        String newDepartureAirport = "JFK";
        flight.setDepartureAirport(newDepartureAirport);

        assertEquals(newDepartureAirport, flight.getDepartureAirport());
    }

    @Test
    public void testGetDepartureTime() {
        String departureTime = "10:00";
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), new Plane(PlaneType.BOEING747), "FR756", "GLA", "EDI", departureTime);

        assertEquals(departureTime, flight.getDepartureTime());
    }

    @Test
    public void testSetDepartureTime() {
        String initialDepartureTime = "10:00";
        Flight flight = new Flight(new ArrayList<>(), new ArrayList<>(), new Plane(PlaneType.BOEING747), "FR756", "GLA", "EDI", initialDepartureTime);

        String newDepartureTime = "14:30";
        flight.setDepartureTime(newDepartureTime);

        assertEquals(newDepartureTime, flight.getDepartureTime());
    }
}
