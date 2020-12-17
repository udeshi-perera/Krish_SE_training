package com.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Fine {

    public int calculateFine(int numberOfDays) {

        if (numberOfDays < 0) {
            throw new ArithmeticException("Enter a valid number of days.");
        }
        return 50 * numberOfDays;
    }

    public void getInformation() {


        File libraryFileInfo = new File("C:\\libarary.txt");

        try {
            FileInputStream fileInputStream = new FileInputStream(libraryFileInfo);
            throw new FileNotFoundException("Enter path correctly");
        } catch (FileNotFoundException e) {
            System.out.println("Eneter path correctly");
        }

    }
}
