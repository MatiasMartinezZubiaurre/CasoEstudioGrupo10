import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Convocatoria {
    private int idConvocatoria;
    private String nombre;
    private String tipo;
    private int anio;
    private String descripcion;
    private LocalDate fechaApertura;
    private LocalDate fechaCierre;
    private double monto;
    private int cupos;
    private List<String> documentosRequeridos;

    public Convocatoria(int idConvocatoria, String nombre, String tipo, int anio,
                        String descripcion, LocalDate fechaApertura, LocalDate fechaCierre,
                        double monto, int cupos) {
        this.idConvocatoria = idConvocatoria;
        this.nombre = nombre;
        this.tipo = tipo;
        this.anio = anio;
        this.descripcion = descripcion;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.monto = monto;
        this.cupos = cupos;
        this.documentosRequeridos = new ArrayList<>();
    }

    public void agregarDocumentoRequerido(String documento) {
        documentosRequeridos.add(documento);
    }

    public boolean estaAbierta() {
        LocalDate hoy = LocalDate.now();
        return !hoy.isBefore(fechaApertura) && !hoy.isAfter(fechaCierre);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Convocatoria: " + nombre + ", Tipo: " + tipo +
                ", Año: " + anio + ", Cupos: " + cupos;
    }
}