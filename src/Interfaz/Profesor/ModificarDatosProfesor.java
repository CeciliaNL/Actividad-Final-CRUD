
package Interfaz.Profesor;



import Entidades.Profesor;
import Interfaz.Inicio;
import Servicios.ServicioProfesor;
import javax.swing.JOptionPane;

/**
 *
 * @author Cecilia
 */
public class ModificarDatosProfesor extends javax.swing.JPanel {
    private Profesor profesorActual;

    public ModificarDatosProfesor() {
        initComponents();
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelEditarDatos = new javax.swing.JLabel();
        LabelModificarTelefono = new javax.swing.JLabel();
        SeparatorNuevoTelefono = new javax.swing.JSeparator();
        LabelModificarEmail = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        FondoBienvenido = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(null);

        LabelEditarDatos.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        LabelEditarDatos.setForeground(new java.awt.Color(0, 0, 102));
        LabelEditarDatos.setText("MODIFICAR MIS DATOS");
        jPanel1.add(LabelEditarDatos);
        LabelEditarDatos.setBounds(60, 100, 710, 80);

        LabelModificarTelefono.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        LabelModificarTelefono.setForeground(new java.awt.Color(0, 0, 102));
        LabelModificarTelefono.setText("NUEVO TELEFONO:");
        jPanel1.add(LabelModificarTelefono);
        LabelModificarTelefono.setBounds(100, 280, 210, 30);
        jPanel1.add(SeparatorNuevoTelefono);
        SeparatorNuevoTelefono.setBounds(310, 310, 300, 10);

        LabelModificarEmail.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        LabelModificarEmail.setForeground(new java.awt.Color(0, 0, 102));
        LabelModificarEmail.setText("NUEVO EMAIL:");
        jPanel1.add(LabelModificarEmail);
        LabelModificarEmail.setBounds(100, 430, 180, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(310, 450, 310, 10);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 560, 150, 40);

        email.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.add(email);
        email.setBounds(310, 420, 300, 30);

        telefono.setBackground(new java.awt.Color(153, 255, 255));
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(telefono);
        telefono.setBounds(310, 280, 300, 30);

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Eliminar Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 740, 220, 40);

        FondoBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/BienvenidoMenu.jpg"))); // NOI18N
        jPanel1.add(FondoBienvenido);
        FondoBienvenido.setBounds(0, 0, 750, 800);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   boolean flag = false;
        if (telefono.getText().contains(" ") ||telefono.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Número vacio o incorrecto");     
        flag = true;
    } else if (!validarNumero(telefono.getText())) {
        JOptionPane.showMessageDialog(null, "El teléfono debe contener solo números");
         flag = true;
    } else if (email.getText().isEmpty() || email.getText().contains(" ")){
        JOptionPane.showMessageDialog(null, "Email vacio o incorrecto");
        flag = true;
    }
        if (!flag){
            ServicioProfesor servicioProfesor = new ServicioProfesor();
            Long telefonoLong = Long.valueOf(telefono.getText());
            servicioProfesor.actualizarDatos(profesorActual.getNombreUsuario() , email.getText(), telefonoLong);
            
            JOptionPane.showMessageDialog(null, "Datos modificados");
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ServicioProfesor servicioProfesor = new ServicioProfesor();
        try {
            servicioProfesor.eliminarProfesor(profesorActual.getNombreUsuario());
            JOptionPane.showMessageDialog(null, "Usuario Eliminado con éxito");
            Inicio inicio = new Inicio();

            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null);
            inicio.setSize(1000,800);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static boolean validarNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoBienvenido;
    private javax.swing.JLabel LabelEditarDatos;
    private javax.swing.JLabel LabelModificarEmail;
    private javax.swing.JLabel LabelModificarTelefono;
    private javax.swing.JSeparator SeparatorNuevoTelefono;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables

    public void setProfesorActual(Profesor profesorActual) {
        this.profesorActual = profesorActual;
    }
}
