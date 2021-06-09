package uaslp.objetos.escuela;

public class SalaDeJuntasC implements SalaDeJuntas
{
    private static SalaDeJuntasC uniqueInstance;

    String nombre = "Sala C";
    @Override
    public String getNombre()
    {
        return nombre;
    }
    public static SalaDeJuntasC getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new SalaDeJuntasC();
        }
        return uniqueInstance;
    }
}
