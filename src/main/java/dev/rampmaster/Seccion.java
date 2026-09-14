package dev.rampmaster;

public class Seccion {
    // Atributos
    private String codigo;
    private Asignatura asignatura;
    private boolean activa = false;

    public Seccion(String codigo, Asignatura asignatura){
        if (codigo == null || codigo.isBlank())
            throw new IllegalArgumentException("El código de la sección no puede estar vacío");
        if (asignatura == null)
            throw new IllegalArgumentException("La asignatura no puede estar vacia");

        this.codigo = codigo;
        this.asignatura = asignatura;
        this.activa = true;
    }

    public String getCodigo() {
        return codigo;}

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank())
            throw new IllegalArgumentException("El código de la sección no puede estar vacío");
        this.codigo = codigo;
    }

    public Asignatura getAsignatura() { return asignatura; }
    public void setAsignatura(Asignatura asignatura) {
        if (asignatura == null)
            throw new IllegalArgumentException("La asignatura no puede estar vacia");
        this.asignatura = asignatura;
    }

    public boolean isActiva() {
        return activa;}

    public void setActiva(boolean activa) {
        this.activa = activa; }

    @Override
    public String toString() {
        return "Sección " + codigo + " - " + asignatura.getNombre();
    }


}
