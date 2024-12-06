package coordinateguessinggame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTests {
    @Test
    public void testEquals_TestCoordinates() {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(3, 5);
        assertTrue(point1.equals(point2), "Points with the same coordinates should be equal.");

        point1 = new Point(3, 5);
        point2 = new Point(4, 6);
        assertFalse(point1.equals(point2), "Points with different coordinates should not be equal.");
    }

    @Test
    public void testEquals_DifferentType() {
        Point point1 = new Point(3, 5);
        String otherObject = "Not a Point";
        assertFalse(point1.equals(otherObject), "Point should not be equal to an object of a different type.");
    }
}
