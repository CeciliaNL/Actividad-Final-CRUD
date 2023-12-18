package Servicios;

/**
 *
 * @author Cecilia
 */
import Entidades.Estudiante;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class EstudianteTableModel extends AbstractTableModel {

    private ArrayList<Estudiante> estudiantes;
    private String[] columnas = {"Nombre de Usuario", "Nombre", "Apellido", "DNI", "Teléfono", "Email", "Curso", "Nombre del Tutor"};

    public EstudianteTableModel(ArrayList<Estudiante> estudiantes) {
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
                return estudiante.getNombreUsuario();
            case 1:
                return estudiante.getNombre();
            case 2:
                return estudiante.getApellido();
            case 3:
                return estudiante.getDni();
            case 4:
                return estudiante.getTelefono();
            case 5:
                return estudiante.getEmail();
            case 6:
                return estudiante.getCurso();
            case 7:
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

