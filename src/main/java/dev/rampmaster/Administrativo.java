package dev.rampmaster;

public class Administrativo extends Usuario implements Colaborable {

    public Administrativo(String run, String primerNombre, String segundoNombre, String primerApellido,
                          String segundoApellido, Integer edad, String correoIns) {
        super(run, primerNombre, segundoNombre, primerApellido, segundoApellido, edad, correoIns);
    }

    @Override
    public int usarJunaColaborable(int valorAlmuerzo) {
        return valorAlmuerzo;
    }

    @Override
    public String toString() {
        return "[Administrativo] " + super.toString();
    }
}