public class CriterioRubrica {
    private String nombre;
    private String descripcion;
    private double ponderacion;
    private double puntajeAsignado;

    public CriterioRubrica(String nombre, String descripcion, double ponderacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ponderacion = ponderacion;
        this.puntajeAsignado = 0;
    }

    public void asignarPuntaje(double puntaje) {
        this.puntajeAsignado = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPonderacion() {
        return ponderacion;
    }

    public double getPuntajeAsignado() {
        return puntajeAsignado;
    }

    @Override
    public String toString() {
        return "Criterio: " + nombre +
                ", Ponderación: " + ponderacion +
                ", Puntaje asignado: " + puntajeAsignado;
    }
}