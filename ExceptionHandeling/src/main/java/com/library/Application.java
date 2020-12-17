package com.library;

import com.librarySystem.Student;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Welcome to the public library");
        System.out.println("If you want to know information about library press 1 else press 2");

        Scanner response = new Scanner(System.in);
        System.out.println("Enter your response");
        Integer userResponse = response.nextInt();
        try {
            if (userResponse == 1) {
                Employee employee = new Employee();
                employee.checkEmployeeInformation();

            } else if (userResponse == 2) {
                Employee employee = new Employee();
                employee.getLibraryInfo();
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            System.out.println("The file you are going to read is not exist. Please check");
        }


    }
}
