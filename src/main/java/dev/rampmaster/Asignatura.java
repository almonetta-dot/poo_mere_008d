package dev.rampmaster;

import java.util.Objects;

public class Asignatura {

    private int id;
    private String nombre;
    private String codigo;
    private String jornada;

    public Asignatura(int id, String nombre, String codigo, String jornada) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre de la asignatura no puede estar vacío");
        if (codigo == null || codigo.isBlank())
            throw new IllegalArgumentException("El código de la asignatura no puede estar vacío");
        if (jornada == null || jornada.isBlank())
            throw new IllegalArgumentException("La jornada no puede estar vacía");

        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.jornada = jornada;
    }

    public int getId() { return id; }

    public String getNombre() {
        return nombre;}

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre de la asignatura no puede estar vacío.");
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;}

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank())
            throw new IllegalArgumentException("El código de la asignatura no puede estar vacío");
        this.codigo = codigo;
    }

    public String getJornada() {
        return jornada;}

    public void setJornada(String jornada) {
        if (jornada == null || jornada.isBlank())
            throw new IllegalArgumentException("La jornada no puede estar vacía");
        this.jornada = jornada;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Asignatura) {
            return id == ((Asignatura) o).id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ") - " + jornada;
    }
}