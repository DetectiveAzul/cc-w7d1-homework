import org.junit.Before;
import org.junit.Test;
import persons.Visitor;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    private Visitor visitor;
    @Before
    public void before() {
        visitor = new Visitor( "Jaime", 29, 1.70, 35, false);
    }
    @Test
    public void hasName() {
        assertEquals("Jaime", visitor.getName());
    }
    @Test
    public void hasAge() {
        assertEquals(29, visitor.getAge());
    }
    @Test
    public void hasHeight() {
        assertEquals(1.70, visitor.getHeight(),0);
    }
    @Test
    public void hasMoney() {
        assertEquals(35, visitor.getMoney(),0);
    }
    @Test
    public void canLoseMoney() {
        visitor.setMoney(5);
        assertEquals(5, visitor.getMoney(), 0);
    }

    @Test
    public void canIncreaseMoney() {
        visitor.changeMoney(10);
        assertEquals(45, visitor.getMoney(),0);
    }

    @Test
    public void canDecreaseMoney() {
        visitor.changeMoney(-10);
        assertEquals(25, visitor.getMoney(),0);
    }
}
