package com.librarySystem;

public class Student {

    void checkLibraryClass() {

        String libraryPackage = "com.librarySystem.Book";

        try {
            Class.forName(libraryPackage);
            Book book = new Book();
            book.enterBookName();
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("The class is not found. Please check again.");
        }
    }

    void getLibraryInfo() {
        Book book = new Book();
        book.getInformation();
    }

}
