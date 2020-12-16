package com.librarySystem;

public class Student {

    void checkLibraryClass() {

        String libraryPackage = "com.librarySystem.BorrowBook";

        try {
            Class.forName(libraryPackage);
            BorrowBook borrowBook = new BorrowBook();
            borrowBook.getNumberOfBorrowId();
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("The class is not found. Please check again.");
        }
    }

    void getLibraryInfo() {
        BorrowBook borrowBook = new BorrowBook();
        borrowBook.getInfor();
    }

}
