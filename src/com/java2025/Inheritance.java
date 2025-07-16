package com.java2025;

// Superclass
class Person {
    String name;
    int age;

    // Superclass constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called.");
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass
class Employee extends Person {
    String department;

    // Subclass constructor that reuses the superclass constructor
    Employee(String name, int age, String department) {
        super(name, age); // Call to superclass constructor
        this.department = department;
        System.out.println("Employee constructor called.");
    }

    void displayEmployeeInfo() {
        displayPersonInfo(); // Call to superclass method
        System.out.println("Department: " + department);
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee("Sita", 28, "Finance");
        emp.displayEmployeeInfo();
    }
}