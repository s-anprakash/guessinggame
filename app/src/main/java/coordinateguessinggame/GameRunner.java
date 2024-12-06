package coordinateguessinggame;

import java.util.Scanner;

/*****************
 * GameRunner: Runs the game. You do not need to edit this file.
 *****************/ 

public class GameRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highScore = -1;

        System.out.println("Welcome to the Coordinate Guessing Game!\n");
        while(true) {
            CoordGuessGame game = new CoordGuessGame();
            playGame(game, scanner);

            highScore = CoordGuessGame.getBestScore();
            if (highScore != CoordGuessGame.MAX_GUESSES+1) {
                System.out.println("Current Best Score: " + highScore);
            }
            System.out.println("Do you want to play again?");
            String input = scanner.nextLine();

            if (input.equals("n")) {
                break;
            }
        }
    
    }

    private static void playGame(CoordGuessGame game, Scanner scanner) {

       while(!game.getGameOver()) {
            System.out.println("You have "+ game.getTurnsRemaining() + " guess(es) left.\n");
            System.out.println("Guess a coordinate: ");
            int x = promptForInt(scanner,"X");
            int y = promptForInt(scanner, "Y");
            
            String result = game.submitGuess(x, y);

            System.out.println(result+"\n");

            
                       
        }

    }

    private static int promptForInt(Scanner scanner, String xOrY) {
        System.out.print(xOrY + " coordinate: ");
        int i = scanner.nextInt();
        scanner.nextLine();

        return i;
    }
}