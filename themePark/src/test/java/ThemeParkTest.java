import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    private ThemePark themePark;
    private Rollercoaster rollercoaster;
    private Playground playground;
    private Dodgems dodgems;
    private Park park;
    private TobaccoStall tobacco;

    @Before
    public void before() {
        themePark = new ThemePark("Codeclan Park");
        rollercoaster = new Rollercoaster("The Jaguar", 8, 10, 8);
        playground = new Playground("Pirate Park", 10);
        park = new Park("Jurassic Park", 4);
        dodgems = new Dodgems("Wacky Races", 6, 10);
        tobacco = new TobaccoStall("Tobacco Paradise","Jonathan", "AB14", 1, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Codeclan Park", themePark.getName());
    }

    @Test
    public void canGetSize() {
        assertEquals(0, themePark.themeParkSize());
    }

    @Test
    public void canAdd() {
        themePark.add(rollercoaster);
        assertEquals(1, themePark.themeParkSize());
    }

    @Test
    public void funRating() {
        assertEquals("No attractions", themePark.funRatings());
    }

    @Test
    public void funRatinWhenIsNotEmpty() {
        themePark.add(rollercoaster);
        themePark.add(playground);
        assertEquals("The Jaguar:8, Pirate Park:10", themePark.funRatings());
    }
}
