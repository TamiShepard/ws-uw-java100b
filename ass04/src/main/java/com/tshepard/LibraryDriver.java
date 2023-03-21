package com.tshepard;

import java.util.Calendar;

import com.tshepard.library.Book;
import com.tshepard.library.LibraryMember;

/**
 * This system manages library members and the books the library lends,
 * and this member is the driver class.
 *
 * Assumptions:
 *
 * There will be two items in the library system to begin with: books
 * and library members. There are two rules:
 *
 * - A user can only checkout one book at a time.
 * - A book cannot be checked out when it is already checked out.
 *
 * Requirements:
 *
 * - Create at least 4 books
 * - Create at least 4 library members
 * - Attempt to checkout a book twice
 * - Have a library member checkout two or more books
 *
 * @author ShepardTM
 *
 */
public class LibraryDriver {

    public static void main(String[] args) {

        Book theLeftHandOfDarkness = new Book("The Left Hand of Darkness", "Ursula K. Le Guin", setPublishedDate(1968, 1 , 1), "Ace Books");
        Book theDispossessed = new Book("The Dispossessed", "Ursula K. Le Guin", setPublishedDate(1974, 1 , 1), "Harper and Row");
        Book parableOfTheSower = new Book("Parable of the Sower", "Octavia E. Butler", setPublishedDate(1993, 1 , 1), "Four Walls Eight Windows");
        Book parableOfTheTalents = new Book("Parable of the Talents", "Octavia E. Butler", setPublishedDate(1998, 1 , 1), "Seven Stories Press");
        Book awakeners = new Book("The Awakeners: Northshore & Southshore", "Sheri S. Tepper", setPublishedDate(1987, 2 , 1), "Tor Books");

        LibraryMember tami = new LibraryMember("Tami", "Shepard");
        LibraryMember chris = new LibraryMember("Chris", "Shepard");
        LibraryMember jazzy = new LibraryMember("Jazzy", "Shepard");
        LibraryMember sparky = new LibraryMember("Sparky", "Thecat");

        System.out.println("----------------------------------------------------------------");
        System.out.println("   Test 1: Attempt to checkout a book twice ");
        System.out.println("----------------------------------------------------------------");
        theDispossessed.printStatus();
        tami.checkOutBook(theDispossessed);
        sparky.checkOutBook(theDispossessed);
        System.out.println();


        System.out.println("----------------------------------------------------------------");
        System.out.println("   Test 2: Have one member try to checkout more than one book ");
        System.out.println("----------------------------------------------------------------");
        tami.checkOutBook(parableOfTheTalents);
        System.out.println();

        System.out.println("----------------------------------------------------------------");
        System.out.println("   Test 3: Clear warnings for unused variables ");
        System.out.println("----------------------------------------------------------------");
        chris.checkOutBook(theLeftHandOfDarkness);
        jazzy.checkOutBook(parableOfTheSower);
        sparky.checkOutBook(awakeners);
        System.out.println();
    }

    /**
     * Creates a Calendar instance with the date the book was published.
     * @param year - the year
     * @param month - the month
     * @param day - the day
     * @return Calendar instance
     */
    private static Calendar setPublishedDate(int year, int month, int day) {
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        return c;
    }
}
