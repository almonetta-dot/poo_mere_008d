package dev.rampmaster;

import java.util.HashSet;

public class Docente extends Usuario implements Colaborable {

    private HashSet<Asignatura> asignaturas;

    public Docente(String run, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
                   Integer edad, String correoIns,
                   HashSet<Asignatura> asignaturas) {
        super(run, primerNombre, segundoNombre, primerApellido,
                segundoApellido, edad, correoIns);
        this.asignaturas = (asignaturas != null) ? asignaturas : new HashSet<>();
    }

    public HashSet<Asignatura> getAsignaturas() {
        return asignaturas;}

    public void setAsignaturas(HashSet<Asignatura> asignaturas) {
        this.asignaturas = (asignaturas != null) ? asignaturas : new HashSet<>();
    }

    public void agregarAsignatura(Asignatura asignatura) {
        if (asignatura == null)
            throw new IllegalArgumentException("La asignatura no puede estar vacio");
        asignaturas.add(asignatura);
    }

    public void eliminarAsignatura(Asignatura asignatura) {
        if (asignatura == null)
            throw new IllegalArgumentException("La asignatura no puede estar vacio");
        asignaturas.remove(asignatura);
    }

    @Override
    public int usarJunaColaborable(int valorAlmuerzo) {
        return valorAlmuerzo;
    }

    @Override
    public String toString() {
        return "[Docente] " + super.toString() + " | Asignaturas: " + asignaturas.size();
    }
}