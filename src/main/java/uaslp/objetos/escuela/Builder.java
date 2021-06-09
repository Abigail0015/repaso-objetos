package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Builder
{
    String nombre;
    String clave;
    String claveDeCarrera;
    int anioDeIngreso;
    LocalDate fechaNacimiento;

    public Builder nombre(String nombre)
    {
        this.nombre = nombre;
        return this;
    }

    public Builder clave(String clave) {
        this.clave = clave;
        return this;
    }

    public Builder claveDeCarrera(String claveDeCarrera) {
        this.claveDeCarrera = claveDeCarrera;
        return this;
    }

    public Builder anioDeIngreso(int anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
        return this;
    }

    public Builder fechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public Alumno build()
    {
        return new Alumno(nombre,clave,claveDeCarrera,anioDeIngreso,fechaNacimiento);
    }
}
