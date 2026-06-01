import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Postulacion {
    private int idPostulacion;
    private LocalDate fecha;
    private String estado;
    private Usuario postulante;
    private Convocatoria convocatoria;
    private Tutor tutor;
    private List<Documento> documentos;
    private List<Evaluacion> evaluaciones;
    private double puntajeFinal;

    public Postulacion(int idPostulacion, Usuario postulante,
                       Convocatoria convocatoria, Tutor tutor) {
        this.idPostulacion = idPostulacion;
        this.fecha = LocalDate.now();
        this.estado = "Registrada";
        this.postulante = postulante;
        this.convocatoria = convocatoria;
        this.tutor = tutor;
        this.documentos = new ArrayList<>();
        this.evaluaciones = new ArrayList<>();
        this.puntajeFinal = 0;

        if (tutor.puedeAceptarBecario()) {
            tutor.sumarBecario();
        }
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public void agregarEvaluacion(Evaluacion evaluacion) {
        if (evaluaciones.size() < 2) {
            evaluaciones.add(evaluacion);
        }
    }

    public double calcularPuntajeFinal() {
        if (evaluaciones.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (Evaluacion evaluacion : evaluaciones) {
            suma += evaluacion.getPuntaje();
        }

        puntajeFinal = suma / evaluaciones.size();
        return puntajeFinal;
    }

    public String getEstado() {
        return estado;
    }

    public double getPuntajeFinal() {
        return puntajeFinal;
    }

    @Override
    public String toString() {
        return "Postulación ID: " + idPostulacion +
                ", Postulante: " + postulante.getNombreCompleto() +
                ", Convocatoria: " + convocatoria.getNombre() +
                ", Tutor: " + tutor.getNombreCompleto() +
                ", Estado: " + estado +
                ", Puntaje final: " + puntajeFinal;
    }
}