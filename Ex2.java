import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionTest {

    @Test
    void testAssertions() {

        assertEquals(10,5+5);

        assertNotEquals(5,5+5);

        assertTrue(20>10);

        assertFalse(10>20);

        assertNull(null);

        assertNotNull("JUnit");
    }
}