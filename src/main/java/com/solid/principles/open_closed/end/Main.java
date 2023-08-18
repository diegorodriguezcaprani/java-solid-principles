package com.solid.principles.open_closed.end;

public class Main {
    public static void main(String[] args) {
        Cafetera cafeteraSimple = new CafeteraSimple();
        cafeteraSimple.prepararCafe();

        Cafetera cafeteraConEspuma = new CafeteraConEspuma();
        cafeteraConEspuma.prepararCafe();
    }
}

