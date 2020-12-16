package com.librarySystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the public libary");
        System.out.println("If you want to know information about library press 1 else press 2");

        Scanner response = new Scanner(System.in);
        System.out.println("Enter your response");
        Integer userResponse = response.nextInt();

        if (userResponse == 1) {
            Student student = new Student();
            student.checkLibraryClass();
        } else if (userResponse == 2) {
            Student student = new Student();
            student.getLibraryInfo();
        }
    }
}
