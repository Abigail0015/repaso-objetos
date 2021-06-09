package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Alumno {

    String nombre;
    String clave;
    String claveDeCarrera;
    int anioDeIngreso;
    LocalDate fechaNacimiento;

    public Alumno(String nombre, String clave, String claveDeCarrera, int anioDeIngreso, LocalDate fechaNacimiento)
    {
        this.nombre = nombre;
        this.clave = clave;
        this.claveDeCarrera = claveDeCarrera;
        this.anioDeIngreso = anioDeIngreso;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}