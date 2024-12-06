package coordinateguessinggame;

/* Helper Class: Point
 * ***************************
 * Represents a coordinate on the grid. Leverage the provided functionality.
 * 
 * You just need to implement .equals, which can be used to check if 2 point objects 
 * represent the same coordinate.
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    } 

    public int getY() {
        return y;
    }

    public String toString() {
        return "("+ x + ", " + y + ")";
    }

    /* TODO: Override: equals
     * *************************************************
     * Override for the Object.equals method. The signature should match Object.equals!
     * Returns true if the x and y coordinates are the same as the one passed in.
     * Should check to make sure point is a Point object and return false if it is not.
     */
 


}
