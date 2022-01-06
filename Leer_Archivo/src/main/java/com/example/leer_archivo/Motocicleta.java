package com.example.leer_archivo;

public class Motocicleta implements Sonido {

    private String placa;
    public int cilindraje;
    int modelo;
    private String tipo;
    String servicio;
    String serie_motor;

    public void set_tipo(String eltipo) {
        tipo = eltipo;
    }

    public void Mostrar_Informacion() {
        System.out.println(tipo);
    }


    @Override
    public void sonar() {
        System.out.println("La moto suena run run run");
    }

    @Override
    public void pitar() {
        System.out.println("La moto pita pii pii pii");
    }
}