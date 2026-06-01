public class Documento {
    private String nombre;
    private String tipo;
    private String rutaArchivo;

    public Documento(String nombre, String tipo, String rutaArchivo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.rutaArchivo = rutaArchivo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    @Override
    public String toString() {
        return "Documento: " + nombre + ", Tipo: " + tipo + ", Ruta: " + rutaArchivo;
    }
}