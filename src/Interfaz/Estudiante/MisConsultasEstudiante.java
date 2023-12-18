
package Interfaz.Estudiante;

import Entidades.Estudiante;
import Entidades.Materia;
import Entidades.Profesor;
import Servicios.EstudianteTableModel;
import Servicios.MateriaTableModel;
import Servicios.ProfesorTableModel;
import Servicios.ServicioEstudiante;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;


/**
 *
 * @author Cecilia
 */
public class MisConsultasEstudiante extends javax.swing.JPanel {
Estudiante estudianteActual = new Estudiante();
ServicioEstudiante servicioEstudiante ;
 
    public MisConsultasEstudiante() {
        initComponents();
    servicioEstudiante = new ServicioEstudiante();
    }

    public void setEstudianteActual(Estudiante estudianteActual) {
        this.estudianteActual = estudianteActual;
    }
    
    public void buscador(){
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        misMaterias = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        misCompaIcono = new javax.swing.JLabel();
        misProfesoresIco = new javax.swing.JLabel();
        misMateriasIcon = new javax.swing.JLabel();
        RellenoImagen = new javax.swing.JLabel();
        FondoBienvenido = new javax.swing.JLabel();

        setLayout(null);

        misMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BotonConsultasMisMaterias.png"))); // NOI18N
        misMaterias.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        misMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misMateriasActionPerformed(evt);
            }
        });
        add(misMaterias);
        misMaterias.setBounds(80, 100, 120, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BotonConsultas.MisCompas.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(290, 100, 120, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BotonConsultas.MisProfesores.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(520, 100, 120, 40);

        misCompaIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/companeros.png"))); // NOI18N
        add(misCompaIcono);
        misCompaIcono.setBounds(320, 20, 70, 70);

        misProfesoresIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Profesores.png"))); // NOI18N
        add(misProfesoresIco);
        misProfesoresIco.setBounds(550, 20, 70, 70);

        misMateriasIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Materias.png"))); // NOI18N
        add(misMateriasIcon);
        misMateriasIcon.setBounds(110, 20, 70, 70);

        RellenoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/consultas-bannser.jpg"))); // NOI18N
        add(RellenoImagen);
        RellenoImagen.setBounds(180, 580, 390, 200);

        FondoBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/BienvenidoMenu.jpg"))); // NOI18N
        add(FondoBienvenido);
        FondoBienvenido.setBounds(0, 0, 750, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void misMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misMateriasActionPerformed
ArrayList <Materia> materias = new ArrayList<>(servicioEstudiante.Buscador(estudianteActual, 1));
        MateriaTableModel modelo = new MateriaTableModel(materias);
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(10,160,730,400);
        this.add(scroll); 
        this.revalidate();
    }//GEN-LAST:event_misMateriasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
ArrayList <Estudiante> estudiantes = new ArrayList<>(servicioEstudiante.Buscador(estudianteActual, 2));
        EstudianteTableModel modelo = new EstudianteTableModel(estudiantes);
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(10,160,730,400);
        this.add(scroll); 
        this.revalidate();
        
      
    
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          
ArrayList <Profesor> profesores = new ArrayList<>(servicioEstudiante.Buscador(estudianteActual, 3));
        ProfesorTableModel modelo = new ProfesorTableModel(profesores);
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(10,160,730,400);
        this.add(scroll); 
        this.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoBienvenido;
    private javax.swing.JLabel RellenoImagen;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel misCompaIcono;
    private javax.swing.JButton misMaterias;
    private javax.swing.JLabel misMateriasIcon;
    private javax.swing.JLabel misProfesoresIco;
    // End of variables declaration//GEN-END:variables
}
