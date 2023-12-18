package Entidades;



/**
 *
 * @author Cecilia
 */
public class Profesor {

    private String nombreUsuario;
    private String contrasena;
    private String nombre;
    private String apellido;
    private Long cuil;
    private Long telefono;
    private String email;
    private String plantaSuplente;
    private String materias;
    private String curso;

    public Profesor() {
    }

    public Profesor(String nombreUsuario, String contrasena, String nombre, String apellido, Long cuil, Long telefono, String email, String plantaSuplente, String materias, String curso) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.telefono = telefono;
        this.email = email;
        this.plantaSuplente = plantaSuplente;
        this.materias = materias;
        this.curso = curso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getCuil() {
        return cuil;
    }

    public void setCuil(Long cuil) {
        this.cuil = cuil;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaterias() {
        return materias;
    }

    public String getPlantaSuplente() {
        return plantaSuplente;
    }

    public void setPlantaSuplente(String plantaSuplente) {
        this.plantaSuplente = plantaSuplente;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Profesor " + "nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellido=" + apellido + ", cuil=" + cuil + ", telefono=" + telefono + ", email=" + email + ", plantaSuplente=" + plantaSuplente + ", materias=" + materias + ", curso=" + curso;
    }

}
