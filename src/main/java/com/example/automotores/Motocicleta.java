package com.example.automotores;

public class Motocicleta extends Automotores implements Sonido {

    public Motocicleta() {
    }

    @Override
    public void pitar() {
        System.out.println("La Motocicleta pita piii piii piii");
    }

    @Override
    public void sonar() {
        System.out.println("y suena run run");
    }
}
