import java.util.ArrayList;
import java.util.List;

public class Evaluacion {

    private Evaluador evaluador;
    private List<Criterio> criterios;
    private double puntaje;
    private String observaciones;

    public Evaluacion(Evaluador evaluador) {
        this.evaluador = evaluador;
        this.criterios = new ArrayList<>();
        this.puntaje = 0;
        this.observaciones = "";
    }

    public void agregarCriterio(Criterio criterio) {
        criterios.add(criterio);
    }

    public void registrarResultado(double puntaje, String observaciones) {
        this.puntaje = puntaje;
        this.observaciones = observaciones;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public String getObservaciones() {
        return observaciones;
    }

    @Override
    public String toString() {
        return "EvaluaciÃ³n realizada por: " + evaluador.getNombreCompleto() +
                ", Puntaje: " + puntaje +
                ", Observaciones: " + observaciones;
    }
}