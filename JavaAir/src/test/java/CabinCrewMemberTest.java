import Classes.CabinCrewMember;
import Enums.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember crewMember;

    @Before
    public void before() {
        crewMember = new CabinCrewMember("John", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void testGetName() {
        assertEquals("John", crewMember.getName());
    }

    @Test
    public void testGetRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, crewMember.getRank());
    }

    @Test
    public void testRelayMessage() {
        // relayMessage method returns a message as a string
        assertEquals("Attention passengers, Attention, passengers!", crewMember.relayMessage("Attention, passengers!"));
    }
}
