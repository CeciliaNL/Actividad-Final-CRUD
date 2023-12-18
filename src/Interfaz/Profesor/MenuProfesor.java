package Interfaz.Profesor;

import Entidades.Profesor;
import Interfaz.Inicio;
import Servicios.ServicioProfesor;

import javax.swing.JPanel;

/**
 *
 * @author Cecilia
 */
public class MenuProfesor extends javax.swing.JFrame {

    private Profesor profesorActual;

    BienvenidaProfe menuDeBienvenidaPanel = new BienvenidaProfe();
    DatosPersonalesProfesor datosPersonales = new DatosPersonalesProfesor();
    MisCursosMateriasProfesor misCursosMateriasProfesor = new MisCursosMateriasProfesor();
    EstudiantesProfesor estudiantesProfesor = new EstudiantesProfesor();
    ModificarDatosProfesor modificarDatosProfesor = new ModificarDatosProfesor();
     JPanel jpanelActual = null;

    public MenuProfesor() {
        initComponents();

        PanelBotonesProfe.add(menuDeBienvenidaPanel);
        menuDeBienvenidaPanel.setVisible(true);
       jpanelActual = menuDeBienvenidaPanel;
    }

    public Profesor getProfesorActual() {
        return profesorActual;
    }

    public void setProfesorActual(Profesor profesorActual) {
        this.profesorActual = profesorActual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBienvenido = new javax.swing.JPanel();
        PanelBotonesProfe = new javax.swing.JPanel();
        BarraVertical = new javax.swing.JLabel();
        LabelIDRA = new javax.swing.JLabel();
        BotonDatosPersonales = new javax.swing.JButton();
        BotonMisCursosMaterias = new javax.swing.JButton();
        BotonEstudiantes = new javax.swing.JButton();
        BotonEditarMisDatos = new javax.swing.JButton();
        BotonCerrarSesion = new javax.swing.JButton();
        FondoBotones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelBienvenido.setLayout(null);

        PanelBotonesProfe.setLayout(new java.awt.BorderLayout());
        PanelBienvenido.add(PanelBotonesProfe);
        PanelBotonesProfe.setBounds(250, 0, 750, 800);

        BarraVertical.setBackground(new java.awt.Color(0, 0, 102));
        BarraVertical.setForeground(new java.awt.Color(0, 0, 102));
        BarraVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/BarrarOscura.jpg"))); // NOI18N
        PanelBienvenido.add(BarraVertical);
        BarraVertical.setBounds(240, 0, 10, 800);

        LabelIDRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IDRA MENUS.png"))); // NOI18N
        PanelBienvenido.add(LabelIDRA);
        LabelIDRA.setBounds(20, 20, 220, 150);

        BotonDatosPersonales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraDatosPersonales2.jpg"))); // NOI18N
        BotonDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDatosPersonalesActionPerformed(evt);
            }
        });
        PanelBienvenido.add(BotonDatosPersonales);
        BotonDatosPersonales.setBounds(0, 210, 240, 50);

        BotonMisCursosMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraMisCursosMaterias.jpg"))); // NOI18N
        BotonMisCursosMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMisCursosMateriasActionPerformed(evt);
            }
        });
        PanelBienvenido.add(BotonMisCursosMaterias);
        BotonMisCursosMaterias.setBounds(0, 300, 240, 50);

        BotonEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraEstudiantes.jpg"))); // NOI18N
        BotonEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstudiantesActionPerformed(evt);
            }
        });
        PanelBienvenido.add(BotonEstudiantes);
        BotonEstudiantes.setBounds(0, 390, 240, 50);

        BotonEditarMisDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraEditarMisDatos.jpg"))); // NOI18N
        BotonEditarMisDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarMisDatosActionPerformed(evt);
            }
        });
        PanelBienvenido.add(BotonEditarMisDatos);
        BotonEditarMisDatos.setBounds(0, 490, 240, 40);

        BotonCerrarSesion.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        BotonCerrarSesion.setForeground(new java.awt.Color(0, 0, 102));
        BotonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraCierre.jpg"))); // NOI18N
        BotonCerrarSesion.setPreferredSize(new java.awt.Dimension(250, 48));
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });
        PanelBienvenido.add(BotonCerrarSesion);
        BotonCerrarSesion.setBounds(10, 650, 110, 30);

        FondoBotones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/REGISTRO.jpg"))); // NOI18N
        FondoBotones.setToolTipText("");
        PanelBienvenido.add(FondoBotones);
        FondoBotones.setBounds(0, 0, 1000, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDatosPersonalesActionPerformed

        jpanelActual.setVisible(false);
        PanelBotonesProfe.add(datosPersonales);
        datosPersonales.setVisible(true);
        jpanelActual = datosPersonales;
        ServicioProfesor servicioProfesor = new ServicioProfesor();
        servicioProfesor.loginProfesor(profesorActual.getNombreUsuario());
        profesorActual = servicioProfesor.getProfesor();
        datosPersonales.rellenarDatos(profesorActual);
    }//GEN-LAST:event_BotonDatosPersonalesActionPerformed

    private void BotonMisCursosMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMisCursosMateriasActionPerformed
jpanelActual.setVisible(false);

MisCursosMateriasProfesor misCursosMateriasProfesor = new MisCursosMateriasProfesor();

PanelBotonesProfe.add(misCursosMateriasProfesor);
misCursosMateriasProfesor.setProfesorActual(profesorActual);
jpanelActual = misCursosMateriasProfesor;
misCursosMateriasProfesor.setVisible(true);

    }//GEN-LAST:event_BotonMisCursosMateriasActionPerformed

    private void BotonEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstudiantesActionPerformed
    jpanelActual.setVisible(false);

EstudiantesProfesor estudiantesProfesor = new EstudiantesProfesor();

PanelBotonesProfe.add(estudiantesProfesor);
estudiantesProfesor.setProfesorActual(profesorActual);
jpanelActual = estudiantesProfesor;
estudiantesProfesor.setVisible(true);
    }//GEN-LAST:event_BotonEstudiantesActionPerformed

    private void BotonEditarMisDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarMisDatosActionPerformed
jpanelActual.setVisible(false);
ModificarDatosProfesor modificarDatosProfesor = new ModificarDatosProfesor();

PanelBotonesProfe.add(modificarDatosProfesor);
modificarDatosProfesor.setProfesorActual(profesorActual);
jpanelActual = modificarDatosProfesor;
modificarDatosProfesor.setVisible(true);
    }//GEN-LAST:event_BotonEditarMisDatosActionPerformed

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        Inicio inicio = new Inicio();
        inicio.setLocationRelativeTo(null);
        inicio.setSize(1000, 800);
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraVertical;
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonDatosPersonales;
    private javax.swing.JButton BotonEditarMisDatos;
    private javax.swing.JButton BotonEstudiantes;
    private javax.swing.JButton BotonMisCursosMaterias;
    private javax.swing.JLabel FondoBotones;
    private javax.swing.JLabel LabelIDRA;
    private javax.swing.JPanel PanelBienvenido;
    private javax.swing.JPanel PanelBotonesProfe;
    // End of variables declaration//GEN-END:variables
}
