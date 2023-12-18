package Interfaz;

import Entidades.Estudiante;
import Servicios.ServicioEstudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author Cecilia
 */
public class RegistroUsuarioEstudiante extends javax.swing.JFrame {

    boolean buleano = false;

    public RegistroUsuarioEstudiante() {
        initComponents();

        NombreDeUsuario.setBackground(new java.awt.Color(0, 0, 0, 1));
        TextPrompt textpromp = new TextPrompt("NOMBRE DE USUARIO", NombreDeUsuario);
        Contrasena.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("CONTRASEÑA", Contrasena);
        Nombre.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("NOMBRE", Nombre);
        Apellido.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("APELLIDO", Apellido);
        Dni.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("DNI", Dni);
        Telefono.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("TELEFONO DE CONTACTO", Telefono);
        Email.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("EMAIL", Email);
        Curso.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("CURSO", Curso);
        NombreYApellidoTutor.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("NOMBRE Y APELLIDO DE TUTOR", NombreYApellidoTutor);

    }

    public void popUp(String mensaje) {
        PopUp popUp = new PopUp();
        popUp.setSize(379, 185);
        popUp.setVisible(true);
        popUp.setLocationRelativeTo(null);
        popUp.textoPopUp(mensaje);
        buleano = true;
    }

    public static boolean validarNumero(String numero) {
        try {
            Double.parseDouble(numero);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    public void validarFormulario() {
        if (NombreDeUsuario.getText().isEmpty()|| NombreDeUsuario.getText().contains(" ")) {
            popUp("Usuario vacio o con espacios!");

        } else if (Contrasena.getText().contains(" ") || Contrasena.getText().isEmpty()) {
            popUp("Contaseña con espacios o vacia");

        } else if (Contrasena.getText().length() < 4 || Contrasena.getText().length() > 10) {
            popUp("La contraseña debe ser entre 4 y 10 ");

        } else if (Apellido.getText().isEmpty()) {
            popUp(" Apellido vacio !");

        } else if (Nombre.getText().isEmpty()) {
            popUp("Nombre Vacio");

        } else if (Dni.getText().contains(" ") || Dni.getText().isEmpty()) {
            popUp("Dni vacio O con espacios");
        } else if (Telefono.getText().contains(" ") || Telefono.getText().isEmpty()) {
            popUp(" Telefono Vacio o con espacios");
        } else if (Email.getText().contains(" ")|| Email.getText().isEmpty()) {
            popUp("Email vacio o con espacios");
        } else if (Curso.getText().contains(" ") || Curso.getText().isEmpty()) {
            popUp("Email vacio o con espacios");
        } else if (NombreYApellidoTutor.getText().isEmpty() || NombreYApellidoTutor.getText().isEmpty()) {
            popUp("Tutor Vacio");
        } else if (validarNumero(Telefono.getText() )){
            popUp("Telefono ingresar numeros");
        } else if (validarNumero(Dni.getText())){
            popUp("dni infgresar numeros");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelIcono = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        SeparatorNombreDeUsuario = new javax.swing.JSeparator();
        NombreDeUsuario = new javax.swing.JTextField();
        SeparatorContrasena = new javax.swing.JSeparator();
        SeparatorNombre = new javax.swing.JSeparator();
        Nombre = new javax.swing.JTextField();
        SeparatorApellido = new javax.swing.JSeparator();
        Apellido = new javax.swing.JTextField();
        SeparatorDni = new javax.swing.JSeparator();
        Dni = new javax.swing.JTextField();
        SeparatorTelefono = new javax.swing.JSeparator();
        Telefono = new javax.swing.JTextField();
        SeparatorEmail = new javax.swing.JSeparator();
        Email = new javax.swing.JTextField();
        SeparatorCurso = new javax.swing.JSeparator();
        Curso = new javax.swing.JTextField();
        SeparatorNombreYApellidoTutor = new javax.swing.JSeparator();
        NombreYApellidoTutor = new javax.swing.JTextField();
        LabelColumna = new javax.swing.JLabel();
        BotonAceptar = new javax.swing.JButton();
        Contrasena = new javax.swing.JPasswordField();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        LabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/avatar.png"))); // NOI18N
        jPanel1.add(LabelIcono);
        LabelIcono.setBounds(210, 170, 100, 100);

        LabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/RegistroUsuarioEstudiante.png"))); // NOI18N
        jPanel1.add(LabelTitulo);
        LabelTitulo.setBounds(250, 50, 520, 90);

        BotonVolver.setBackground(new java.awt.Color(102, 102, 255));
        BotonVolver.setForeground(new java.awt.Color(102, 102, 255));
        BotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/VOLVER.png"))); // NOI18N
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver);
        BotonVolver.setBounds(20, 20, 70, 50);
        jPanel1.add(SeparatorNombreDeUsuario);
        SeparatorNombreDeUsuario.setBounds(110, 340, 310, 20);

        NombreDeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        NombreDeUsuario.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        NombreDeUsuario.setForeground(new java.awt.Color(153, 153, 153));
        NombreDeUsuario.setBorder(null);
        NombreDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreDeUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(NombreDeUsuario);
        NombreDeUsuario.setBounds(110, 320, 310, 20);
        jPanel1.add(SeparatorContrasena);
        SeparatorContrasena.setBounds(110, 400, 310, 10);
        jPanel1.add(SeparatorNombre);
        SeparatorNombre.setBounds(110, 460, 310, 10);

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(153, 153, 153));
        Nombre.setBorder(null);
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre);
        Nombre.setBounds(110, 440, 310, 20);
        jPanel1.add(SeparatorApellido);
        SeparatorApellido.setBounds(110, 520, 310, 10);

        Apellido.setBackground(new java.awt.Color(255, 255, 255));
        Apellido.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        Apellido.setForeground(new java.awt.Color(153, 153, 153));
        Apellido.setBorder(null);
        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(Apellido);
        Apellido.setBounds(110, 500, 310, 20);
        jPanel1.add(SeparatorDni);
        SeparatorDni.setBounds(110, 580, 310, 10);

        Dni.setBackground(new java.awt.Color(255, 255, 255));
        Dni.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        Dni.setForeground(new java.awt.Color(153, 153, 153));
        Dni.setBorder(null);
        Dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DniActionPerformed(evt);
            }
        });
        jPanel1.add(Dni);
        Dni.setBounds(110, 560, 310, 20);
        jPanel1.add(SeparatorTelefono);
        SeparatorTelefono.setBounds(590, 338, 310, 2);

        Telefono.setBackground(new java.awt.Color(255, 255, 255));
        Telefono.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        Telefono.setForeground(new java.awt.Color(153, 153, 153));
        Telefono.setBorder(null);
        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(Telefono);
        Telefono.setBounds(590, 320, 310, 20);
        jPanel1.add(SeparatorEmail);
        SeparatorEmail.setBounds(590, 400, 310, 10);

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setBorder(null);
        jPanel1.add(Email);
        Email.setBounds(590, 380, 310, 20);
        jPanel1.add(SeparatorCurso);
        SeparatorCurso.setBounds(590, 460, 310, 10);

        Curso.setBackground(new java.awt.Color(255, 255, 255));
        Curso.setBorder(null);
        Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CursoActionPerformed(evt);
            }
        });
        jPanel1.add(Curso);
        Curso.setBounds(590, 440, 310, 20);
        jPanel1.add(SeparatorNombreYApellidoTutor);
        SeparatorNombreYApellidoTutor.setBounds(590, 520, 310, 10);

        NombreYApellidoTutor.setBackground(new java.awt.Color(255, 255, 255));
        NombreYApellidoTutor.setBorder(null);
        NombreYApellidoTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreYApellidoTutorActionPerformed(evt);
            }
        });
        jPanel1.add(NombreYApellidoTutor);
        NombreYApellidoTutor.setBounds(590, 500, 310, 20);

        LabelColumna.setBackground(new java.awt.Color(0, 0, 102));
        LabelColumna.setForeground(new java.awt.Color(0, 0, 102));
        LabelColumna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SeparadorVertical.png"))); // NOI18N
        jPanel1.add(LabelColumna);
        LabelColumna.setBounds(500, 170, 10, 440);

        BotonAceptar.setBackground(new java.awt.Color(102, 102, 255));
        BotonAceptar.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        BotonAceptar.setForeground(new java.awt.Color(0, 0, 102));
        BotonAceptar.setText("ACEPTAR");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAceptar);
        BotonAceptar.setBounds(780, 580, 120, 40);

        Contrasena.setBackground(new java.awt.Color(255, 255, 255));
        Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaActionPerformed(evt);
            }
        });
        Contrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContrasenaKeyPressed(evt);
            }
        });
        jPanel1.add(Contrasena);
        Contrasena.setBounds(110, 380, 310, 20);

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/REGISTRO.jpg"))); // NOI18N
        jPanel1.add(LabelFondo);
        LabelFondo.setBounds(0, 0, 1000, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DniActionPerformed

    }//GEN-LAST:event_DniActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed

    }//GEN-LAST:event_ApellidoActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed

    }//GEN-LAST:event_NombreActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed

    }//GEN-LAST:event_TelefonoActionPerformed

    private void NombreDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreDeUsuarioActionPerformed


    }//GEN-LAST:event_NombreDeUsuarioActionPerformed

    private void NombreYApellidoTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreYApellidoTutorActionPerformed

    }//GEN-LAST:event_NombreYApellidoTutorActionPerformed

    private void CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CursoActionPerformed

    }//GEN-LAST:event_CursoActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        LoginEstudiante loginEstudiante = new LoginEstudiante();
        loginEstudiante.setSize(1000, 800);
        loginEstudiante.setLocationRelativeTo(null);
        this.dispose();
        loginEstudiante.setVisible(true);

    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed

        ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
        validarFormulario();
        if (buleano == false) {
            Integer dniInteger = Integer.parseInt(Dni.getText());
            Long TelefonoLong = Long.parseLong(Telefono.getText());
            Estudiante nuevoEstudiante = new Estudiante(NombreDeUsuario.getText(), Contrasena.getText(), Nombre.getText(), Apellido.getText(), dniInteger, TelefonoLong, Email.getText(), Curso.getText(), NombreYApellidoTutor.getText());
            boolean flag = servicioEstudiante.crearUsuario(nuevoEstudiante);

            if (flag) {
                JOptionPane.showMessageDialog(null, "Error Al Crear usuario");

            } else {
                JOptionPane.showMessageDialog(null, "usuario Creado Correctamente");
                Inicio inicio = new Inicio();
                inicio.setVisible(true);
                this.dispose();
            }

        }


    }//GEN-LAST:event_BotonAceptarActionPerformed

    private void ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaActionPerformed

    private void ContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContrasenaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JTextField Curso;
    private javax.swing.JTextField Dni;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel LabelColumna;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelIcono;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreDeUsuario;
    private javax.swing.JTextField NombreYApellidoTutor;
    private javax.swing.JSeparator SeparatorApellido;
    private javax.swing.JSeparator SeparatorContrasena;
    private javax.swing.JSeparator SeparatorCurso;
    private javax.swing.JSeparator SeparatorDni;
    private javax.swing.JSeparator SeparatorEmail;
    private javax.swing.JSeparator SeparatorNombre;
    private javax.swing.JSeparator SeparatorNombreDeUsuario;
    private javax.swing.JSeparator SeparatorNombreYApellidoTutor;
    private javax.swing.JSeparator SeparatorTelefono;
    private javax.swing.JTextField Telefono;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
