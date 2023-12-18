package Servicios;

/**
 *
 * @author Cecilia
 */
import Entidades.Estudiante;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class EstudianteTableModelProfesor extends AbstractTableModel {

    private ArrayList<Estudiante> estudiantes;
    private String[] columnas = {"Nombre", "Apellido", "DNI", "Teléfono", "Email", "Curso", "Nombre del Tutor"};

    public EstudianteTableModelProfesor(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public int getRowCount() {
        return estudiantes.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estudiante estudiante = estudiantes.get(rowIndex);

        switch (columnIndex) {
            case 0:
             return estudiante.getNombre();
            case 1:
               return estudiante.getApellido();
            case 2:
                return estudiante.getDni();
            case 3:
                return estudiante.getTelefono();
            case 4:
                return estudiante.getEmail();
            case 5:
                return estudiante.getCurso();
            case 6:
                return estudiante.getNombreApellidoTutor();
  
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}

