package com.epam.OOP;

/**
 * In this case we see an example of implementing one of the OOP principles - inheritance.
 * Inheritance allows us to reuse the functionality of the parent class in child classes.
 * At the same time, we can expand this functionality by overriding the parent method.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Dog().getDescription());
        System.out.println(new Bird().getDescription());
    }
}
