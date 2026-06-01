import java.util.ArrayList;
import java.util.List;

public class Evaluador extends Persona {

    private int idEvaluador;
    private String especialidad;
    private String tipo;
    private List<Evaluacion> evaluaciones;

    public Evaluador(int idPersona, String primerNombre, String segundoNombre,
                     String primerApellido, String segundoApellido,
                     String telefono, String localidad, String email,
                     int idEvaluador, String especialidad, String tipo) {

        super(idPersona, primerNombre, segundoNombre, primerApellido, segundoApellido,
                telefono, localidad, email);

        this.idEvaluador = idEvaluador;
        this.especialidad = especialidad;
        this.tipo = tipo;
        this.evaluaciones = new ArrayList<>();
    }

    public int getIdEvaluador() {
        return idEvaluador;
    }

    public void setIdEvaluador(int idEvaluador) {
        this.idEvaluador = idEvaluador;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void agregarEvaluacion(Evaluacion evaluacion) {
        evaluaciones.add(evaluacion);
    }

    public int obtenerCantidadEvaluaciones() {
        return evaluaciones.size();
    }

    public void realizarEvaluacion(Evaluacion evaluacion) {
        agregarEvaluacion(evaluacion);
        System.out.println("Evaluación realizada por: " + getNombreCompleto());
    }

    @Override
    public String toString() {
        return "Evaluador{" +
                "idEvaluador=" + idEvaluador +
                ", nombreCompleto='" + getNombreCompleto() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cantidadEvaluaciones=" + evaluaciones.size() +
                '}';
    }
}