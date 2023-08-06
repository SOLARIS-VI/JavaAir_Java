import Classes.Passenger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PassengerTest {
    @Test
    public void testGetName() {
        Passenger passenger = new Passenger("John", 2);
        assertEquals("John", passenger.getName());
    }

    @Test
    public void testGetNumberOfBags() {
        Passenger passenger = new Passenger("John", 2);
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void testNegativeNumberOfBags() {
        assertThrows(IllegalArgumentException.class, () -> new Passenger("John", -1));
    }
}
