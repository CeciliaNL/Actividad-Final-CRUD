

package Interfaz;

import Entidades.Profesor;
import Servicios.ServicioProfesor;
import javax.swing.JOptionPane;

/**
 *
 * @author Cecilia
 */
public class RegistroUsuarioProfesor extends javax.swing.JFrame {
    boolean buleano = false;
   
    public RegistroUsuarioProfesor() {
        initComponents();
         this.setLocationRelativeTo(null);
        
        NombreDeUsuario.setBackground(new java.awt.Color(0, 0, 0, 1));
        TextPrompt textpromp = new TextPrompt("NOMBRE DE USUARIO", NombreDeUsuario);
        Contrasena.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("CONTRASEÑA", Contrasena);
        Nombre.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("NOMBRE", Nombre);
        Apellido.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("APELLIDO", Apellido);
        Cuil.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("CUIL", Cuil);
        Telefono.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("TELEFONO DE CONTACTO", Telefono);
              Email.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("EMAIL", Email);
        ProfesorPlantaOSuplente.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("PROFESOR DE PLANTA O SUPLENTE", ProfesorPlantaOSuplente);
        MateriaRegistro.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("MIS MATERIAS", MateriaRegistro);
        Curso.setBackground(new java.awt.Color(0, 0, 0, 1));
        textpromp = new TextPrompt("MI CURSO", Curso);
        
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

        } else if (Cuil.getText().contains(" ") || Cuil.getText().isEmpty()) {
            popUp("Cuil vacio O con espacios");
        } else if (Telefono.getText().contains(" ") || Telefono.getText().isEmpty()) {
            popUp(" Telefono Vacio o con espacios");
        } else if (Email.getText().contains(" ")|| Email.getText().isEmpty()) {
            popUp("Email vacio o con espacios");
        } else if (Curso.getText().contains(" ") || Curso.getText().isEmpty()) {
            popUp("Email vacio o con espacios");
        } else if (MateriaRegistro.getText().isEmpty() || MateriaRegistro.getText().contains(" ")) {
            popUp("Materia Vacio");
        } else if (validarNumero(Telefono.getText() )){
            popUp("Telefono ingresar numeros");
        } else if (validarNumero(Cuil.getText())){
            popUp("Cuil infgresar numeros");
        } else if (ProfesorPlantaOSuplente.getText().isEmpty() || ProfesorPlantaOSuplente.getText().contains(" ")){
            popUp("Ingresar Planta o Suplente");
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
        Contrasena = new javax.swing.JTextField();
        SeparatorNombre = new javax.swing.JSeparator();
        Nombre = new javax.swing.JTextField();
        SeparatorApellido = new javax.swing.JSeparator();
        Apellido = new javax.swing.JTextField();
        SeparatorCuil = new javax.swing.JSeparator();
        Cuil = new javax.swing.JTextField();
        SeparatorTelefono = new javax.swing.JSeparator();
        Telefono = new javax.swing.JTextField();
        SeparatorEmail = new javax.swing.JSeparator();
        Email = new javax.swing.JTextField();
        SeparatorProfesorPlantaSuplente = new javax.swing.JSeparator();
        ProfesorPlantaOSuplente = new javax.swing.JTextField();
        SeparatorMaterias = new javax.swing.JSeparator();
        MateriaRegistro = new javax.swing.JTextField();
        SeparatorCurso = new javax.swing.JSeparator();
        Curso = new javax.swing.JTextField();
        LabelColumna = new javax.swing.JLabel();
        BotonAceptar = new javax.swing.JButton();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        LabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/avatar.png"))); // NOI18N
        jPanel1.add(LabelIcono);
        LabelIcono.setBounds(210, 170, 100, 100);

        LabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/RegistroUsuarioProfesor.png"))); // NOI18N
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

        Contrasena.setBackground(new java.awt.Color(255, 255, 255));
        Contrasena.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        Contrasena.setForeground(new java.awt.Color(153, 153, 153));
        Contrasena.setBorder(null);
        Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(Contrasena);
        Contrasena.setBounds(110, 380, 310, 20);
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
        jPanel1.add(SeparatorCuil);
        SeparatorCuil.setBounds(110, 580, 310, 10);

        Cuil.setBackground(new java.awt.Color(255, 255, 255));
        Cuil.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        Cuil.setForeground(new java.awt.Color(153, 153, 153));
        Cuil.setBorder(null);
        Cuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuilActionPerformed(evt);
            }
        });
        jPanel1.add(Cuil);
        Cuil.setBounds(110, 560, 310, 20);
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
        jPanel1.add(SeparatorProfesorPlantaSuplente);
        SeparatorProfesorPlantaSuplente.setBounds(590, 460, 310, 10);

        ProfesorPlantaOSuplente.setBackground(new java.awt.Color(255, 255, 255));
        ProfesorPlantaOSuplente.setBorder(null);
        ProfesorPlantaOSuplente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesorPlantaOSuplenteActionPerformed(evt);
            }
        });
        jPanel1.add(ProfesorPlantaOSuplente);
        ProfesorPlantaOSuplente.setBounds(590, 440, 310, 20);
        jPanel1.add(SeparatorMaterias);
        SeparatorMaterias.setBounds(590, 520, 310, 10);

        MateriaRegistro.setBackground(new java.awt.Color(255, 255, 255));
        MateriaRegistro.setBorder(null);
        MateriaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriaRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(MateriaRegistro);
        MateriaRegistro.setBounds(590, 500, 310, 20);
        jPanel1.add(SeparatorCurso);
        SeparatorCurso.setBounds(590, 580, 310, 10);

        Curso.setBackground(new java.awt.Color(255, 255, 255));
        Curso.setBorder(null);
        Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CursoActionPerformed(evt);
            }
        });
        jPanel1.add(Curso);
        Curso.setBounds(590, 560, 310, 20);

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
        BotonAceptar.setBounds(790, 630, 120, 40);

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

    private void CuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuilActionPerformed

    }//GEN-LAST:event_CuilActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
       
    }//GEN-LAST:event_ApellidoActionPerformed

    private void ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaActionPerformed
      
    }//GEN-LAST:event_ContrasenaActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
    
    }//GEN-LAST:event_NombreActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed

    }//GEN-LAST:event_TelefonoActionPerformed

    private void NombreDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreDeUsuarioActionPerformed
        
    }//GEN-LAST:event_NombreDeUsuarioActionPerformed

    private void MateriaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriaRegistroActionPerformed
   
    }//GEN-LAST:event_MateriaRegistroActionPerformed

    private void CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CursoActionPerformed
  
    }//GEN-LAST:event_CursoActionPerformed

    private void ProfesorPlantaOSuplenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesorPlantaOSuplenteActionPerformed

    }//GEN-LAST:event_ProfesorPlantaOSuplenteActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
         
          LoginProfesor loginProfesor = new LoginProfesor();
          loginProfesor.setSize(1000,800);
          loginProfesor.setLocationRelativeTo(null);
       this.dispose();
       loginProfesor.setVisible(true);
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        ServicioProfesor servicioProfesor = new ServicioProfesor();
        validarFormulario();
        if (buleano == false) {
            Long cuilLong = Long.valueOf(Cuil.getText());
            Long TelefonoLong = Long.valueOf(Telefono.getText());
            Profesor nuevoProfesor = new Profesor(NombreDeUsuario.getText(), Contrasena.getText(), Nombre.getText(), Apellido.getText(), cuilLong, TelefonoLong, Email.getText(),ProfesorPlantaOSuplente.getText(), MateriaRegistro.getText(),Curso.getText());
            boolean flag = servicioProfesor.crearUsuario(nuevoProfesor);

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

    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField Contrasena;
    private javax.swing.JTextField Cuil;
    private javax.swing.JTextField Curso;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel LabelColumna;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelIcono;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField MateriaRegistro;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreDeUsuario;
    private javax.swing.JTextField ProfesorPlantaOSuplente;
    private javax.swing.JSeparator SeparatorApellido;
    private javax.swing.JSeparator SeparatorContrasena;
    private javax.swing.JSeparator SeparatorCuil;
    private javax.swing.JSeparator SeparatorCurso;
    private javax.swing.JSeparator SeparatorEmail;
    private javax.swing.JSeparator SeparatorMaterias;
    private javax.swing.JSeparator SeparatorNombre;
    private javax.swing.JSeparator SeparatorNombreDeUsuario;
    private javax.swing.JSeparator SeparatorProfesorPlantaSuplente;
    private javax.swing.JSeparator SeparatorTelefono;
    private javax.swing.JTextField Telefono;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
