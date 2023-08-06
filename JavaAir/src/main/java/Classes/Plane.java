package Classes;

import Enums.PlaneType;

public class Plane {
    private final PlaneType type; // Type of the plane

    // Constructor to set the type of the plane
    public Plane(PlaneType type) {
        if (type == null) {
            throw new IllegalArgumentException("Plane type cannot be null.");
        }

        this.type = type;
    }

    // Getter for the capacity of the plane
    public int getCapacity() {
        return type.getCapacity();
    }

    // Getter for the total weight the plane can carry
    public int getTotalWeight() {
        return type.getTotalWeight();
    }
}
