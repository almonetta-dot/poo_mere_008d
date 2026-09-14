package dev.rampmaster;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static ArrayList<Docente> docentes = new ArrayList<>();
    static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    static ArrayList<Sede> sedes = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n====SISTEMA DE GESTION==== ");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Docente");
            System.out.println("3. Registrar Asignatura");
            System.out.println("4. Registrar Sede");
            System.out.println("5. Ver Estudiantes");
            System.out.println("6. Ver Docentes");
            System.out.println("7. Ver Asignaturas");
            System.out.println("8. Ver Sedes");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: registrarEstudiante();
                        break;
                case 2: registrarDocente();
                        break;
                case 3: registrarAsignatura();
                        break;
                case 4: registrarSede();
                        break;
                case 5: verEstudiantes();
                        break;
                case 6: verDocentes();
                        break;
                case 7: verAsignaturas();
                        break;
                case 8: verSedes();
                        break;
                case 9: System.out.println("Saliendo del sistema...");
                        break;
                default: System.out.println("Opcion invalida");
            }
        } while (opcion != 9);
    }

    static void registrarEstudiante() {
        try {
            System.out.println("\n===Registrar Estudiante===");
            System.out.print("RUN (ej: 12345678-5): ");
            String run = sc.nextLine();
            System.out.print("Primer nombre: ");
            String nombre1 = sc.nextLine();
            System.out.print("Segundo nombre: ");
            String nombre2 = sc.nextLine();
            System.out.print("Primer apellido: ");
            String apellido1 = sc.nextLine();
            System.out.print("Segundo apellido: ");
            String apellido2 = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.print("Correo institucional: ");
            String correo = sc.nextLine();

            Estudiante est = new Estudiante(run, nombre1, nombre2,
                    apellido1, apellido2, edad, correo);
            estudiantes.add(est);
            System.out.println("Estudiante registrado exitosamente");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void registrarDocente() {
        try {
            System.out.println("\n===Registrar Docente===");
            System.out.print("RUN (ej: 12345678-5): ");
            String run = sc.nextLine();
            System.out.print("Primer nombre: ");
            String nombre1 = sc.nextLine();
            System.out.print("Segundo nombre: ");
            String nombre2 = sc.nextLine();
            System.out.print("Primer apellido: ");
            String apellido1 = sc.nextLine();
            System.out.print("Segundo apellido: ");
            String apellido2 = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.print("Correo institucional: ");
            String correo = sc.nextLine();

            Docente doc = new Docente(run, nombre1, nombre2,
                    apellido1, apellido2, edad, correo, new HashSet<>());
            docentes.add(doc);
            System.out.println("Docente registrado exitosamente");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void registrarAsignatura() {
        try {
            System.out.println("\n===Registrar Asignatura===");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Codigo: ");
            String codigo = sc.nextLine();
            System.out.print("Jornada (Diurna/Vespertina): ");
            String jornada = sc.nextLine();

            Asignatura asig = new Asignatura(id, nombre, codigo, jornada);
            asignaturas.add(asig);
            System.out.println("Asignatura registrada exitosamente");

        } catch (InputMismatchException e){
            System.out.println("error: "+ e.getMessage());

        }//catch (IllegalArgumentException e) {
           // System.out.println("Error: " + e.getMessage());
        //}

    }

    static void registrarSede() {
        try {
            System.out.println("\n===Registrar Sede===");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Direccion: ");
            String direccion = sc.nextLine();

            Sede sede = new Sede(id, nombre, direccion);
            sedes.add(sede);
            System.out.println("Sede registrada exitosamente");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    static void verEstudiantes() {
        System.out.println("\n===Lista de Estudiantes===");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados");
        } else {
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i + 1) + ". " + estudiantes.get(i));
            }
        }
    }

    static void verDocentes() {
        System.out.println("\n===Lista de Docentes===");
        if (docentes.isEmpty()) {
            System.out.println("No hay docentes registrados");
        } else {
            for (int i = 0; i < docentes.size(); i++) {
                System.out.println((i + 1) + ". " + docentes.get(i));
            }
        }
    }

    static void verAsignaturas() {
        System.out.println("\n===Lista de Asignaturas===");
        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas");
        } else {
            for (int i = 0; i < asignaturas.size(); i++) {
                System.out.println((i + 1) + ". " + asignaturas.get(i));
            }
        }
    }

    static void verSedes() {
        System.out.println("\n===Lista de Sedes===");
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            for (int i = 0; i < sedes.size(); i++) {
                System.out.println((i + 1) + ". " + sedes.get(i));
            }
        }
    }
}