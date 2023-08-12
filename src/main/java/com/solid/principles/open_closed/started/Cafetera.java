package com.solid.principles.open_closed.started;

public class Cafetera {
    private Type type;

    public Cafetera(Type type) {
        this.type = type;
    }

    public void draw() {
        switch (this.type) {
            case SIMPLE:
                prepararCafeSimple();
                break;
            case ESPUMA:
                prepararCafeConEspuma();
                break;
        }
    }

    private void prepararCafeConEspuma() {
        System.out.println("Preparando Cafe con Espuma");
    }

    private void prepararCafeSimple() {
        System.out.println("Preparando Cafe Simple");
    }
}
