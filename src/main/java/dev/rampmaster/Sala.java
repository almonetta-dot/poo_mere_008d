package dev.rampmaster;

public class Sala {

    private int id;
    private String codigo;
    private int capacidadMax;

    public Sala(int id, String codigo, int capacidadMax) {
        if (codigo == null || codigo.isBlank())
            throw new IllegalArgumentException("El código de la sala no puede estar vacío");
        if (capacidadMax <= 0)
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a 0");

        this.id = id;
        this.codigo = codigo;
        this.capacidadMax = capacidadMax;
    }

    public int getId() { return id; }

    public String getCodigo() {
        return codigo;}

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank())
            throw new IllegalArgumentException("El código de la sala no puede estar vacío");
        this.codigo = codigo;
    }

    public int getCapacidadMax() {
        return capacidadMax;}

    public void setCapacidadMax(int capacidadMax) {
        if (capacidadMax <= 0)
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a 0");
        this.capacidadMax = capacidadMax;
    }

    @Override
    public String toString() {
        return "Sala " + codigo + " (Cap: " + capacidadMax + ")";
    }
}