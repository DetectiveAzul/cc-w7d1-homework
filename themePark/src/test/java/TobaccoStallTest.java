import stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;
import persons.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {
    private TobaccoStall tobacco;
    private Visitor visitor00;
    private Visitor visitor01;

    @Before
    public void before() {
        tobacco = new TobaccoStall("Tobacco Paradise","Jonathan", "AB14", 1, 5);
        visitor00 = new Visitor("Jaime", 29, 1.70, 35, false);
        visitor01 = new Visitor("John", 14, 1.45, 10, false);
    }
    @Test
    public void hasName() {
        assertEquals("Tobacco Paradise", tobacco.getName());
    }
    @Test
    public void hasFunRating() {
        assertEquals(3, tobacco.getFunRating());
    }
    @Test
    public void canBuy() {
        assertTrue(tobacco.isAllowedTo(visitor00));
    }
    @Test
    public void cannotBuy() {
        assertFalse(tobacco.isAllowedTo(visitor01));
    }
    @Test
    public void hasPrice() {
        assertEquals(5, tobacco.priceFor(visitor00), 0);
    }
}
