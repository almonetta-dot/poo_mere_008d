package dev.rampmaster;

public class Estudiante extends Usuario {

    public Estudiante(String run, String primerNombre, String segundoNombre,
                      String primerApellido, String segundoApellido,
                      Integer edad, String correoIns) {
        super(run, primerNombre, segundoNombre, primerApellido,
                segundoApellido, edad, correoIns);
    }

    @Override
    public String toString() {
        return "[Estudiante] " + super.toString();
    }
}