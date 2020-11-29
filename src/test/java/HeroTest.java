import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero testHero = new Hero("Loki",34,"Mischief","Wine");
        assertEquals(true, testHero instanceof Hero);
    }
}
