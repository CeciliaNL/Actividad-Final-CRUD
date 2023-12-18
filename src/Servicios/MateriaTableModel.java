package Servicios;

/**
 *
 * @author Cecilia
 */

import Entidades.Materia;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class MateriaTableModel extends AbstractTableModel {

    private ArrayList<Materia> materias;
    private String[] columnas = {"Materia", "Curso", "Profesor"};

    public MateriaTableModel(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public int getRowCount() {
        return materias.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Materia materia = materias.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return materia.getNombreMateria();
            case 1:
                return materia.getCurso();
            case 2:
                return materia.getNombreProfesor();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}

