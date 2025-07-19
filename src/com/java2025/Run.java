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

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); 
    }

    @Override
    public void sound() {
        System.out.println(name + " barks");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}

public class Run {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5);
        dog.displayDetails();   
        dog.sound();            
        dog.fetch();          
    }
}

