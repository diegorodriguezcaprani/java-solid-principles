package com.solid.principles.liskov_substitution.started;

public class Animal {
    protected void jump() {
        System.out.println("Jumping...");
    }
    protected void walk() {
        System.out.println("Walking...");
    }

    public void jumpHole() {
        this.walk();
        this.jump();
        this.walk();
    }
}
