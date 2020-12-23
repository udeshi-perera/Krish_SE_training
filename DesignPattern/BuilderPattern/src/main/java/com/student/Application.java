package com.student;

public class Application {
    public static void main(String[] args) {

        Student.Builder studentBuilder=new Student.Builder("John");
        Student student=studentBuilder.currentCity("LA").degreeName("Computer Science").build();
        System.out.println(student);
    }
}
