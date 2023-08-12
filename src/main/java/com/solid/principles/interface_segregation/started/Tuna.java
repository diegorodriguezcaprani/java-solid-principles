package com.solid.principles.interface_segregation.started;

public class Tuna implements Animal {
    @Override
    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("I can't flying!!!");
    }
}
