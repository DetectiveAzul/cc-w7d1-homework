import attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkTest {
    private Park park;

    @Before
    public void before() {
        park = new Park("Jurassic Park", 4);
    }
    @Test
    public void hasName() {
        assertEquals("Jurassic Park", park.getName());
    }
    @Test
    public void hasFunRating() {
        assertEquals(4, park.getFunRating());
    }
}
