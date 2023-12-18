package Servicios;

/**
 *
 * @author Cecilia
 */
;
import Entidades.Profesor;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;



public class ProfesorTableModel extends AbstractTableModel {

    private ArrayList<Profesor> profesores;
    private String[] columnas = {"Nombre de Usuario", "Nombre", "Apellido", "Telefono",  "Email", "P/S", "Materias", "Curso"};

    public ProfesorTableModel(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    @Override
    public int getRowCount() {
        return profesores.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Profesor profesor = profesores.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return profesor.getNombreUsuario();
            case 1:
                return profesor.getNombre();
            case 2:
                return profesor.getApellido();
            case 3:
                return profesor.getTelefono();

            case 4:
                return profesor.getEmail();
            case 5:
                return profesor.getPlantaSuplente();
            case 6:
                return profesor.getMaterias();
            case 7:
                return profesor.getCurso();

            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
