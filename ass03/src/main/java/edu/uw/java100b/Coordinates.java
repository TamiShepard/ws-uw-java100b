package edu.uw.java100b;

import java.util.Objects;
import java.util.Scanner;

/**
 * Assignment 2: Coordinates.
 *
 * This program will display the X and Y coordinates based off of
 * inputs entered into the console. The program will calculate the
 * coordinate based on the directional commands provided: u-up, d-down,
 * l-left, and r-right.
 *
 * Lowercase and uppercase letters will be accepted. Numbers will also
 * be accepted. Any other letters or characters should be ignored. Up
 * and Down commands will change the y-values and Left and Right commands
 * will change the x-values. A number preceding a letter will represent
 * the number of commands for that direction.
 *
 * @author ShepardTM
 *
 */
public class Coordinates {

    static String strMultiples = "";

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        String str = getUserInput();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                strMultiples += str.charAt(i);

            } else if (str.toLowerCase().charAt(i) == 'r') {
                x = (Objects.equals(strMultiples, "")) ? (x + 1) : multipleRights(x);

            } else if (str.toLowerCase().charAt(i) == 'l') {
                x = (Objects.equals(strMultiples, "")) ? (x - 1) : multipleLefts(x);

            } else if (str.toLowerCase().charAt(i) == 'u') {
                y = (Objects.equals(strMultiples, "")) ? (y + 1) : multipleUps(y);

            } else if (str.toLowerCase().charAt(i) == 'd') {
                y = (Objects.equals(strMultiples, "")) ? (y - 1) : multipleDowns(y);

            } else {
                strMultiples = "";
            }
        }
        System.out.println("Coordinates are (" + x + "," + y + ")");
    }

    /**
     * Calculate the y-coordinate when the desire is to move down multiple times
     * @param y-coordinate
     * @return new y-coordinate
     */
    private static int multipleDowns(int y) {
        y -= Integer.parseInt(strMultiples);
        strMultiples = "";
        return y;
    }

    /**
     * Calculate the y-coordinate when the desire is to move up multiple times
     * @param y-coordinate
     * @return new y-coordinate
     */
    private static int multipleUps(int y) {
        y += Integer.parseInt(strMultiples);
        strMultiples = "";
        return y;
    }

    /**
     * Calculate the x-coordinate when the desire is to move left multiple times
     * @param x-coordinate
     * @return new x-coordinate
     */
    private static int multipleLefts(int x) {
        x -= Integer.parseInt(strMultiples);
        strMultiples = "";
        return x;
    }

    /**
     * Calculate the x-coordinate when the desire is to move right multiple times
     * @param x-coordinate
     * @return new x-coordinate
     */
    private static int multipleRights(int x) {
        x += Integer.parseInt(strMultiples);
        strMultiples = "";
        return x;
    }

    /**
     * Collect user input from the screen
     * @return String containing the entire line the user entered
     */
    private static String getUserInput() {
        System.out.println("Please enter directional commands (r, l, u, d): ");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        in.close();
        return userInput;
    }

}
