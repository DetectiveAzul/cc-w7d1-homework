import attractions.Dodgems;
import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import persons.Visitor;

import static org.junit.Assert.*;

public class DodgemsTest {
    private Dodgems dodgems;
    private Visitor visitor00;
    private Visitor visitor01;
    private Visitor visitor02;
    private Visitor visitor03;

    @Before
    public void before() {
        dodgems = new Dodgems("Wacky Races", 6, 10);
        visitor00 = new Visitor("Jaime", 29, 1.70, 35, false);
        visitor01 = new Visitor("Jaime", 29, 1.70, 35, false);
        visitor02 = new Visitor("Jaime", 29, 1.70, 35, false);
        visitor03 = new Visitor("John", 12,1.80, 10, false);
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
        dodgems.addVisitor(visitor01);
        dodgems.addVisitor(visitor02);
        assertEquals(10, dodgems.priceFor(visitor00),0);
    }
    @Test
    public void halfPrice() {
        dodgems.addVisitor(visitor01);
        dodgems.addVisitor(visitor02);
        assertEquals(5, dodgems.priceFor(visitor03), 0);
    }
    @Test
    public void freeRide() {
        dodgems.addVisitor(visitor01);
        assertEquals(0, dodgems.priceFor(visitor03), 0);
    }
}
