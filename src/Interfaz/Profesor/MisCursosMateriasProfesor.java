package Interfaz.Profesor;

import Entidades.Estudiante;
import Entidades.Profesor;
import Servicios.EstudianteTableModel;
import Servicios.ProfesorTableModel;
import Servicios.ServicioProfesor;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Cecilia
 */
public class MisCursosMateriasProfesor extends javax.swing.JPanel {
private Profesor profesorActual;
    public MisCursosMateriasProfesor() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RellenoImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        listaCursos2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 0, 153));
        setLayout(null);

        RellenoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/consultas-bannser.jpg"))); // NOI18N
        add(RellenoImagen);
        RellenoImagen.setBounds(180, 580, 390, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MisCursosMaterias.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(120, 0, 480, 100);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("MI CURSO");
        jButton1.setActionCommand("MI CURSO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(30, 100, 130, 30);

        listaCursos2.setBackground(new java.awt.Color(102, 102, 255));
        listaCursos2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        listaCursos2.setForeground(new java.awt.Color(255, 255, 255));
        listaCursos2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3ro", "4to", "5to" }));
        listaCursos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCursos2ActionPerformed(evt);
            }
        });
        add(listaCursos2);
        listaCursos2.setBounds(620, 90, 80, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ServicioProfesor servicioProfesor = new ServicioProfesor();
        ArrayList<Profesor> profesores = new ArrayList<>(servicioProfesor.Buscador(Integer.valueOf(profesorActual.getCurso()), 3));
        ProfesorTableModel modelo = new ProfesorTableModel(profesores);
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(10, 160, 730, 400);
        this.add(scroll);
        this.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listaCursos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCursos2ActionPerformed
                  String selectedCurso = (String) listaCursos2.getSelectedItem();
    if (selectedCurso.equals("3ro")) {
        mostrarProfesores(3); 
    } else if (selectedCurso.equals("4to")) {
        mostrarProfesores(4);
        
    } else if (selectedCurso.equals("5to")){
        mostrarProfesores(5);
    }
    }//GEN-LAST:event_listaCursos2ActionPerformed
    private void mostrarProfesores(int curso) {
  Component[] components = this.getComponents();
    for (Component component : components) {
        if (component instanceof JScrollPane) {
            this.remove(component);
        }
    }
    ServicioProfesor servicioProfesor = new ServicioProfesor();
    
    ArrayList<Profesor> Profesores = new ArrayList<>(servicioProfesor.Buscador(curso, 3));
    ProfesorTableModel modelo = new ProfesorTableModel(Profesores);
    JTable tabla = new JTable(modelo);
    JScrollPane scroll = new JScrollPane(tabla, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scroll.setBounds(10, 160, 730, 400);
    this.add(scroll);

    this.revalidate();
    this.repaint();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RellenoImagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> listaCursos2;
    // End of variables declaration//GEN-END:variables

    public Profesor getProfesorActual() {
        return profesorActual;
    }

    public void setProfesorActual(Profesor profesorActual) {
        this.profesorActual = profesorActual;
    }
}
