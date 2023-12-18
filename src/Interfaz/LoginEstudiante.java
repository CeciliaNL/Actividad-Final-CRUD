package Interfaz;


import Interfaz.Estudiante.MenuEstudiante;
import Servicios.ServicioEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author Cecilia
 */
public class LoginEstudiante extends javax.swing.JFrame {

   
    public LoginEstudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1000,800);
           CompletarUsuarioEstudiante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                BotonIngresarEstudianteActionPerformed(e);
            }
        });
           
              CompletarContrasenaEstudiante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                BotonIngresarEstudianteActionPerformed(e);
            }
        });
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonVolver = new javax.swing.JButton();
        IconoEstudiante = new javax.swing.JLabel();
        UsuarioEstudiante = new javax.swing.JLabel();
        CompletarUsuarioEstudiante = new javax.swing.JTextField();
        ContrasenaEstudiante = new javax.swing.JLabel();
        CompletarContrasenaEstudiante = new javax.swing.JPasswordField();
        BotonIngresarEstudiante = new javax.swing.JButton();
        RegistrarEstudiante = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));
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

        IconoEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ESTUDIANTE.png"))); // NOI18N
        jPanel1.add(IconoEstudiante);
        IconoEstudiante.setBounds(400, 80, 250, 190);

        UsuarioEstudiante.setBackground(new java.awt.Color(204, 204, 255));
        UsuarioEstudiante.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        UsuarioEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        UsuarioEstudiante.setText("USUARIO");
        jPanel1.add(UsuarioEstudiante);
        UsuarioEstudiante.setBounds(380, 310, 92, 28);

        CompletarUsuarioEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        CompletarUsuarioEstudiante.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        CompletarUsuarioEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        CompletarUsuarioEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompletarUsuarioEstudianteActionPerformed(evt);
            }
        });
        CompletarUsuarioEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CompletarUsuarioEstudianteKeyPressed(evt);
            }
        });
        jPanel1.add(CompletarUsuarioEstudiante);
        CompletarUsuarioEstudiante.setBounds(380, 340, 260, 40);

        ContrasenaEstudiante.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        ContrasenaEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        ContrasenaEstudiante.setText("CONTRASEÑA");
        jPanel1.add(ContrasenaEstudiante);
        ContrasenaEstudiante.setBounds(380, 400, 111, 28);

        CompletarContrasenaEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        CompletarContrasenaEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        CompletarContrasenaEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompletarContrasenaEstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(CompletarContrasenaEstudiante);
        CompletarContrasenaEstudiante.setBounds(380, 430, 260, 40);

        BotonIngresarEstudiante.setBackground(new java.awt.Color(153, 153, 255));
        BotonIngresarEstudiante.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        BotonIngresarEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        BotonIngresarEstudiante.setText("INGRESAR");
        BotonIngresarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarEstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(BotonIngresarEstudiante);
        BotonIngresarEstudiante.setBounds(520, 510, 119, 34);

        RegistrarEstudiante.setBackground(new java.awt.Color(153, 153, 255));
        RegistrarEstudiante.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        RegistrarEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        RegistrarEstudiante.setText("Registrate aquí");
        RegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarEstudiante);
        RegistrarEstudiante.setBounds(40, 735, 162, 29);

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

    private void BotonIngresarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarEstudianteActionPerformed
ServicioEstudiante servicioEstudiante = new ServicioEstudiante();

MenuEstudiante menuEstudiante = new MenuEstudiante();

 int flag = servicioEstudiante.validarUsuario(CompletarUsuarioEstudiante.getText(), CompletarContrasenaEstudiante.getText());
     
       if (flag == 2){
           menuEstudiante.setVisible(true);
           menuEstudiante.setLocationRelativeTo(this);
           menuEstudiante.setSize(1000,800);
           menuEstudiante.setEstudianteActual(servicioEstudiante.getEstudiante());
           this.dispose();
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
    }//GEN-LAST:event_BotonIngresarEstudianteActionPerformed

    private void RegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEstudianteActionPerformed
         RegistroUsuarioEstudiante registroUsuarioEstudiante = new RegistroUsuarioEstudiante();
       registroUsuarioEstudiante.setVisible(true);
       registroUsuarioEstudiante.setLocationRelativeTo(null);
       registroUsuarioEstudiante.setSize(1000,800);
       this.dispose();
       
    }//GEN-LAST:event_RegistrarEstudianteActionPerformed

    private void CompletarUsuarioEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CompletarUsuarioEstudianteKeyPressed
      
    }//GEN-LAST:event_CompletarUsuarioEstudianteKeyPressed

    private void CompletarUsuarioEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompletarUsuarioEstudianteActionPerformed
  
    }//GEN-LAST:event_CompletarUsuarioEstudianteActionPerformed

    private void CompletarContrasenaEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompletarContrasenaEstudianteActionPerformed
   
    }//GEN-LAST:event_CompletarContrasenaEstudianteActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresarEstudiante;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPasswordField CompletarContrasenaEstudiante;
    private javax.swing.JTextField CompletarUsuarioEstudiante;
    private javax.swing.JLabel ContrasenaEstudiante;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel IconoEstudiante;
    private javax.swing.JButton RegistrarEstudiante;
    private javax.swing.JLabel UsuarioEstudiante;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
