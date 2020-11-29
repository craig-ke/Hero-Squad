import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero testHero = new Hero("Loki",34,"Mischief","Wine");
        assertEquals(true, testHero instanceof Hero);
    }
    @Test
    public void getName_returnsHeroName_String() {
        Hero testHero = new Hero("Loki",34,"Mischief","Wine");
        assertEquals("Loki", testHero.getName());
    }
    @Test
    public void getAge_returnsHeroAge_int() {
        Hero testHero = new Hero("Loki",34,"Mischief","Wine");
        assertEquals(34, testHero.getAge());
    }

}
