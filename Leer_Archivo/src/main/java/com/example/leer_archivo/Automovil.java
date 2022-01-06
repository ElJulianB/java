package com.example.leer_archivo;


public class Automovil implements Sonido {

    private String placa;
    public int cilindraje;
    int modelo;
    private String tipo;
    String servicio;
    String serie_motor;

    public void set_tipo (String eltipo){
        tipo=eltipo;
    }
    public void Mostrar_Informacion(){
        System.out.println(tipo);
    }


    @Override
    public void sonar() {
        System.out.println("El auto suena yan yan yan");
    }

    @Override
    public void pitar() {
        System.out.println("el auto pita faa faa faa");
    }
}
