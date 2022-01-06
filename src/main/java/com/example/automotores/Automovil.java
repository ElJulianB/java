package com.example.automotores;

public class Automovil extends Automotores implements Sonido{
    public Automovil() {
    }

    @Override
    public void pitar() {
        System.out.println("El Automovil pita faaa faaa faaa");
    }

    @Override
    public void sonar() {
        System.out.println("y suena yan yan yan");
    }
}
