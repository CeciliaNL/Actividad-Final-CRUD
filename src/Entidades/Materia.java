
package Entidades;



/**
 *
 * @author Cecilia
 */
public class Materia {
    private String nombreMateria;
    private String curso;
    private String NombreProfesor;

    public Materia() {
    }

    public Materia(String nombreMateria, String curso, String NombreProfesor) {
        this.nombreMateria = nombreMateria;
        this.curso = curso;
        this.NombreProfesor = NombreProfesor;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombreProfesor() {
        return NombreProfesor;
    }

    public void setNombreProfesor(String NombreProfesor) {
        this.NombreProfesor = NombreProfesor;
    }
    
}
