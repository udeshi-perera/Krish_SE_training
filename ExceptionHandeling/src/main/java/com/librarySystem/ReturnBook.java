package com.librarySystem;

public class ReturnBook {

    public void enterBookName() {
        String bookName = "Famous Five-Five on a treasure island";

        try {
            if (bookName.equals("Famous Five-Five on a treasure island")) ;
            FineCalculator fineCalculator = new FineCalculator();
            fineCalculator.calculateFine(-1);
            //fineCalculator.getInformation();
        } catch (NullPointerException nullPointerException) {
            System.out.println("The book is referencing to the null value");
        }
    }

    void getInformation() {
        FineCalculator fineCalculator = new FineCalculator();
        fineCalculator.getInformation();
    }
}
