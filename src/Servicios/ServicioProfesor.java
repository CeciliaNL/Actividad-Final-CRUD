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
import java.sql.PreparedStatement;

/**
 *
 * @author Cecilia
 */
public class ServicioProfesor {
    private  Profesor profesor;
    public Statement sentencia;
    public ResultSet resultado;
    private final conexionBD conexionbd = new conexionBD();

    public void loginProfesor(String name) {

        conexionbd.Conectar();
        Connection connection = conexionbd.getConnection();
        profesor = new Profesor();
        try {
            sentencia = connection.createStatement();
            resultado = sentencia.executeQuery("select * from profesores  where  nombreUsuarioProfesor = '" + name + "'");
            while (resultado.next()) {
                profesor.setNombreUsuario(resultado.getString(1));
                profesor.setContrasena(resultado.getString(2));
                profesor.setNombre(resultado.getString(3));
                profesor.setApellido(resultado.getString(4));
                profesor.setCuil(resultado.getLong(5));
                profesor.setTelefono(resultado.getLong(6));
                profesor.setEmail(resultado.getString(7));
                profesor.setPlantaSuplente(resultado.getString(8));
                profesor.setMaterias(resultado.getString(9));
                profesor.setCurso(String.valueOf(resultado.getInt(10)));
               
                
            }

        } catch (SQLException ex) {
            System.out.println("No encontrado");
        }

    }
    
  
    public int validarUsuario(String nombre, String contrasena) {
        loginProfesor(nombre);

        int flag = 0;

        if (nombre.equals(profesor.getNombreUsuario())) {
            flag = 1;
            if (contrasena.equals(profesor.getContrasena())) {
                flag = 2;
            }

        } else {
            flag = 0;
        }

        return flag;
    }

    public Profesor getProfesor() {
        return profesor;
    }

        public void actualizarDatos(String usuario, String email, Long telefono){
             conexionbd.Conectar();
        Connection connection = conexionbd.getConnection();

        try {
            String query = "UPDATE profesores SET telefonoProfesor ="+telefono + ", emailProfesor = '"+ email +"' WHERE nombreUsuarioProfesor = '"+usuario +"'; ";
            sentencia = connection.createStatement();
            sentencia.executeUpdate(query);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar datos");
        }
        
        
        
        
    }
         public ArrayList Buscador(int curso, int posicion) {
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
                where = "cursoMateria = " + curso + " ;";} 
            case 2 -> {
                lugar = "estudiantes ";
                where = "cursoEstudiante =  " + curso +  ";";
            }

            case 3 -> {
                lugar = "profesores";
                where = "cursoProfesor = " + curso + " ;"; 
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
         
         public boolean crearUsuario(Profesor nuevoUsuProfesor) {
    Boolean flag = false;
    conexionbd.Conectar();
    Connection connection = conexionbd.getConnection();

    try {
        String query = "INSERT INTO profesores VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, nuevoUsuProfesor.getNombreUsuario());
        preparedStatement.setString(2, nuevoUsuProfesor.getContrasena());
        preparedStatement.setString(3, nuevoUsuProfesor.getNombre());
        preparedStatement.setString(4, nuevoUsuProfesor.getApellido());
        preparedStatement.setLong(5, nuevoUsuProfesor.getCuil());
        preparedStatement.setString(6, nuevoUsuProfesor.getTelefono().toString());
        preparedStatement.setString(7, nuevoUsuProfesor.getEmail());
        preparedStatement.setString(8, nuevoUsuProfesor.getPlantaSuplente());
        preparedStatement.setString(9, nuevoUsuProfesor.getMaterias());
        preparedStatement.setInt(10, Integer.valueOf(nuevoUsuProfesor.getCurso()));

        preparedStatement.executeUpdate();

    } catch (SQLException ex) {
        flag = true;
    }
    return flag;
}

             public void eliminarProfesor(String nombreUsuario) throws Exception {
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