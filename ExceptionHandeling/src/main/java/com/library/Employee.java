package com.library;

import java.io.FileNotFoundException;

public class Employee {

    void checkEmployeeInformation() throws ClassNotFoundException {

        String libraryPackage = "com.library.Book";

        try {
            Class.forName(libraryPackage);
            Book book = new Book();
            book.enterBookName();
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("The class is not found. Please check again.");
        }
    }

    public void getLibraryInfo() throws FileNotFoundException {
        Book book = new Book();
        book.getInformation();
    }
}
