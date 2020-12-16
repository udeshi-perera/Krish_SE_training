package com.librarySystem;

public class BorrowBook extends Student {
    public void getNumberOfBorrowId() {

        try {
            int borrowId[] = {1045, 3089, 6337, 4900};
            ReturnBook returnBook = new ReturnBook();
            returnBook.enterBookName();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist. Please make sure that index is valid.");
        }
    }

    void getInfor() {
        ReturnBook returnBook = new ReturnBook();
        returnBook.getInformation();
    }
}
