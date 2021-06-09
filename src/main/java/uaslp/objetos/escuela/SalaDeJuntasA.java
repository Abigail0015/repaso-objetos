package uaslp.objetos.escuela;

public class SalaDeJuntasA implements SalaDeJuntas
{
    static SalaDeJuntasA uniqueInstance;

    String nombre = "Sala A";
    @Override
    public String getNombre()
    {
        return nombre;
    }
    public static SalaDeJuntasA getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new SalaDeJuntasA();
        }
        return uniqueInstance;
    }


}
