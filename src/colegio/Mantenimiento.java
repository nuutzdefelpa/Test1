package colegio;

import java.util.Scanner;

public class Mantenimiento extends Empleado{

    public Mantenimiento(String nombre, String sexo) {
        super(nombre,sexo);
    }
    public Mantenimiento(String nombre, int edad, String direccion, double sueldobase, int servicio, String sexo) {
        super(nombre,edad,direccion,sueldobase,servicio,sexo);
    }
    @Override
    public double getSueldofinal(){
        return sueldobase;
    }

    @Override
    public String toString(){
        return super.toString();

    }

    public void crear() {
//        Scanner sc = new Scanner(System.in);
        super.crear();
    }

    public void crearsimple() {
        super.crearsimple();
    }




}
