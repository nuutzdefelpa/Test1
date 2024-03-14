package colegio;

import java.util.Scanner;

public class Profesor extends Empleado {
    protected String titulo;
    protected int alumnos;

    public Profesor(String nombre, String sexo) {
        super(nombre, sexo);
        this.titulo = "";
        this.alumnos = 0;
    }

    public Profesor(String titulo, int alumnos, String nombre, int edad, String direccion, double sueldobase,
            int servicio, String sexo) {
        super(nombre, edad, direccion, sueldobase, servicio, sexo);
        this.titulo = titulo;
        this.alumnos = alumnos;

    }

    public Profesor(String titulo, int alumnos, String nombre, String sexo) {
        super(nombre, sexo);
        this.titulo = titulo;
        this.alumnos = alumnos;

    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public double getSueldofinal() {
        if (alumnos > 40) {
            return sueldobase * Constantes.PORCENTAJE_PROFE;
        } else {
            return sueldobase;
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nTítulo: " + titulo + "\nNúmero de alumnos: " + alumnos;

    }

     public void crear() {
        Scanner sc = new Scanner(System.in);
        super.crear();
        System.out.println("ingrese su título: ");
        setTitulo(sc.nextLine());
        System.out.println("ingrese su cantidad de alumnos: ");
        setAlumnos(sc.nextInt());
    }

    public void crearsimple() {
        Scanner sc = new Scanner(System.in);
        super.crearsimple();
        System.out.println("ingrese su título: ");
        setTitulo(sc.nextLine());
        System.out.println("ingrese su cantidad de alumnos: ");
        setAlumnos(sc.nextInt());

    }

  /*   
  public void mostrar() {
        StringBuilder sb = new StringBuilder();
        super.mostrar();
        sb.append("su Título es: " + titulo);
        sb.append("\nsu cantidad de alumnos es: " + alumnos);
        System.out.println(sb);

    }  */

}
