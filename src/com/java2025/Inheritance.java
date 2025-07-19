package com.java2025;

class Person {
    String name;
    int age;

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

class Employee extends Person {
    String department;

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

public class Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee("Sita", 28, "Finance");
        emp.displayEmployeeInfo();
    }
}