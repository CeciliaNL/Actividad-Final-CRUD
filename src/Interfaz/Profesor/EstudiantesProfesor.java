package Interfaz.Profesor;

import Entidades.Estudiante;
import Entidades.Profesor;
import Servicios.EstudianteTableModel;
import Servicios.ServicioEstudiante;
import Servicios.ServicioProfesor;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Cecilia
 */
public class EstudiantesProfesor extends javax.swing.JPanel {
    ServicioProfesor servicioProfesor = new ServicioProfesor();
    Estudiante estudianteActual = new Estudiante();
    Profesor profesorActual = new Profesor();
    ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
    public EstudiantesProfesor() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaCursos = new javax.swing.JComboBox<>();
        RellenoImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 204));
        setLayout(null);

        listaCursos.setBackground(new java.awt.Color(102, 102, 255));
        listaCursos.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        listaCursos.setForeground(new java.awt.Color(255, 255, 255));
        listaCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3ro", "4to", "5to" }));
        listaCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCursosActionPerformed(evt);
            }
        });
        add(listaCursos);
        listaCursos.setBounds(620, 60, 70, 30);

        RellenoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/consultas-bannser.jpg"))); // NOI18N
        add(RellenoImagen);
        RellenoImagen.setBounds(180, 580, 390, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EstudiantesProfeLabel.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(120, 10, 480, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void listaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCursosActionPerformed
           String selectedCurso = (String) listaCursos.getSelectedItem();
    if (selectedCurso.equals("3ro")) {
        mostrarEstudiantes(3); 
    } else if (selectedCurso.equals("4to")) {
        mostrarEstudiantes(4);
        
    } else if (selectedCurso.equals("5to")){
        mostrarEstudiantes(5);
    }
     }
    private void mostrarEstudiantes(int curso) {
  Component[] components = this.getComponents();
    for (Component component : components) {
        if (component instanceof JScrollPane) {
            this.remove(component);
        }
    }
    
    ArrayList<Estudiante> estudiantes = new ArrayList<>(servicioProfesor.Buscador(curso, 2));
    EstudianteTableModel modelo = new EstudianteTableModel(estudiantes);
    JTable tabla = new JTable(modelo);
    JScrollPane scroll = new JScrollPane(tabla, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scroll.setBounds(10, 160, 730, 400);
    this.add(scroll);

    this.revalidate();
    this.repaint();

    }//GEN-LAST:event_listaCursosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RellenoImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> listaCursos;
    // End of variables declaration//GEN-END:variables

    public Profesor getProfesorActual() {
        return profesorActual;
    }

    public void setProfesorActual(Profesor profesorActual) {
        this.profesorActual = profesorActual;
    }
}
