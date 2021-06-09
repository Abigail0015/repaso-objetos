package uaslp.objetos.escuela;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class EvaluadorDePromediosAdapter
{
    EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios)
    {
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones)
    {
        List<String> calificacionesString = Arrays.asList(listaDeCalificaciones.split(","));
        List<Double> calificaciones = new ArrayList<>();
        for (String calificacion : calificacionesString)
        {
            calificaciones.add(Double.parseDouble(calificacion));
        }
        return evaluadorDePromedios.evalua(calificaciones);
    }
}
