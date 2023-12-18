
package Entidades;

/**
 *
 * @author Cecilia
 */
public class Estudiante {
    private String nombreUsuario;
    private String contrasena;
    private String nombre;
    private String apellido;
    private int dni;
    private long telefono;
    private String email;
    private String curso;
    private String nombreApellidoTutor;

    public Estudiante() {
    }

    public Estudiante(String nombreUsuario, String contrasena, String nombre, String apellido, int dni, long telefono, String email, String curso, String nombreApellidoTutor) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.curso = curso;
        this.nombreApellidoTutor = nombreApellidoTutor;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombreApellidoTutor() {
        return nombreApellidoTutor;
    }

    public void setNombreApellidoTutor(String nombreApellidoTutor) {
        this.nombreApellidoTutor = nombreApellidoTutor;
    }

    @Override
    public String toString() {
        return " Estudiante " + "nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono + ", email=" + email + ", curso=" + curso + ", nombreApellidoTutor=" + nombreApellidoTutor ;
    }
    
    

  
}
