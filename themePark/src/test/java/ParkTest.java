import attractions.Park;
import org.junit.Before;
import org.junit.Test;
import persons.Visitor;

import static org.junit.Assert.*;

public class ParkTest {
    private Park park;
    private Visitor visitor;

    @Before
    public void before() {
        park = new Park("Jurassic Park", 4);
        visitor = new Visitor("Jaime", 29, 1.70, 35, false);
    }
    @Test
    public void hasName() {
        assertEquals("Jurassic Park", park.getName());
    }
    @Test
    public void hasFunRating() {
        assertEquals(4, park.getFunRating());
    }
    @Test
    public void canHostVisitors() {
        park.addVisitor(visitor);
        assertEquals(1, park.getNumberOfVisitors());
    }
    @Test
    public void canRemoveVisitors() {
        park.addVisitor(visitor);
        park.removeVisitor(visitor);
        assertEquals(0, park.getNumberOfVisitors());
    }
}
