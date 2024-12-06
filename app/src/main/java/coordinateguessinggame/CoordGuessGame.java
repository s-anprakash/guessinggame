package coordinateguessinggame;

/********************************************************
 * Class: CoordGuessGame
 * ******************************************************
 * This class is responsible for managing a round of the game from start to finish. 
 * The comments are required variables and methods that must be implemented; however, you can add
 * any other variables or methods you wish to help with your code.
 ********************************************************/
public class CoordGuessGame {

    /* TODO: PUBLIC constants for MAX_GUESSES (set to 6), MAX_COORD_VAL(set to 5; x and y values should 
    range from -MAX_COORD_VAL to MAX_COORD_VAL)  */
    

    /* TODO: private static variable for the best score (fewest number of guesses)
     * Set to MAX_GUESSES +1 to start
     */
    

    /* TODO: Instance Variables - Add whatever variables you need. Suggested variables:
        - An array of Point objects to track guess history
        - A Point for the target coordinate they are trying to guess
        - Something to track what guess you are on
        - Something to track whether the game is over
    */


    
    /* TODO: Constructor
     * *************************************************
     * Constructs a new game with a random coordinate whose absolute value for x and y are <= MAX_COORD_VAL.
     * Use the static method you implemented in GameMath!
     */
    public CoordGuessGame() {
        //Reminder: You can call the other constructor with the this keyword, e.g.: 
        //this(..., ...)

    }

    /* TODO: Constructor
     * *************************************************
     * Parameters: int x, y indicate the target coordinate. This will be used for the test cases.
     * Initialize all instance variables. 
     */
    public CoordGuessGame(int targetX, int targetY) {
 
    }

    /* TODO: Method: submitGuess
     * *************************************************
     * Processes a guess submitted by the user by determining whether it's a valid guess,  
     * updating game state, and generating random clues. Call the private helper functions below as needed and
     * leverage the static functions you implemented in the GameMath class:).
     * 
     * Parameters: int guessX, guessY (the guessed coordinates)
     * return - String - a string that explains the result of the guess, or a clue for the user.
     *  
     * The following messages should be returned in various situations. (When checking, make sure 
     * you put the most specific conditional branch first!):
     * 
     * 1) The target is guessed: "You win!"
     *      -Update the best score static variable if the # of guesses is less than the current best score.
     *      -Make any modifications needed for getGameOver to return true.
     * 2) The guess is a repeat of any previous guess: "You already guessed that!"
     *      -Use the .equals method on Point to compare the guess to previous guesses.
     *      -Do not count the guess toward used guesses or add the guess to the history.
     * 3) The max number of guesses is reached with this turn, but the guess is incorrect: "You lose."
     *      -Make any modifications needed for getGameOver to return true
     * 
     * Otherwise, add the guess to the history of the game, and count the guess toward the total guesses. 
     *      -If there is are no guesses in the history, return the quadrant clue. 
     *      -If there is more than 1 guess, randomly pick one of the other clues to return and call that function
     */
    public String submitGuess(int guessX, int guessY) {


    }

    

    /* TODO: Static method: int getBestScore()
     * *************************************************
     * Returns the static variable that represents the best score
     */
    public static int getBestScore() {
       
        return 0;//Placeholder; replace this with the actual best score
    }

    /* TODO: Static method: int getBestScore()
     * *************************************************
     * Returns true if the game is over and false otherwise
     */
    public boolean getGameOver() {
        
        return true; //Placeholder; replace this with an actual reflection of the game state
    }

    /* TODO: Method: getTurnsRemaining 
     * **********************************
     * Returns the number of turns remaining in the game.
     */
    public int getTurnsRemaining() {
        return 0; //Placeholder; replace this with the actual number of turns remaining
    }


    /*******************************
     * Helper methods
     *******************************/
    /* TODO: Helper Method: String quadrantClue()
     * *************************************************
     * Returns a string describing which coordinate grid quadrant range your target is in:
     * "The target has an x >= 0 and y >= 0."
     * "The target has an x < 0 and y >= 0."
     * "The target has an x < 0 and y < 0."
     * "The target has an x >= 0 and y < 0."
     */
    public String quadrantClue() {
      
      
    }


    /* TODO: Helper Method: String closerOrFartherClue()
     * *************************************************
     * Compare the distance of the current guess to the target with the distance of the last guess to target
     * and return these strings:
     *  
     * Closer case: "You're getting closer to the target!"
     * Farther case: "You're farther than your last guess."
     * 
     * Precondition: There has already been at least 1 guess. You should not be calling this unless that is the case!
     */
    public String closerOrFartherClue(Point guess) {

      
    }


    /* TODO: Helper Method: String midpointClue()
     * *************************************************
     * Calculates the midpoint between your guess and the target, rounds to the nearest integer
     * point, and returns a String containing the midpoint. 
     * 
     * Remember that you can round by adding .5 to a positive number/subtracting .5 from a negative 
     * number, then truncating. (this concept is in the AP exam framework, so practice this
     * instead of using math.round...)
     * 
     * e.g.: 
     * "The midpoint between your guess and the target is around (3, 7)."
     */
    public String midpointClue(Point guess) {
        
    
    }


    /* TODO: Helper Method: String directionClue()
     * *************************************************
     * Directional feedback about whether x and y are too big or small, e.g.
     * "Your x is too high. Your y is too low."
     * 
     * If one of the coordinates is exact, replace the "too high/low" clause with "correct". 
     * e.g. "Your x is correct. Your y is too low." 
     */
    public String directionClue(Point guess) {
        
    }

    /* TODO: Helper Method: xDistanceClue()
     * *************************************************
     * Returns the absolute value of the difference between the x of the target and the x
     * of the guess.
     * Use Math.abs to calculate the correct value.
     * 
     * e.g. "Your x is 2 away from your target." 
     */
    public String xDistanceClue(Point p) {
        
    }
    
}
