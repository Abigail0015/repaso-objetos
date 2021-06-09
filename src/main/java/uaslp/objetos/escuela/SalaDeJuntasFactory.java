package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {

    public static SalaDeJuntas get(String sala)
    {

        switch(sala)
        {
            case "Sala A":
                return SalaDeJuntasA.getInstance();
            case "Sala B":
                return SalaDeJuntasB.getInstance();
            case "Sala C":
                return SalaDeJuntasC.getInstance();
        }
        return null;
    }




}
