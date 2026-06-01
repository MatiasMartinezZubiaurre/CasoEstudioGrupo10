public class Usuario extends Persona {

    private int idUsuario;
    private String estadoUsuario;
    private String institucion;
    private String rol;

    public Usuario(int idPersona, String primerNombre, String segundoNombre,
                   String primerApellido, String segundoApellido,
                   String telefono, String localidad, String email,
                   int idUsuario, String estadoUsuario, String institucion, String rol) {

        super(idPersona, primerNombre, segundoNombre, primerApellido, segundoApellido,
                telefono, localidad, email);

        this.idUsuario = idUsuario;
        this.estadoUsuario = estadoUsuario;
        this.institucion = institucion;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void realizarPostulacion(Postulacion postulacion) {
        System.out.println(getNombreCompleto() + " realizó la postulación: " + postulacion);
    }

    public String consultarEstadoPostulacion(Postulacion postulacion) {
        return postulacion.getEstado();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombreCompleto='" + getNombreCompleto() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", estadoUsuario='" + estadoUsuario + '\'' +
                ", institucion='" + institucion + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
