package dev.rampmaster;

import java.time.LocalDate;
import java.time.Period;


public abstract class Usuario {
    protected String run;
    protected String primerNombre;
    protected String segundoNombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected Integer edad;
    protected String correoIns;



    public Usuario(String run, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
                   Integer edad, String correoIns) {
        if (run == null || run.isBlank())
            throw new IllegalArgumentException("El RUN no puede estar vacío");

        if (primerNombre == null || primerNombre.isBlank())
            throw new IllegalArgumentException("El primer nombre no puede estar vacío");

        if (primerApellido == null || primerApellido.isBlank())
            throw new IllegalArgumentException("El primer apellido no puede estar vacío");

        if (edad == null)
            throw new IllegalArgumentException("La fecha de nacimiento es obligatoria");

        if (edad < 18)
            throw new IllegalArgumentException("El usuario debe tener al menos 18 años");

        if (correoIns == null || correoIns.isBlank())
            throw new IllegalArgumentException("El correo institucional no puede estar vacío");


        this.run = run;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.correoIns = correoIns;
    }

    public String getRun() { return run; }

    public String getPrimerNombre() {
        return primerNombre;}

    public void setPrimerNombre(String primerNombre) {
        if (primerNombre == null || primerNombre.isBlank())
            throw new IllegalArgumentException("El primer nombre no puede estar vacío");
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;}

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;}

    public void setPrimerApellido(String primerApellido) {
        if (primerApellido == null || primerApellido.isBlank())
            throw new IllegalArgumentException("El primer apellido no puede estar vacío");
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;}

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getEdad() {
        return edad;}

    public void setFechaNacimiento(Integer edad) {
        if (edad == null)
            throw new IllegalArgumentException("La fecha de nacimiento es obligatoria.");
        this.edad = edad;
    }

    public String getCorreoIns() {
        return correoIns;}

    public void setCorreoIns(String correoIns) {
        if (correoIns == null || correoIns.isBlank())
            throw new IllegalArgumentException("El correo institucional no puede estar vacío.");
        this.correoIns = correoIns;
    }

    @Override
    public String toString() {
        return primerNombre + " " + primerApellido + " (" + run + ")";
    }
}