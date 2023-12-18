package Servicios;

import Entidades.Estudiante;
import Entidades.Materia;
import Entidades.Profesor;
import conexionBD.conexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cecilia
 */
public class ServicioEstudiante {

    public Statement sentencia;
    public ResultSet resultado;
    private Estudiante estudiante;
    private final conexionBD conexionbd = new conexionBD();

    public void loginEstudiante(String name) {

        conexionbd.Conectar();
        Connection connection = conexionbd.getConnection();
        estudiante = new Estudiante();
        try {
            sentencia = connection.createStatement();
            resultado = sentencia.executeQuery("select * from estudiantes  where  nombreUsuario = '" + name + "'");
            while (resultado.next()) {
                estudiante.setNombreUsuario(resultado.getString(1));
                estudiante.setContrasena(resultado.getString(2));
                estudiante.setNombre(resultado.getString(3));
                estudiante.setApellido(resultado.getString(4));
                estudiante.setDni(resultado.getInt(5));
                estudiante.setTelefono(resultado.getLong(6));
                estudiante.setEmail(resultado.getString(7));
                estudiante.setCurso(String.valueOf(resultado.getInt(8)));
                estudiante.setNombreApellidoTutor(resultado.getString(9));

                
            }

        } catch (SQLException ex) {
            System.out.println("No encontrado");
        }

    }

    public int validarUsuario(String nombre, String contrasena) {
        loginEstudiante(nombre);

        int flag = 0;

        if (nombre.equals(estudiante.getNombreUsuario())) {
            flag = 1;
            if (contrasena.equals(estudiante.getContrasena())) {
                flag = 2;
            }

        } else {
            flag = 0;
        }

        return flag;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public boolean crearUsuario(Estudiante nuevoUsuarioEstudiante) {
        Boolean flag = false;
        conexionbd.Conectar();
        Connection connection = conexionbd.getConnection();

        try {
            String query = "insert into estudiantes  values ('" + nuevoUsuarioEstudiante.getNombreUsuario() + "', '"
                    + nuevoUsuarioEstudiante.getContrasena() + "','" + nuevoUsuarioEstudiante.getNombre() + "', '" + nuevoUsuarioEstudiante.getApellido()
                    + "', " + nuevoUsuarioEstudiante.getDni() + ", " + nuevoUsuarioEstudiante.getTelefono() + " , '" + nuevoUsuarioEstudiante.getEmail() + "', "
                    + nuevoUsuarioEstudiante.getCurso() + " , '" + nuevoUsuarioEstudiante.getNombreApellidoTutor() + "');";
            sentencia = connection.createStatement();
            sentencia.executeUpdate(query);

        } catch (SQLException ex) {
            flag = true;
        }
        return flag;
    }

    public ArrayList Buscador(Estudiante estudianteAux, int posicion) {
        String lugar = null;
        String where = null;
        ArrayList<Estudiante> listado = new ArrayList<>();
        ArrayList <Profesor> listadoProfes = new ArrayList<>();
        ArrayList<Materia> listadoMaterias = new ArrayList<>();
        conexionbd.Conectar();
        Connection connection = conexionbd.getConnection();
        switch (posicion) {
            case 1 ->{
                lugar = "materias";
                where = "cursoMateria = " + estudianteAux.getCurso() + " ;";}
            case 2 -> {
                lugar = "estudiantes ";
                where = "cursoEstudiante = " + estudianteAux.getCurso() + " ;";
            }

            case 3 -> {
                lugar = "profesores";
                where = "cursoProfesor = " + estudianteAux.getCurso() + " ;";
            }
        
        }
        try {
            sentencia = connection.createStatement();
            resultado = sentencia.executeQuery("select * from " + lugar + " where " + where);
            while (resultado.next()) {
                switch (posicion) {
                    case 1:
                       Materia materia = new Materia();
                        materia.setNombreMateria(resultado.getString(1));
                        materia.setCurso(resultado.getString(2));
                        materia.setNombreProfesor(resultado.getString(3));
                        
                        listadoMaterias.add(materia);
                    case 2:
                        Estudiante estudianteLista = new Estudiante();
                        estudianteLista.setNombreUsuario(resultado.getString(1));
                        estudianteLista.setContrasena(resultado.getString(2));
                        estudianteLista.setNombre(resultado.getString(3));
                        estudianteLista.setApellido(resultado.getString(4));
                        estudianteLista.setDni(resultado.getInt(5));
                        estudianteLista.setTelefono(resultado.getLong(6));
                        estudianteLista.setEmail(resultado.getString(7));
                        estudianteLista.setCurso(String.valueOf(resultado.getInt(8)));
                        estudianteLista.setNombreApellidoTutor(resultado.getString(9));
                        listado.add(estudianteLista);
                        

                        break;
                    case 3:

                        Profesor profesorLista = new Profesor();
                        Long telefonoL = Long.valueOf(resultado.getString(6));
                        String CursoString = String.valueOf(resultado.getInt(10));
                        profesorLista.setNombreUsuario(resultado.getString(1));
                        profesorLista.setNombre(resultado.getString(3));
                        profesorLista.setApellido(resultado.getString(4));
                        profesorLista.setTelefono(telefonoL);
                        profesorLista.setEmail(resultado.getString(7));
                        profesorLista.setPlantaSuplente(resultado.getString(8));
                        profesorLista.setMaterias(resultado.getString(9));
                        profesorLista.setCurso(CursoString);
                        listadoProfes.add(profesorLista);
                       break;

                }
            }
        } catch (SQLException ex) {
           
        }
if (posicion == 3){
    return  listadoProfes;
} else if (posicion ==1){
    return listadoMaterias;
}
        return listado;

    }
    
    public void actualizarDatos(String usuario, String email, Long telefono){
             conexionbd.Conectar();
        Connection connection = conexionbd.getConnection();

        try {
            String query = "UPDATE estudiantes SET telefonoEstudiante ="+telefono + ", emailEstudiante = '"+ email +"' WHERE nombreUsuario = '"+usuario +"'; ";
            sentencia = connection.createStatement();
            sentencia.executeUpdate(query);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar datos");
        }
        
    }
    
    public void eliminarEstudiante(String nombreUsuario) throws Exception {
         conexionbd.Conectar();
         Connection connection = conexionbd.getConnection();
        try {
            String query = "DELETE FROM estudiantes WHERE nombreUsuario = '" + nombreUsuario + "';";
            sentencia = connection.createStatement();
            sentencia.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar Usuario");
        }

    }

}
