import attractions.Playground;
import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import persons.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {
    private Rollercoaster rollercoaster;
    private Visitor visitor00;
    private Visitor visitor01;
    private Visitor visitor02;
    private Visitor visitor03;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("The Jaguar", 8, 10, 8);
        visitor00 = new Visitor("Jaime", 29, 1.70, 35, false);
        visitor01 = new Visitor("John", 14, 1.40, 10, false);
        visitor02 = new Visitor("John", 10, 1.80, 10, false);
        visitor03 = new Visitor("John", 12,1.80, 10, true);
    }
    @Test
    public void hasName() {
        assertEquals("The Jaguar", rollercoaster.getName());
    }
    @Test
    public void hasFunRating() {
        assertEquals(8, rollercoaster.getFunRating());
    }
    @Test
    public void canGoInside() {
        assertTrue(rollercoaster.isAllowedTo(visitor00));
    }
    @Test
    public void cannotGoInsideNotEnoughHeight() {
        assertFalse(rollercoaster.isAllowedTo(visitor01));
    }
    @Test
    public void cannotGoInsideNotEnoughAge() {
        assertFalse(rollercoaster.isAllowedTo(visitor02));
    }
    @Test
    public void hasPrice() {
        assertEquals(18, rollercoaster.getPrice(), 0);
    }
    @Test
    public void normalPrice() {
        assertEquals(18, rollercoaster.priceFor(visitor00),0);
    }
    @Test
    public void halfPrice() {
        assertEquals(9, rollercoaster.priceFor(visitor03), 0);
    }
    @Test
    public void notAllowedHadMeal() {
        assertFalse(rollercoaster.isAllowedTo(visitor03));
    }
}
