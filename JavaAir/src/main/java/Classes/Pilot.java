package Classes;

import Enums.Rank;

public class Pilot extends CabinCrewMember {
    private final String licenceNumber; // Licence number of the pilot

    // Constructor to set name, rank, and licence number
    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name, rank);
        if (licenceNumber == null) {
            throw new IllegalArgumentException("Licence number cannot be null.");
        }
        this.licenceNumber = licenceNumber;
    }

    // Getter for licence number
    public String getLicenceNumber() {
        return licenceNumber;
    }

    // Method to fly the plane
    public String fly() {
        return "Pilot " + getName() + " is flying the plane.";
    }
}
