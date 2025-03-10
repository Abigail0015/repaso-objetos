package uaslp.objetos.figuras;

public class Cuadrado extends Figura
{
    Double lado;
    public Cuadrado ()
    {
        name = "Cuadrado";
    }
    public Cuadrado(double lado)
    {
        this.lado = lado;
    }
    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea()
    {
        double area;

        if(lado == null)
            throw new LadoNoProvistoException();
        area = lado * lado;
        return area;
    }
}
