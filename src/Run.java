package com.java2025;
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass (Child class) inheriting from Animal
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); // Calling the superclass constructor
    }

    // Overriding the sound method (Method Overriding)
    @Override
    public void sound() {
        System.out.println(name + " barks");
    }

    // Additional method specific to Dog class
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}

public class Run {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5);
        dog.displayDetails();   // Reusing the displayDetails method from Animal class
        dog.sound();            // Overridden method in Dog class
        dog.fetch();            // Accessing method specific to Dog class
    }
}

