import java.util.ArrayList;
import java.util.List;

public class Tutor extends Persona {

    private int idTutor;
    private String especialidad;
    private int cantidadBecarios;
    private List<Postulacion> postulacionesSupervisadas;

    public Tutor(int idPersona, String primerNombre, String segundoNombre,
                 String primerApellido, String segundoApellido,
                 String telefono, String localidad, String email,
                 int idTutor, String especialidad) {

        super(idPersona, primerNombre, segundoNombre, primerApellido, segundoApellido,
                telefono, localidad, email);

        this.idTutor = idTutor;
        this.especialidad = especialidad;
        this.cantidadBecarios = 0;
        this.postulacionesSupervisadas = new ArrayList<>();
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCantidadBecarios() {
        return cantidadBecarios;
    }

    public List<Postulacion> getPostulacionesSupervisadas() {
        return postulacionesSupervisadas;
    }

    public boolean puedeAceptarBecario() {
        return cantidadBecarios < 3;
    }

    public void sumarBecario() {
        if (puedeAceptarBecario()) {
            cantidadBecarios++;
        } else {
            System.out.println("El tutor no puede aceptar más becarios.");
        }
    }

    public void supervisarPostulacion(Postulacion postulacion) {
        if (puedeAceptarBecario()) {
            postulacionesSupervisadas.add(postulacion);
            sumarBecario();
            System.out.println("Postulación supervisada por: " + getNombreCompleto());
        } else {
            System.out.println("El tutor " + getNombreCompleto() + " ya tiene 3 becarios.");
        }
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "idTutor=" + idTutor +
                ", nombreCompleto='" + getNombreCompleto() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cantidadBecarios=" + cantidadBecarios +
                '}';
    }
}