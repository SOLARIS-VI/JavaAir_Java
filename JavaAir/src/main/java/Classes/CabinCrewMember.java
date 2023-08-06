package Classes;

import Enums.Rank;

public class CabinCrewMember {
    private final String name;  // Name of the cabin crew member
    private final Rank rank;    // Rank of the cabin crew member

    // Constructor to set name and rank
    public CabinCrewMember(String name, Rank rank) {
        if (name == null || rank == null) {
            throw new IllegalArgumentException("Name and rank cannot be null.");
        }

        this.name = name;
        this.rank = rank;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for rank
    public Rank getRank() {
        return rank;
    }

    // Method to relay a message to passengers
    public String relayMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Message cannot be null.");
        }
        return "Attention passengers, " + message;
    }
}
