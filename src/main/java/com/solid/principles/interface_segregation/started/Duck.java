package com.solid.principles.interface_segregation.started;

public class Duck implements Animal {
    @Override
    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying...");
    }

    public void quack() {
        System.out.println("I'm quacking..");
    }
}
