import Classes.Pilot;
import Enums.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void setUp() {
        pilot = new Pilot("John", Rank.CAPTAIN, "LN1234");
    }

    @Test
    public void testGetName() {
        assertEquals("John", pilot.getName());
    }

    @Test
    public void testGetRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void testGetLicenceNumber() {
        assertEquals("LN1234", pilot.getLicenceNumber());
    }

    @Test
    public void testFly() {
        assertEquals("Pilot John is flying the plane.", pilot.fly());
    }
}
