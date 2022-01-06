package com.example.automotores;

public class Automotores {

    private String placa;
    private String cilindraje;
    private String modelo;
    private String tipo;
    private String serie_motor;

    public Automotores(){
    }
    public void set_tipo(String eltipo) {
        this.tipo = eltipo;
    }
    public void Mostrar_Informacion(){
        System.out.println(this.tipo);
    }

}
