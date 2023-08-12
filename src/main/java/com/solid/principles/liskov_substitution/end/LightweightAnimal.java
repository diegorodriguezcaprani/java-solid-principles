package com.solid.principles.liskov_substitution.end;

public class LightweightAnimal extends Animal {
    protected void jump() {
        System.out.println("Jumping...");
    }

    public void jumpHole() {
        this.walk();
        this.jump();
        this.walk();
    }
}
