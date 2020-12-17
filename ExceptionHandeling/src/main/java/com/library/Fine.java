package com.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Fine {

    public int calculateFine(int numberOfDays) {
        try {
            if (numberOfDays < 0) ;
        } catch (ArithmeticException arithmeticException) {
            throw new ArithmeticException("Enter a valid number of days.");
        }
        return 50 * numberOfDays;
    }

    public void getInformation() throws FileNotFoundException {

        File libraryFileInfo = new File("C:\\library.txt");
        FileInputStream fileInputStream = new FileInputStream(libraryFileInfo);

    }
}
