package com.tshepard.library;

import java.util.Calendar;

/**
 * This class describes a book object which contains the title, author, published date, publisher,
 * and whether or not it is checked out.
 *
 * @author ShepardTM
 *
 */

public class Book {

    private String title;
    private String author;
    private Calendar publishedDate;
    private String publisher;
    private boolean checkedOut;

    public Book(String title, String author, Calendar publishedDate, String publisher) {
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.publisher = publisher;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Calendar getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Calendar publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    // Method to display the checkout status of the book
    public void printStatus() {
        System.out.println(checkedOut ? title + " is already checked out."  : title + " is available.");
    }

    // toString override to display the title and checkout status
    @Override
    public String toString() {
        return "Book [title=" + title + ", checkedOut=" + checkedOut + "]";
    }
}

