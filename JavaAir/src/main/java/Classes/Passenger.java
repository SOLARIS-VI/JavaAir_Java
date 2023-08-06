package Classes;

public class Passenger {
    private final String name;       // Name of the passenger
    private final int numberOfBags;  // Number of bags the passenger is carrying

    // Constructor to set name and number of bags
    public Passenger(String name, int numberOfBags) {
        if (numberOfBags < 0) {
            throw new IllegalArgumentException("Number of bags cannot be negative.");
        }

        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for number of bags
    public int getNumberOfBags() {
        return numberOfBags;
    }
}
