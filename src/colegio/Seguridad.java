package colegio;

import java.util.Scanner;

public class Seguridad extends Empleado {
    protected boolean jefe;
    protected boolean noche;
    protected String aux;
    protected String aux2;

    public Seguridad() {
        this.jefe = (Boolean) null;
        this.noche = (Boolean) null;
    }

    public Seguridad(String nombre, String sexo) {
        super(nombre, sexo);
        this.jefe = false;
        this.noche = false;
    }

    public Seguridad(boolean jefe, boolean noche, String nombre, int edad, String direccion, double sueldobase,
            int servicio, String sexo) {
        super(nombre, edad, direccion, sueldobase, servicio, sexo);
        this.jefe = jefe;
        this.noche = noche;
    }

    public Seguridad(boolean jefe, boolean noche, String nombre, String sexo) {
        super(nombre, sexo);
        this.jefe = jefe;
        this.noche = noche;
    }

    public void setJefe(boolean jefe) {
        this.jefe = jefe;
    }

    public void setNoche(boolean noche) {
        this.noche = noche;
    }

    public boolean isJefe() {
        return jefe;
    }

    public boolean isNoche() {
        return noche;
    }

    @Override
    public double getSueldofinal() {
        if (noche) {
            return sueldobase * Constantes.PORCENTAJE_NOCHE;
        } else {
            return sueldobase;
        }
    }

    @Override
    public String toString() {

        return super.toString() + "\nTrabaja en la noche?: " + isNoche() + "\nEs jefe?: " + isJefe();

    }

    public void crear() {
        Scanner sc = new Scanner(System.in);
        super.crear();
        sc.nextLine();

        System.out.println("El empleado trabaja en el turno nocturno? (true/false): ");
        String aux = sc.nextLine();
        noche = Boolean.parseBoolean(aux);

        System.out.println("El empleado tiene el rango de jefe? (true/false): ");
        String aux2 = sc.nextLine();
        jefe = Boolean.parseBoolean(aux2);

     /*    System.out.println("Tiene el turno nocturno?: ");
        aux = sc.nextLine();
        if (aux.equals("si")) {
            noche = true;
        }

        System.out.println("El empleado tiene el rango de jefe?: ");
        aux = sc.nextLine();
        if (aux.equals("si")) {
            jefe = true;
        } */

    }

    public void crearsimple() {
        Scanner sc = new Scanner(System.in);
        super.crearsimple();
        System.out.println("El empleado trabaja en la noche?: ");
        aux = sc.nextLine();
        if (aux.equals("si")) {
            noche = true;
        }
        System.out.println("El empleado tiene el rango de jefe?: ");
        aux = sc.nextLine();
        if (aux.equals("si")) {
            jefe = true;
        }

    }

}
