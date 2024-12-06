package coordinateguessinggame;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CoordGuessGameTests {

    @Test
    void testConstructorWithRandomTarget() {
        CoordGuessGame game = new CoordGuessGame();
        assertNotNull(game);
        assertNotNull(game.getTurnsRemaining());
    }

    @Test
    void testConstructorWithSpecificTarget() {
        CoordGuessGame game = new CoordGuessGame(3, -2);
        assertEquals(6, game.getTurnsRemaining());
        assertFalse(game.getGameOver());
    }

    @Test
    void testSubmitGuessWin() {
        CoordGuessGame game = new CoordGuessGame(3, -2);
        String result = game.submitGuess(3, -2);
        assertEquals("You win!", result);
        assertTrue(game.getGameOver());
    }

    @Test
    void testSubmitGuessRepeat() {
        CoordGuessGame game = new CoordGuessGame(3, -2);
        game.submitGuess(1, 1);
        String result = game.submitGuess(1, 1);
        assertEquals("You already guessed that!", result);
    }

    @Test
    void testSubmitGuessLose() {
        CoordGuessGame game = new CoordGuessGame(3, -2);
        for (int i = 0; i < 5; i++) {
            game.submitGuess(i, i);
        }
        String result = game.submitGuess(-5, -5);
        assertEquals("You lose.", result);
        assertTrue(game.getGameOver());
    }

    void testIsRepeatedGuess() {
        CoordGuessGame game = new CoordGuessGame(3, -2);
        game.submitGuess(1, 1);
        game.submitGuess(2, 2);

        // Directly call isRepeatedGuess
        assertTrue(game.isRepeatedGuess(new Point(1, 1)));
        assertFalse(game.isRepeatedGuess(new Point(3, -2)));
    }

    @Test
    void testQuadrantClue() {
        CoordGuessGame game = new CoordGuessGame(3, -2);
        assertEquals("The target has an x >= 0 and y < 0.", game.quadrantClue());

        game = new CoordGuessGame(-3, -2);
        assertEquals("The target has an x < 0 and y < 0.", game.quadrantClue());

        game = new CoordGuessGame(-3, 2);
        assertEquals("The target has an x < 0 and y >= 0.", game.quadrantClue());

        game = new CoordGuessGame(3, 2);
        assertEquals("The target has an x >= 0 and y >= 0.", game.quadrantClue());
    }

    @Test
    void testCloserOrFartherClue() {
        CoordGuessGame game = new CoordGuessGame(5, 5);
        game.submitGuess(0, 0); // First guess
        Point currentGuess = new Point(3, 3); // Closer to target
        assertEquals("You're getting closer to the target!", game.closerOrFartherClue(currentGuess));

        game.submitGuess(3, 3); // Second guess
        currentGuess = new Point(1, 1); // Farther from target
        assertEquals("You're farther than your last guess.", game.closerOrFartherClue(currentGuess));
    }

    @Test
    void testMidpointClue() {
        CoordGuessGame game = new CoordGuessGame(6, 8);
        Point guess = new Point(2, 4);
        assertEquals("The midpoint between your guess and the target is around (4, 6).", game.midpointClue(guess));

        guess = new Point(0, 0);
        assertEquals("The midpoint between your guess and the target is around (3, 4).", game.midpointClue(guess));
    }

    @Test
    void testDirectionClue() {
        CoordGuessGame game = new CoordGuessGame(3, -2);

        Point guess = new Point(0, 0);
        assertEquals("Your x is too low. Your y is too high.", game.directionClue(guess));

        guess = new Point(3, 0);
        assertEquals("Your x is correct. Your y is too high.", game.directionClue(guess));

        guess = new Point(5, -2);
        assertEquals("Your x is too high. Your y is correct.", game.directionClue(guess));
    }

    @Test
    void testXDistanceClue() {
        CoordGuessGame game = new CoordGuessGame(4, 4);

        Point guess = new Point(2, 5);
        assertEquals("Your x is 2 from your target.", game.xDistanceClue(guess));

        guess = new Point(4, 5);
        assertEquals("Your x is 0 from your target.", game.xDistanceClue(guess));
    }

    @Test
    void testBestScoreTracking() {
        CoordGuessGame game1 = new CoordGuessGame(1, 1);
        game1.submitGuess(1, 1); // Win on first guess
        assertEquals(1, CoordGuessGame.getBestScore());

        CoordGuessGame game2 = new CoordGuessGame(2, 2);
        game2.submitGuess(0, 0);
        game2.submitGuess(2, 2); // Win on second guess
        assertEquals(1, CoordGuessGame.getBestScore()); // Best score remains 1
    }
}
