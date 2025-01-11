package com.samsung;

//public class Person {
//    private String name;
//
//    // Constructor
//    public Person(String name) {
//        this.name = name;
//    }
//
//    // Getter for name
//    public String getName() {
//        return name;
//    }
//}


public class Person {
    private String firstName;
    private String lastName;

    // Default Constructor
    public Person() {
    }

    // Parameterized Constructor
    public Person(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}