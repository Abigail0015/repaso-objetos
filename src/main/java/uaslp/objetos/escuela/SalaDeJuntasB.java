package uaslp.objetos.escuela;

public class SalaDeJuntasB implements SalaDeJuntas
{
    private static SalaDeJuntasB uniqueInstance;

    String nombre = "Sala B";
    @Override
    public String getNombre()
    {
        return nombre;
    }
    public static SalaDeJuntasB getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new SalaDeJuntasB();
        }
        return uniqueInstance;
    }

}
