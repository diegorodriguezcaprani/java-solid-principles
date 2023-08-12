package com.solid.principles.interface_segregation.end;

public class Tuna implements Swimmer {
    @Override
    public void swim() {
        System.out.println("I'm swimming...");
    }

}
