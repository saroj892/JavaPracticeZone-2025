package com.java2025;

import java.util.Scanner;

class Calc {
    int a, b;
    Scanner scanner = new Scanner(System.in);

    void input() {
        System.out.print("Input first number: ");
        a = scanner.nextInt();

        System.out.print("Input second number: ");
        b = scanner.nextInt();
    }

    void add() {
        System.out.println("Addition is: " + (a + b));
    }
}


class Calcu extends Calc {
    void sub() {
        System.out.println("Subtraction is: " + (a - b));
    }
}

public class Calculation {
    public static void main(String[] args) {
        Calcu c = new Calcu();
        c.input();  // Call input once
        c.add();
        c.sub();
    }
}