package colegio;

import java.util.Scanner;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private String direccion;
    protected double sueldobase;
    private int servicio;
    private String sexo;
public Empleado() {
    super();
}
    public Empleado(String nombre, String sexo) {
        this.nombre=nombre;
        this.sexo=sexo;
       // super();
    }
    
    public Empleado(String nombre, int edad, String direccion, double sueldobase, int servicio, String sexo) {
       // super();
       this.nombre=nombre;
       this.edad=edad;
       this.direccion=direccion;
       this.sueldobase=sueldobase;
       this.servicio=servicio;
       this.sexo=sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getServicio() {
        return servicio;
    }
    public void setServicio(int servicio) {
        this.servicio = servicio;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getSueldobase() {
        return sueldobase;
    }
    public void setSueldobase(double sueldobase) {
        this.sueldobase = sueldobase;
    }

    public abstract double getSueldofinal();
    @Override
    public String toString(){
        return "\nEmpleado ->\nNombre: "+nombre+"\nEdad: "+edad+"\nDireccion: "+direccion+"\nSueldo base: "+sueldobase+"\nAños de servicio: "+servicio+"\nSexo: "+sexo;
    }

     public void crearsimple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        setNombre(sc.nextLine());
        System.out.println("ingrese su Sexo: ");
        setSexo(sc.nextLine());
    }

    public void crear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        setNombre(sc.nextLine());
        System.out.println("ingrese su edad: ");
        setEdad(sc.nextInt());
        sc.nextLine();
        System.out.println("ingrese su direccion: ");
        setDireccion(sc.nextLine());
        System.out.println("ingrese su Sueldo base: ");
        setSueldobase(sc.nextFloat());
        sc.nextLine();
        System.out.println("ingrese sus años de servicio: ");
        setServicio(sc.nextInt());
        sc.nextLine();
        System.out.println("ingrese su Sexo: ");
        setSexo(sc.nextLine());
    }



}