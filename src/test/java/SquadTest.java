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

}
