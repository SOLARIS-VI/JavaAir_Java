package Enums;

// Enum to define the different types of planes
public enum PlaneType {
    BOEING747(400, 80000); // Plane type with its corresponding capacity and total weight

    private final int capacity;    // Capacity of the plane
    private final int totalWeight; // Total weight the plane can carry

    // Constructor to set capacity and total weight
    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    // Getter for capacity
    public int getCapacity() {
        return capacity;
    }

    // Getter for total weight
    public int getTotalWeight() {
        return totalWeight;
    }
}
