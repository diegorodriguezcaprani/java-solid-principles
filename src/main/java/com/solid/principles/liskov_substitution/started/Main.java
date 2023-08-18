package com.solid.principles.liskov_substitution.started;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.jumpHole();

        Animal elephant = new Elephant();
        elephant.jumpHole();
    }
}
