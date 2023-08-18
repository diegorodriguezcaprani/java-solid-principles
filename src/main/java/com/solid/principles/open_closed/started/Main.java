package com.solid.principles.open_closed.started;

public class Main {
    public static void main(String[] args) {
        Cafetera cafeteraSimple = new Cafetera(Type.SIMPLE);
        cafeteraSimple.prepararCafe();

        Cafetera cafeteraConEspuma = new Cafetera(Type.ESPUMA);
        cafeteraConEspuma.prepararCafe();
    }
}

