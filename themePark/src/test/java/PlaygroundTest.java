import attractions.Playground;
import persons.Visitor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {
    private Playground playground;
    private Visitor visitor00;
    private Visitor visitor01;

    @Before
    public void before() {
        playground = new Playground("Pirate Park", 10);
        visitor00 = new Visitor("Jaime", 29, 1.70, 35);
        visitor01 = new Visitor("John", 14, 1.45, 10);
    }
    @Test
    public void hasName() {
        assertEquals("Pirate Park", playground.getName());
    }
    @Test
    public void hasFunRating() {
        assertEquals(10, playground.getFunRating());
    }
    @Test
    public void canGoInside() {
        assertTrue(playground.isAllowedTo(visitor01));
    }
    @Test
    public void cannotGoInside() {
        assertFalse(playground.isAllowedTo(visitor00));
    }
}
