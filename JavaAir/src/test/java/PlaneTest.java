import Classes.Plane;
import Enums.PlaneType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaneTest {
    @Test
    void testGetCapacity() {
        Plane plane = new Plane(PlaneType.BOEING747);
        assertEquals(400, plane.getCapacity());
    }

    @Test
    void testGetTotalWeight() {
        Plane plane = new Plane(PlaneType.BOEING747);
        assertEquals(80000, plane.getTotalWeight());
    }
}
