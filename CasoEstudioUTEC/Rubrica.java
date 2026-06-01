import java.util.ArrayList;
import java.util.List;

public class Rubrica {

    private int idRubrica;
    private String version;
    private String estado;
    private double puntajeTotal;
    private List<Criterio> criterios;

    public Rubrica(int idRubrica, String version, String estado) {
        this.idRubrica = idRubrica;
        this.version = version;
        this.estado = estado;
        this.puntajeTotal = 0;
        this.criterios = new ArrayList<>();
    }

    public int getIdRubrica() {
        return idRubrica;
    }

    public void setIdRubrica(int idRubrica) {
        this.idRubrica = idRubrica;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPuntajeTotal() {
        return puntajeTotal;
    }

    public List<Criterio> getCriterios() {
        return criterios;
    }

    public void agregarCriterio(Criterio criterio) {
        criterios.add(criterio);
        calcularPuntajeTotal();
    }

    public void eliminarCriterio(Criterio criterio) {
        criterios.remove(criterio);
        calcularPuntajeTotal();
    }

    public double calcularPuntajeTotal() {
        double suma = 0;

        for (Criterio criterio : criterios) {
            suma += criterio.calcularPuntajePonderado();
        }

        this.puntajeTotal = suma;
        return puntajeTotal;
    }

    public boolean estaActiva() {
        return estado != null && estado.equalsIgnoreCase("Activa");
    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "idRubrica=" + idRubrica +
                ", version='" + version + '\'' +
                ", estado='" + estado + '\'' +
                ", puntajeTotal=" + puntajeTotal +
                ", cantidadCriterios=" + criterios.size() +
                '}';
    }
}