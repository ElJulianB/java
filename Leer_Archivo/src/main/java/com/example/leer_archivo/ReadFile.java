package com.example.leer_archivo;
import java.io.File;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("/Users/julian/Documents/DB_AUTOS.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String [] datos= line.split(",");
                String tipo= datos[3];
                //System.out.println(tipo);
                Automovil automovil= new Automovil();
                Motocicleta motocicleta= new Motocicleta();

                if (tipo.equals("MOTOCICLETA")) {
                    motocicleta.set_tipo(tipo);
                    motocicleta.Mostrar_Informacion();
                    motocicleta.pitar();
                    motocicleta.sonar();
                } else {
                    automovil.set_tipo(tipo);
                    automovil.Mostrar_Informacion();
                    automovil.pitar();
                    automovil.sonar();
                }

                //System.out.println(automovil.placa);
                //System.out.println(line);
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}