package colegio;

import java.util.Scanner;

public class Administrativo extends Empleado {

    public Administrativo(String nombre, String sexo) {
        super(nombre, sexo);
    }

    public Administrativo(String nombre, int edad, String direccion, double sueldobase, int servicio, String sexo) {
        super(nombre, edad, direccion, sueldobase, servicio, sexo);
    }

    @Override
    public double getSueldofinal() {
        return sueldobase * Constantes.PORCENTAJE_ADMIN;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void crear() {
        super.crear(); 
    }

    public void crearsimple() {
        super.crearsimple();
    }

}
