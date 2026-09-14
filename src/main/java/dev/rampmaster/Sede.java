package dev.rampmaster;

import java.util.HashSet;

public class Sede {

    private int id;
    private String nombre;
    private String direccion;
    private HashSet<Piso> pisos;

    public Sede(int id, String nombre, String direccion) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre de la sede no puede estar vacío");
        if (direccion == null || direccion.isBlank())
            throw new IllegalArgumentException("La dirección no puede estar vacía");

        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = new HashSet<>();
    }

    public int getId() {
        return id;}

    public String getNombre() {
        return nombre;}

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre de la sede no puede estar vacío");
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;}

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isBlank())
            throw new IllegalArgumentException("La dirección no puede estar vacía");
        this.direccion = direccion;
    }

    public HashSet<Piso> getPisos() {
        return pisos;}

    public void agregarPiso(Piso piso) {
        if (piso == null)
            throw new IllegalArgumentException("El piso no puede estar vacio");
        pisos.add(piso);
    }

    public void eliminarPiso(Piso piso) {
        if (piso == null)
            throw new IllegalArgumentException("El piso no puede estar vacio");
        pisos.remove(piso);
    }

    @Override
    public String toString() {
        return nombre + " - " + direccion + " | Pisos: " + pisos.size();
    }
}