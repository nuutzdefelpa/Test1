package colegio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejecutar {

    static ArrayList <Profesor> p =new ArrayList<>();
    static ArrayList <Mantenimiento> m =new ArrayList<>();
    static ArrayList <Administrativo> a =new ArrayList<>();
    static ArrayList <Seguridad> s =new ArrayList<>();
    static Iterator <Profesor> ip = p.iterator();
    static Iterator <Mantenimiento> im = m.iterator();
    static Iterator <Administrativo> ia = a.iterator();
    static Iterator <Seguridad> is = s.iterator();
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int f = 0;

        do {
            System.out.println("Este es un menu para registrar empleados!, que quieres hacer?\n");
            System.out.println("\n1.- Insertar un Profesor");
            System.out.println("\n2.- Insertar un Administrativo");
            System.out.println("\n3.- Insertar un personal de Mantenimiento");
            System.out.println("\n4.- Insertar un personal de Seguridad");
            System.out.println("\n5.- Insertar un Profesor (simple)");
            System.out.println("\n6.- Insertar un Administrativo (simple)");
            System.out.println("\n7.- Insertar un personal de Mantenimiento (simple)");
            System.out.println("\n8.- Insertar un personal de Seguridad (simple)" );
            System.out.println("\n9.- Mostrar los Profesores");
            System.out.println("\n10.- Mostrar los Administrativos");
            System.out.println("\n11.- Mostrar los del personal de Mantenimiento");
            System.out.println("\n12.- Mostrar los del personal de Seguridad");
            System.out.println("\n13.- Mostrar todos los registros");
            System.out.println("\n14.- Salir");
            f = sc.nextInt();
            switch (f) {
                case 1:
                    Profesor profe1 = new Profesor(null, f, null, f, null, f, f, null);
                    profe1.crear();
                    p.add(profe1);
                    //System.out.println(p);
                    //System.out.println(profe1);
                    break;

                case 2:
                    Administrativo admin1 = new Administrativo(null, f, null, f, f, null);
                    admin1.crear();
                    a.add(admin1);
                    break;
                    
                    case 3:
                    Mantenimiento mant1 = new Mantenimiento(null, f, null, f, f, null);
                    mant1.crear();
                    m.add(mant1);
                    break;

                    case 4:
                    Seguridad segu1 = new Seguridad(false, false, null, f, null, f, f, null);
                    segu1.crear();
                    s.add(segu1);
                    break;

                    case 5:
                    Profesor prof2 = new Profesor(null, f, null, null);
                    prof2.crearsimple();
                    p.add(prof2);
                    break;

                    case 6:
                    Administrativo admin2 = new Administrativo(null, null);
                    admin2.crearsimple();
                    a.add(admin2);
                    break;

                    case 7:
                    Mantenimiento mant2 = new Mantenimiento(null, null);
                    mant2.crearsimple();
                    m.add(mant2);
                    break;

                    case 8:
                    Seguridad segu2 = new Seguridad(false, false, null, null);
                    segu2.crearsimple();
                    s.add(segu2);
                    break;

                    case 9:
                    imppro();
                    break;
                    
                    case 10:
                    impadm();
                    break;
                    
                    case 11:
                    impman();
                    break;
                    
                    case 12:
                    impseg();
                    break;

                    case 13:
                    imppro();
                    impadm();
                    impman();
                    impseg();
                    break;
                    
                case 14:
                    System.out.println("hasta luego!!");
                    break;

                default:
                    System.out.println("elija una opción valida porfis");
                    break;
            }

        } while (f != 14);
        sc.close();


    //    Ejecutar colegio = new Ejecutar();
    //    colegio.run();
    }

    public static void imppro() {
        System.out.println("--------Profesores---------\n");
        ip = p.iterator();
        while (ip.hasNext()){
            Profesor next = ip.next();
            System.out.println(next.toString()+"\n");
            if(next.alumnos > 40){
                System.out.println("Tiene más de 40 alumnos!!, recibe un bono del 12%\nSu sueldo final es: "+next.getSueldofinal()+"\n"); 
            }
        }
        
    }
    public static void impadm() {
        System.out.println("------Administrativos---------\n");
        ia = a.iterator();
        while (ia.hasNext()) {
            Administrativo next = ia.next();
            System.out.println(next.toString()+"\n");
            System.out.println("Felicidades!, tiene un bono del 15% por no hacer nada :D\nSu sueldo final es: "+next.getSueldofinal()+"\n"); 
        }
    }
    public static void impman() {
        System.out.println("--------Mantenimiento---------\n");
        im = m.iterator();
        while (im.hasNext()) {
            Mantenimiento next = im.next();
            System.out.println(next.toString()+"\n");
        }
    }
    public static void impseg() {
        System.out.println("-------Seguridad---------\n");
        is = s.iterator();
        while (is.hasNext()) {
            Seguridad next = is.next();
            System.out.println(next.toString()+"\n");
            if(next.noche){
                System.out.println("Felicidades!, tiene un bono del 8% por no tenerle miedo a la oscuridad\nSu sueldo final es: "+next.getSueldofinal()+"\n"); 
            }
        }
    }



   /*  public void run() {

        Profesor profesorito = new Profesor("medicina", 45, "Adriana", 30, "UTEQ", 3500, 7, "femenino");
        // Administrativo adminsito = new Administrativo("Ricardo", 29, "Calzada de
        // belén", 2000, 3,"Masculino");
        // Mantenimiento mantenimientito = new Mantenimiento("Ana", 35,"Centro norte",
        // 5000, 14,"Femenino");
        // Seguridad seguridadsita = new Seguridad(true, true, "Alma", 50,"El
        // cimatario", 3100, 8, "Femenino");
        System.out.println("Los datos del profe son: ");
        System.out.println(profesorito.toString());
        System.out.println("Su sueldo base es de: ");
        System.out.println(profesorito.getSueldobase());
        System.out.println("Su aumento por niños es de: ");
        System.out.println(profesorito.getSueldofinal());

    }*/
}
