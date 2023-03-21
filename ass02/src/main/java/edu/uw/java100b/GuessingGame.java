package edu.uw.java100b;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    /**
     * A random number generator method
     * @return a random integer between 0 and 100
     */
    public static int getRandomNum() {
        int min = 0;
        int max = 100;
        System.out.println("Guess a number between " + min + " and " + max);
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

    /**
     * A guessing game where the user tries to guess a random number,
     * until they get the correct one. They will also be prompted after
     * a win if they would like to play again.
     * @author thugf
     * @param args - none
     */
    public static void main(String[] args) {

        char continuePlaying = 'y';

        // Outermost loop to check if user would like to continue playing.
        while (continuePlaying == 'y') {
            int num = getRandomNum();
            Scanner in = new Scanner(System.in);
            int guess = in.nextInt();
            boolean win = false;
            int numGuesses = 1;

            // Secondary loop to keep prompting the user until they can guess the number
            while (!win) {
                if (guess == num) {
                    win = true;
                    System.out.println("Congrats! You won in " + numGuesses + " guesses!");
                } else if (guess < num) {
                    System.out.println("Too low. Guess again.");
                    guess = in.nextInt();
                } else {
                    System.out.println("Too high. Guess again.");
                    guess = in.nextInt();
                }
                numGuesses++;
            }
            // Check to see if they want to play again, and if not, close the scanner
            System.out.println("Play again? (y/n)");
            continuePlaying = in.next().charAt(0);
            if (continuePlaying == 'n') {
                in.close();
            }
        }
        System.out.println("Thank you for playing the Guessing Game.");
    }
}