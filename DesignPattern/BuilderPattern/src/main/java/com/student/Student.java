package com.student;

public class Student {
    private final String studentName;
    private final Boolean libraryMembership;
    private final String degreeName;
    private final String currentCity;

    public Student(Builder builder){
        this.studentName=builder.studentName;
        this.libraryMembership=builder.libraryMembership;
        this.degreeName=builder.degreeName;
        this.currentCity=builder.currentCity;
    }

    static class Builder {
        private String studentName;
        private Boolean libraryMembership;
        private String degreeName;
        private String currentCity;

        public Student build(){
            return new Student(this);
        }

        public Builder(String studentName) {
            this.studentName = studentName;
        }

        public Builder libraryMembership(Boolean libraryMembership) {
            this.libraryMembership = libraryMembership;
            return this;
        }

        public Builder degreeName(String degreeName) {
            this.degreeName = degreeName;
            return this;
        }

        public Builder currentCity(String currentCity) {
            this.currentCity = currentCity;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", libraryMembership=" + libraryMembership +
                ", degreeName='" + degreeName + '\'' +
                ", currentCity='" + currentCity + '\'' +
                '}';
    }
}
