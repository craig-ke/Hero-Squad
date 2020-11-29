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
    @Test
    public void getPower_returnsHeroPower_String() {
        Hero testHero = new Hero("Loki",34,"Mischief","Wine");
        assertEquals("Mischief", testHero.getPower());
    }
    @Test
    public void getWeakness_returnsHeroWeakness_String() {
        Hero testHero = new Hero("Loki",34,"Mischief","Wine");
        assertEquals("Wine", testHero.getWeakness());
    }
    @Test
    public void all_returnsAllInstancesOfHero_true() {
        Hero firstHero = new Hero("Loki",34,"Mischief","Wine");
        Hero secondHero = new Hero("Batman",50,"Strength","Women");
        assertEquals(true, Hero.all().contains(firstHero));
        assertEquals(true, Hero.all().contains(secondHero));
    }
    @Test
    public void clear_emptiesInstancesFromArrayList_0() {
        Hero testHero = new Hero("Loki",34,"Mischief","Wine");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }
    @Test
    public void getId_returnsHeroID_1() {
        Hero testHero = new Hero("Loki",34,"Mischief","Wine");
        assertEquals(1, testHero.getId());
    }
    @Test
    public void find_returnsHeroWithSameId_secondHero() {
        Hero firstHero = new Hero("Loki",34,"Mischief","Wine");
        Hero secondHero = new Hero("Batman",50,"Strength","Women");
        assertEquals(Hero.find(secondHero.getId()), secondHero);
    }
}
