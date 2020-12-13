package com.company;

public class User {
    int age;
    String firstName, lastname;
    //Конструктор
    public User(int age, String firstName, String lastname) {
        this.age=age;
        this.firstName=firstName;
        this.lastname=lastname;
    }
}
public class Student extends User {
    int group;

    public Student(int age, String firstName, String lastname) {
        super(age, firstName, lastname);
    }
    boolean isMyGroup(int g) {
        return g==group;
    }
}