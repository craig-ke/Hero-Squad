import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    @Test
    public void getId_returnsSquadId_1() {
        Squad testSquad = new Squad("Avengers",12,"Protect Earth");
        assertEquals(1, testSquad.getId());
    }
    @Test
    public void find_returnsSquadWithSameId_secondSquad() {
        Squad firstSquad = new Squad("Avengers",12,"Protect Earth");
        Squad secondSquad = new Squad("Guardians of the galaxy",7,"Ensure the whole universe is safe");
        assertEquals(Squad.find(secondSquad.getId()), secondSquad);
    }
    @Test
    public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
        Squad testSquad = new Squad("Avengers",12,"Protect Earth");
        assertEquals(0, testSquad.getHeroes().size());
    }
    @Test
    public void addHero_addsHeroToList_true() {
        Squad testSquad = new Squad("Avengers",12,"Protect Earth");
        Hero testHero = new Hero("Thor",20,"Thunder","Weak without his Hammer");
        testSquad.addHero(testHero);
        assertTrue(testSquad.getHeroes().contains(testHero));
    }
    @Test
    public void heroAlreadyExists_checksIfHeroExists_true() {
        Squad testSquad = new Squad("Avengers",12,"Protect Earth");
        Hero firstHero = new Hero("Thor",20,"Thunder","Weak without his Hammer");
        Hero secondHero = new Hero("Thor",20,"Thunder","Weak without his Hammer");
        testSquad.addHero(firstHero);
        testSquad.addHero(secondHero);
        assertTrue(testSquad.heroAlreadyExists(secondHero));
    }
}
