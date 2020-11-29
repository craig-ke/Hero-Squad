import org.junit.After;

import static org.junit.Assert.assertEquals;

public class SquadTest {
    @After
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("Avengers",12,"Protect Earth");
        assertEquals(true, testSquad instanceof Squad);
    }
}
