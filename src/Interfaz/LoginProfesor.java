package Interfaz;

import Interfaz.Profesor.MenuProfesor;

import Servicios.ServicioProfesor;



/**
 *
 * @author Cecilia
 */
public class LoginProfesor extends javax.swing.JFrame{
    

   
    public LoginProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonVolver = new javax.swing.JButton();
        IconoProfesor = new javax.swing.JLabel();
        UsuarioProfesor = new javax.swing.JLabel();
        CompletarUsuarioProfesor = new javax.swing.JTextField();
        ContrasenaProfesor = new javax.swing.JLabel();
        CompletarContrasenaProfesor = new javax.swing.JPasswordField();
        BotonIngresarProfesor = new javax.swing.JButton();
        RegistrarProfesor = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        BotonVolver.setBackground(new java.awt.Color(153, 153, 255));
        BotonVolver.setForeground(new java.awt.Color(153, 153, 255));
        BotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/VOLVER.png"))); // NOI18N
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver);
        BotonVolver.setBounds(6, 6, 56, 40);

        IconoProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PROFESOR.png"))); // NOI18N
        jPanel1.add(IconoProfesor);
        IconoProfesor.setBounds(390, 40, 220, 300);

        UsuarioProfesor.setBackground(new java.awt.Color(204, 204, 255));
        UsuarioProfesor.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        UsuarioProfesor.setForeground(new java.awt.Color(0, 0, 102));
        UsuarioProfesor.setText("USUARIO");
        jPanel1.add(UsuarioProfesor);
        UsuarioProfesor.setBounds(370, 340, 92, 28);

        CompletarUsuarioProfesor.setBackground(new java.awt.Color(255, 255, 255));
        CompletarUsuarioProfesor.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        CompletarUsuarioProfesor.setForeground(new java.awt.Color(0, 0, 102));
        CompletarUsuarioProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompletarUsuarioProfesorActionPerformed(evt);
            }
        });
        jPanel1.add(CompletarUsuarioProfesor);
        CompletarUsuarioProfesor.setBounds(370, 370, 270, 40);

        ContrasenaProfesor.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        ContrasenaProfesor.setForeground(new java.awt.Color(0, 0, 102));
        ContrasenaProfesor.setText("CONTRASEÑA");
        jPanel1.add(ContrasenaProfesor);
        ContrasenaProfesor.setBounds(370, 440, 111, 28);

        CompletarContrasenaProfesor.setBackground(new java.awt.Color(255, 255, 255));
        CompletarContrasenaProfesor.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.add(CompletarContrasenaProfesor);
        CompletarContrasenaProfesor.setBounds(370, 470, 270, 40);

        BotonIngresarProfesor.setBackground(new java.awt.Color(153, 153, 255));
        BotonIngresarProfesor.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        BotonIngresarProfesor.setForeground(new java.awt.Color(0, 0, 102));
        BotonIngresarProfesor.setText("INGRESAR");
        BotonIngresarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarProfesorActionPerformed(evt);
            }
        });
        jPanel1.add(BotonIngresarProfesor);
        BotonIngresarProfesor.setBounds(520, 550, 119, 34);

        RegistrarProfesor.setBackground(new java.awt.Color(153, 153, 255));
        RegistrarProfesor.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        RegistrarProfesor.setForeground(new java.awt.Color(0, 0, 102));
        RegistrarProfesor.setText("Registrate aquí");
        RegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarProfesorActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarProfesor);
        RegistrarProfesor.setBounds(40, 735, 162, 29);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/REGISTRO.jpg"))); // NOI18N
        jPanel1.add(Fondo);
        Fondo.setBounds(0, 0, 1000, 800);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
       Inicio inicio = new Inicio();
       inicio.setSize(1000,800);
       this.dispose();
       inicio.setVisible(true);
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void CompletarUsuarioProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompletarUsuarioProfesorActionPerformed

    }//GEN-LAST:event_CompletarUsuarioProfesorActionPerformed

    private void BotonIngresarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarProfesorActionPerformed
 
        
        ServicioProfesor servicioProfesor = new ServicioProfesor();
        MenuProfesor menuProfesor = new MenuProfesor();
        int flag = servicioProfesor.validarUsuario(CompletarUsuarioProfesor.getText(), CompletarContrasenaProfesor.getText());
     
       if (flag == 2){
           menuProfesor.setVisible(true);
           menuProfesor.setLocationRelativeTo(null);
           menuProfesor.setSize(1000,800);
           this.dispose();
           menuProfesor.setProfesorActual(servicioProfesor.getProfesor());
           
       } else {
          PopUp popUp = new PopUp();
          popUp.setSize(379, 185);
          popUp.setVisible(true);
          popUp.setLocationRelativeTo(null);
          if (flag == 0){
              popUp.textoPopUp("USUARIO INCORRECTO");
          } else if (flag == 1){
              popUp.textoPopUp("CONTRASEÑA INCORRECTA");
          }
          
       }
        
    }//GEN-LAST:event_BotonIngresarProfesorActionPerformed

    private void RegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarProfesorActionPerformed
         RegistroUsuarioProfesor registroUsuarioProfesor = new RegistroUsuarioProfesor();
         registroUsuarioProfesor.setSize(1000, 800);
         registroUsuarioProfesor.setLocationRelativeTo(null);
         this.dispose();
         registroUsuarioProfesor.setVisible(true);
         
    }//GEN-LAST:event_RegistrarProfesorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresarProfesor;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPasswordField CompletarContrasenaProfesor;
    private javax.swing.JTextField CompletarUsuarioProfesor;
    private javax.swing.JLabel ContrasenaProfesor;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel IconoProfesor;
    private javax.swing.JButton RegistrarProfesor;
    private javax.swing.JLabel UsuarioProfesor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
