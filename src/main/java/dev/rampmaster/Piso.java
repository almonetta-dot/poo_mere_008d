package dev.rampmaster;

import java.util.HashSet;

public class Piso {

    private int id;
    private int numeroPiso;
    private HashSet<Sala> salas;

    public Piso(int id, int numeroPiso) {
        if (numeroPiso < 0)
            throw new IllegalArgumentException("El número de piso no puede ser negativo");
        this.id = id;
        this.numeroPiso = numeroPiso;
        this.salas = new HashSet<>();
    }

    public int getId() {
        return id;}

    public int getNumeroPiso() {
        return numeroPiso;}

    public void setNumeroPiso(int numeroPiso) {
        if (numeroPiso < 0)
            throw new IllegalArgumentException("El número de piso no puede ser negativo");
        this.numeroPiso = numeroPiso;
    }

    public HashSet<Sala> getSalas() {
        return salas;}

    public void agregarSala(Sala sala) {
        if (sala == null)
            throw new IllegalArgumentException("La sala no puede ser vacio");
        salas.add(sala);
    }

    public void eliminarSala(Sala sala) {
        if (sala == null)
            throw new IllegalArgumentException("La sala no puede ser vacio");
        salas.remove(sala);
    }

    @Override
    public String toString() {
        return "Piso " + numeroPiso + " | Salas: " + salas.size();
    }
}