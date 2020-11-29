import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquadTest {
    @After
    public void tearDown() {
        Squad.clear();
    }

    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("Avengers",12,"Protect Earth");
        assertEquals(true, testSquad instanceof Squad);
    }
    @Test
    public void getName_returnsSquadName_String() {
        Squad testSquad = new Squad("Avengers",12,"Protect Earth");
        assertEquals("Avengers", testSquad.getName());
    }
    @Test
    public void getSize_returnsSquadSize_int() {
        Squad testSquad = new Squad("Avengers",12,"Protect Earth");
        assertEquals(12, testSquad.getSize());
    }
    @Test
    public void getMission_returnsSquadMission_String() {
        Squad testSquad = new Squad("Avengers",12,"Protect Earth");
        assertEquals("Protect Earth", testSquad.getMission());
    }
    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstSquad = new Squad("Avengers",12,"Protect Earth");
        Squad secondSquad = new Squad("Guardians of the galaxy",7,"Ensure the whole universe is safe");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));
    }

}
