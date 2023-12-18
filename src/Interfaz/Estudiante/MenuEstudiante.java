package Interfaz.Estudiante;


import Entidades.Estudiante;
import Interfaz.Inicio;
import Servicios.ServicioEstudiante;

import javax.swing.JPanel;

/**
 *
 * @author Cecilia
 */
public class MenuEstudiante extends javax.swing.JFrame {

    private Estudiante estudianteActual;

 
Bienvenida menuDeBienvenidaPanel = new Bienvenida();
DatosPersonalesEstudiante datosPersonales = new DatosPersonalesEstudiante();
MisConsultasEstudiante misConsultasEstudiante = new MisConsultasEstudiante();
ModificarDatosEstudiante modificarDatosEstudiante = new ModificarDatosEstudiante();
InstitucionEstudiante institucionEstudiante = new InstitucionEstudiante();
Contacto contacto = new Contacto();
     
    public MenuEstudiante() {
        initComponents();
        
        PanelBotones.add(menuDeBienvenidaPanel);
        menuDeBienvenidaPanel.setVisible(true);

    }

    public Estudiante getEstudianteActual() {
        return estudianteActual;
    }

    public void setEstudianteActual(Estudiante estudianteActual) {
        this.estudianteActual = estudianteActual;
    }
    



     public JPanel ValidarMenu() {
         JPanel jpanelActual = null;

if (menuDeBienvenidaPanel.isVisible()){
    jpanelActual= menuDeBienvenidaPanel;
    } else if (datosPersonales.isVisible()){
        jpanelActual = datosPersonales;
    } else if (misConsultasEstudiante.isVisible()){
        jpanelActual = misConsultasEstudiante;
    } else if (modificarDatosEstudiante.isVisible()){
        jpanelActual = modificarDatosEstudiante;
    } else if (institucionEstudiante.isVisible()){
        jpanelActual = institucionEstudiante;
    } else if (contacto.isVisible()){
        jpanelActual= contacto;
    }
     
    return jpanelActual;
     }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBienvenido = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();
        BarraVertical = new javax.swing.JLabel();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        BotonCerrarSesion = new javax.swing.JButton();
        LabelIDRA = new javax.swing.JLabel();
        FondoBotones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelBienvenido.setLayout(null);

        PanelBotones.setLayout(new java.awt.BorderLayout());
        PanelBienvenido.add(PanelBotones);
        PanelBotones.setBounds(250, 0, 750, 800);

        BarraVertical.setBackground(new java.awt.Color(0, 0, 102));
        BarraVertical.setForeground(new java.awt.Color(0, 0, 102));
        BarraVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/BarrarOscura.jpg"))); // NOI18N
        PanelBienvenido.add(BarraVertical);
        BarraVertical.setBounds(240, 0, 10, 800);

        Boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraDatosPersonales2.jpg"))); // NOI18N
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        PanelBienvenido.add(Boton1);
        Boton1.setBounds(0, 220, 240, 50);

        Boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraMisConsultas.jpg"))); // NOI18N
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        PanelBienvenido.add(Boton2);
        Boton2.setBounds(0, 280, 240, 50);

        Boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraEditarMisDatos.jpg"))); // NOI18N
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        PanelBienvenido.add(Boton3);
        Boton3.setBounds(0, 340, 240, 50);

        Boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraInstitucion.jpg"))); // NOI18N
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        PanelBienvenido.add(Boton4);
        Boton4.setBounds(0, 400, 240, 50);

        Boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraContacto.jpg"))); // NOI18N
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        PanelBienvenido.add(Boton5);
        Boton5.setBounds(0, 460, 240, 48);

        BotonCerrarSesion.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        BotonCerrarSesion.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        BotonCerrarSesion.setForeground(new java.awt.Color(0, 0, 102));
        BotonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BarraCierre.jpg"))); // NOI18N
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });
        PanelBienvenido.add(BotonCerrarSesion);
        BotonCerrarSesion.setBounds(10, 680, 110, 30);

        LabelIDRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IDRA MENUS.png"))); // NOI18N
        PanelBienvenido.add(LabelIDRA);
        LabelIDRA.setBounds(20, 20, 220, 150);

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

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        ValidarMenu().setVisible(false);
        PanelBotones.add(datosPersonales);
       datosPersonales.setVisible(true);
        ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
        servicioEstudiante.loginEstudiante(estudianteActual.getNombreUsuario());
        estudianteActual = servicioEstudiante.getEstudiante();
       datosPersonales.rellenarDatos(estudianteActual);

   

    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
     ValidarMenu().setVisible(false);
     PanelBotones.add(contacto);
     contacto.setVisible(true);
    }//GEN-LAST:event_Boton5ActionPerformed

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
Inicio inicio = new Inicio();
inicio.setVisible(true);
inicio.setLocationRelativeTo(null);
this.dispose();
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        ValidarMenu().setVisible(false);
        PanelBotones.add(misConsultasEstudiante);
        misConsultasEstudiante.setVisible(true);
        misConsultasEstudiante.setEstudianteActual(estudianteActual);
        
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
     ValidarMenu().setVisible(false);
     PanelBotones.add(modificarDatosEstudiante);
     modificarDatosEstudiante.setVisible(true);
     modificarDatosEstudiante.setEstudianteActual(estudianteActual);
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
     ValidarMenu().setVisible(false);
     PanelBotones.add(institucionEstudiante);
     institucionEstudiante.setVisible(true);

    }//GEN-LAST:event_Boton4ActionPerformed

    

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraVertical;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JLabel FondoBotones;
    private javax.swing.JLabel LabelIDRA;
    private javax.swing.JPanel PanelBienvenido;
    private javax.swing.JPanel PanelBotones;
    // End of variables declaration//GEN-END:variables
}
