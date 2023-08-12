package com.solid.principles.open_closed.end;

public class CafeteraConEspuma implements Cafetera {
    @Override
    public void prepararCafe() {
        System.out.println("Preparando Cafe en CafeteraConEspuma");
    }
}
