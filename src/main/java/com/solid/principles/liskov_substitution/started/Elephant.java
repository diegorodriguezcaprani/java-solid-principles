package com.solid.principles.liskov_substitution.started;

public class Elephant extends Animal {
    @Override
    public void jump() {
        throw new UnsupportedOperationException("No jump support!!");
    }
}
