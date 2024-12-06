package coordinateguessinggame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameMathTests {



    @Test
    public void testEuclideanDistance_PositiveZeroCoordinates() {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        double distance = GameMath.euclideanDistance(p1, p2);
        assertEquals(0.0, distance, 0.0001, "Distance between identical points should be 0.");

        p1 = new Point(1, 1);
        p2 = new Point(4, 5);
        distance = GameMath.euclideanDistance(p1, p2);
        assertEquals(5.0, distance, 0.0001, "Distance between (1,1) and (4,5) should be 5.0.");
    }

    @Test
    public void testEuclideanDistance_NegativeCoordinates() {
        Point p1 = new Point(-3, -4);
        Point p2 = new Point(0, 0);
        double distance = GameMath.euclideanDistance(p1, p2);
        assertEquals(5.0, distance, 0.0001, "Distance between (-3,-4) and (0,0) should be 5.0.");
    }

    @Test
    public void testRandomIntInRange_WithinRange() {
       
    }

    @Test
    public void testRandomIntInRange_MinEqualsMax() {
        int min = 5;
        int max = 5;
        int random = GameMath.randomIntInRange(min, max);
        assertEquals(5, random, "Random number should equal the min and max when they are the same.");
    }

    @Test
    public void testRandomIntInRange_NegativeRange() {
        int min = 1;
        int max = 10;
        for (int i = 0; i < 100; i++) { // Test multiple times to ensure consistency
            int random = GameMath.randomIntInRange(min, max);
            assertTrue(random >= min && random <= max, "Random number should be within the range [1, 10].");
        }

        min = -10;
        max = -5;
        for (int i = 0; i < 100; i++) { // Test multiple times to ensure consistency
            int random = GameMath.randomIntInRange(min, max);
            assertTrue(random >= min && random <= max, "Random number should be within the range [-10, -5].");
        }

        min = -5;
        max = 5;
        for (int i = 0; i < 100; i++) { // Test multiple times to ensure consistency
            int random = GameMath.randomIntInRange(min, max);
            assertTrue(random >= min && random <= max, "Random number should be within the range [-5, 5].");
        }
    }
}
