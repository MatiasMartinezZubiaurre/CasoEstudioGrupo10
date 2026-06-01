public class Criterio {

    private int idCriterio;
    private String descripcion;
    private String fechaCreacion;
    private double puntajeMinimo;
    private double puntajeMaximo;
    private double ponderacion;
    private double puntajeAsignado;

    public Criterio(int idCriterio, String descripcion, String fechaCreacion,
                    double puntajeMinimo, double puntajeMaximo, double ponderacion) {

        this.idCriterio = idCriterio;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.puntajeMinimo = puntajeMinimo;
        this.puntajeMaximo = puntajeMaximo;
        this.ponderacion = ponderacion;
        this.puntajeAsignado = puntajeMinimo;
    }

    public int getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(int idCriterio) {
        this.idCriterio = idCriterio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(double puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }

    public double getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(double puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public double getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(double ponderacion) {
        this.ponderacion = ponderacion;
    }

    public double getPuntajeAsignado() {
        return puntajeAsignado;
    }

    public void asignarPuntaje(double puntajeAsignado) {
        if (puntajeAsignado >= puntajeMinimo && puntajeAsignado <= puntajeMaximo) {
            this.puntajeAsignado = puntajeAsignado;
        } else {
            System.out.println("El puntaje asignado debe estar entre " +
                    puntajeMinimo + " y " + puntajeMaximo);
        }
    }

    public boolean validarPuntaje(double puntaje) {
        return puntaje >= puntajeMinimo && puntaje <= puntajeMaximo;
    }

    public double calcularPuntajePonderado() {
        return puntajeAsignado * ponderacion;
    }

    @Override
    public String toString() {
        return "Criterio{" +
                "idCriterio=" + idCriterio +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", puntajeMinimo=" + puntajeMinimo +
                ", puntajeMaximo=" + puntajeMaximo +
                ", ponderacion=" + ponderacion +
                ", puntajeAsignado=" + puntajeAsignado +
                '}';
    }
}