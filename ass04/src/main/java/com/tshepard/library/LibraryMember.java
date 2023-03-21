package com.tshepard.library;

/**
 * Class to describe the Library users (first and last name, and the name
 * of the book they currently have checked out).
 *
 * @author ShepardTM
 *
 */
public class LibraryMember {

    private String firstName;
    private String lastName;
    private Book bookCheckedOut;

    public LibraryMember(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookCheckedOut = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Book getBookCheckedOut() {
        return bookCheckedOut;
    }

    public void setBookCheckedOut(Book bookCheckedOut) {
        this.bookCheckedOut = bookCheckedOut;
    }

    /* Method for a member to check out a book.  Note that each patron is
     * only allowed to have one book checked out at a time.
     */
    public void checkOutBook(Book book) {

        if (!book.isCheckedOut() && bookCheckedOut == null) {
            setBookCheckedOut(book);
            book.setCheckedOut(true);
            System.out.println(firstName + ", you have successfully checked out " + book.getTitle());

        } else if (book.isCheckedOut()) {
            System.out.println(firstName + ", " + book.getTitle() + " is already checked out to someone else.");

        } else {
            System.out.println(firstName + ", you already have a book checked out. Don't be greedy.");
        }

    }

}

