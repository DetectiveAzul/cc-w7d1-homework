import attractions.Dodgems;
import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import persons.Visitor;

import static org.junit.Assert.*;

public class DodgemsTest {
    private Dodgems dodgems;
    private Visitor visitor00;
    private Visitor visitor03;

    @Before
    public void before() {
        dodgems = new Dodgems("Wacky Races", 6, 10);
        visitor00 = new Visitor("Jaime", 29, 1.70, 35);
        visitor03 = new Visitor("John", 12,1.80, 10);
    }
    @Test
    public void hasName() {
        assertEquals("Wacky Races", dodgems.getName());
    }
    @Test
    public void hasFunRating() {
        assertEquals(6, dodgems.getFunRating());
    }

    @Test
    public void hasPrice() {
        assertEquals(10, dodgems.getPrice(), 0);
    }
    @Test
    public void normalPrice() {
        assertEquals(10, dodgems.priceFor(visitor00),0);
    }
    @Test
    public void halfPrice() {
        assertEquals(5, dodgems.priceFor(visitor03), 0);
    }
}
