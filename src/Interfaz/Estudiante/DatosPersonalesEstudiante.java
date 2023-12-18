
package Interfaz.Estudiante;

import Entidades.Estudiante;


/**
 *
 * @author Cecilia
 */
public class DatosPersonalesEstudiante extends javax.swing.JPanel {
    
  

    /**
     * Creates new form MenuDeBienvenidaPanel
     */
    public DatosPersonalesEstudiante() {
        initComponents();
        

               
        
        
    }
    
    public void rellenarDatos(Estudiante estudiante){
        txtNombre.setText(estudiante.getNombre().toUpperCase());
        txtApellido.setText(estudiante.getApellido().toUpperCase());
        txtDni.setText(Integer.toString(estudiante.getDni()).toUpperCase());
        txtTelefono.setText(Long.toString(estudiante.getTelefono()).toUpperCase());
        txtEmail.setText(estudiante.getEmail());
        txtCurso.setText(estudiante.getCurso().toUpperCase());
        txttutor.setText(estudiante.getNombreApellidoTutor().toUpperCase());
    }

  

    
    
    
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Separador1 = new javax.swing.JSeparator();
        Separador = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        Separador3 = new javax.swing.JSeparator();
        Separador4 = new javax.swing.JSeparator();
        Separador5 = new javax.swing.JSeparator();
        Separador6 = new javax.swing.JSeparator();
        NombreEstudiante = new javax.swing.JLabel();
        ApellidoEstudiante = new javax.swing.JLabel();
        DniEstudiante = new javax.swing.JLabel();
        TelefonoEstudiante = new javax.swing.JLabel();
        EmailEstudiante = new javax.swing.JLabel();
        CursoEstudiante = new javax.swing.JLabel();
        TutorEstudiante = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        txtDni = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtCurso = new javax.swing.JLabel();
        txttutor = new javax.swing.JLabel();
        FondoBienvenido = new javax.swing.JLabel();

        setLayout(null);
        add(Separador1);
        Separador1.setBounds(100, 130, 430, 20);
        add(Separador);
        Separador.setBounds(100, 210, 430, 10);
        add(Separador2);
        Separador2.setBounds(100, 290, 430, 20);
        add(Separador3);
        Separador3.setBounds(100, 370, 430, 10);
        add(Separador4);
        Separador4.setBounds(100, 450, 430, 20);
        add(Separador5);
        Separador5.setBounds(100, 530, 430, 10);
        add(Separador6);
        Separador6.setBounds(100, 610, 430, 10);

        NombreEstudiante.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        NombreEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        NombreEstudiante.setText("NOMBRE:");
        add(NombreEstudiante);
        NombreEstudiante.setBounds(100, 100, 110, 30);

        ApellidoEstudiante.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ApellidoEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        ApellidoEstudiante.setText("APELLIDO:");
        add(ApellidoEstudiante);
        ApellidoEstudiante.setBounds(100, 180, 110, 30);

        DniEstudiante.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        DniEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        DniEstudiante.setText("DNI:");
        add(DniEstudiante);
        DniEstudiante.setBounds(100, 260, 110, 30);

        TelefonoEstudiante.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        TelefonoEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        TelefonoEstudiante.setText("TELEFONO:");
        add(TelefonoEstudiante);
        TelefonoEstudiante.setBounds(100, 340, 110, 30);

        EmailEstudiante.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        EmailEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        EmailEstudiante.setText("EMAIL:");
        add(EmailEstudiante);
        EmailEstudiante.setBounds(100, 420, 110, 30);

        CursoEstudiante.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        CursoEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        CursoEstudiante.setText("CURSO:");
        add(CursoEstudiante);
        CursoEstudiante.setBounds(100, 500, 110, 30);

        TutorEstudiante.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        TutorEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        TutorEstudiante.setText("TUTOR:");
        add(TutorEstudiante);
        TutorEstudiante.setBounds(100, 580, 110, 30);

        txtNombre.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 102));
        add(txtNombre);
        txtNombre.setBounds(190, 90, 350, 50);

        txtApellido.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 102));
        add(txtApellido);
        txtApellido.setBounds(210, 170, 350, 50);

        txtDni.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 102));
        add(txtDni);
        txtDni.setBounds(160, 240, 350, 70);

        txtTelefono.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 102));
        add(txtTelefono);
        txtTelefono.setBounds(210, 330, 350, 50);

        txtEmail.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 102));
        add(txtEmail);
        txtEmail.setBounds(180, 410, 370, 50);

        txtCurso.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtCurso.setForeground(new java.awt.Color(0, 0, 102));
        add(txtCurso);
        txtCurso.setBounds(190, 500, 350, 30);

        txttutor.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txttutor.setForeground(new java.awt.Color(0, 0, 102));
        add(txttutor);
        txttutor.setBounds(180, 570, 350, 50);

        FondoBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/BienvenidoMenu.jpg"))); // NOI18N
        add(FondoBienvenido);
        FondoBienvenido.setBounds(0, 0, 750, 800);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoEstudiante;
    private javax.swing.JLabel CursoEstudiante;
    private javax.swing.JLabel DniEstudiante;
    private javax.swing.JLabel EmailEstudiante;
    private javax.swing.JLabel FondoBienvenido;
    private javax.swing.JLabel NombreEstudiante;
    private javax.swing.JSeparator Separador;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JSeparator Separador3;
    private javax.swing.JSeparator Separador4;
    private javax.swing.JSeparator Separador5;
    private javax.swing.JSeparator Separador6;
    private javax.swing.JLabel TelefonoEstudiante;
    private javax.swing.JLabel TutorEstudiante;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtCurso;
    private javax.swing.JLabel txtDni;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTelefono;
    private javax.swing.JLabel txttutor;
    // End of variables declaration//GEN-END:variables
}
