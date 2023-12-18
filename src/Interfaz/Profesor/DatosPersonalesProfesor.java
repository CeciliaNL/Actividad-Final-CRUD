
package Interfaz.Profesor;

import Entidades.Profesor;


/**
 *
 * @author Cecilia
 */
public class DatosPersonalesProfesor extends javax.swing.JPanel {
    
  

   
    public DatosPersonalesProfesor() {
        initComponents();
        

               
        
        
    }
    
    public void rellenarDatos(Profesor profesor){
        NombreLabel.setText(profesor.getNombre().toUpperCase());
        ApellidoLabel.setText(profesor.getApellido().toUpperCase());
        CuilLabel.setText(profesor.getCuil().toString().toUpperCase());
        TelefonoLabel.setText(profesor.getTelefono().toString().toUpperCase());
        EmailLabel.setText(profesor.getEmail());
        PlantaOSuplente.setText(profesor.getPlantaSuplente().toUpperCase());
        Materias.setText(profesor.getMaterias().toUpperCase());
        CursoLabel.setText(profesor.getCurso().toUpperCase());
    }

  

    
    
    
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNombre1 = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        SeparadorNombre = new javax.swing.JSeparator();
        LabelApellido1 = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        SeparatorApellido = new javax.swing.JSeparator();
        LabelCuil1 = new javax.swing.JLabel();
        CuilLabel = new javax.swing.JLabel();
        SeparatorCuil = new javax.swing.JSeparator();
        LabelTelefono1 = new javax.swing.JLabel();
        TelefonoLabel = new javax.swing.JLabel();
        SeparatorTelefono = new javax.swing.JSeparator();
        LabelEmail1 = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        SeparatorEmail = new javax.swing.JSeparator();
        LabelProfesor1 = new javax.swing.JLabel();
        PlantaOSuplente = new javax.swing.JLabel();
        SeparatorProfesor = new javax.swing.JSeparator();
        LabelCurso1 = new javax.swing.JLabel();
        CursoLabel = new javax.swing.JLabel();
        SeparatorCurso = new javax.swing.JSeparator();
        LabelMaterias1 = new javax.swing.JLabel();
        Materias = new javax.swing.JLabel();
        SeparatorMaterias = new javax.swing.JSeparator();
        FondoBienvenido1 = new javax.swing.JLabel();

        setLayout(null);

        LabelNombre1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelNombre1.setForeground(new java.awt.Color(0, 0, 102));
        LabelNombre1.setText("NOMBRE:");
        add(LabelNombre1);
        LabelNombre1.setBounds(100, 100, 160, 30);

        NombreLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(0, 0, 102));
        add(NombreLabel);
        NombreLabel.setBounds(180, 100, 350, 30);
        add(SeparadorNombre);
        SeparadorNombre.setBounds(100, 130, 430, 20);

        LabelApellido1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelApellido1.setForeground(new java.awt.Color(0, 0, 102));
        LabelApellido1.setText("APELLIDO:");
        add(LabelApellido1);
        LabelApellido1.setBounds(100, 180, 120, 30);

        ApellidoLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ApellidoLabel.setForeground(new java.awt.Color(0, 0, 102));
        add(ApellidoLabel);
        ApellidoLabel.setBounds(190, 180, 340, 30);
        add(SeparatorApellido);
        SeparatorApellido.setBounds(100, 210, 430, 10);

        LabelCuil1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelCuil1.setForeground(new java.awt.Color(0, 0, 102));
        LabelCuil1.setText("CUIL:");
        add(LabelCuil1);
        LabelCuil1.setBounds(100, 260, 110, 30);

        CuilLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        CuilLabel.setForeground(new java.awt.Color(0, 0, 102));
        add(CuilLabel);
        CuilLabel.setBounds(160, 260, 350, 30);
        add(SeparatorCuil);
        SeparatorCuil.setBounds(100, 290, 430, 20);

        LabelTelefono1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelTelefono1.setForeground(new java.awt.Color(0, 0, 102));
        LabelTelefono1.setText("TELEFONO:");
        add(LabelTelefono1);
        LabelTelefono1.setBounds(100, 340, 110, 30);

        TelefonoLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        TelefonoLabel.setForeground(new java.awt.Color(0, 0, 102));
        add(TelefonoLabel);
        TelefonoLabel.setBounds(190, 340, 340, 30);
        add(SeparatorTelefono);
        SeparatorTelefono.setBounds(100, 370, 430, 10);

        LabelEmail1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelEmail1.setForeground(new java.awt.Color(0, 0, 102));
        LabelEmail1.setText("EMAIL:");
        add(LabelEmail1);
        LabelEmail1.setBounds(100, 420, 110, 30);

        EmailLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(0, 0, 102));
        add(EmailLabel);
        EmailLabel.setBounds(160, 420, 370, 30);
        add(SeparatorEmail);
        SeparatorEmail.setBounds(100, 450, 430, 20);

        LabelProfesor1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelProfesor1.setForeground(new java.awt.Color(0, 0, 102));
        LabelProfesor1.setText("PROFESOR:");
        add(LabelProfesor1);
        LabelProfesor1.setBounds(100, 500, 110, 30);

        PlantaOSuplente.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        PlantaOSuplente.setForeground(new java.awt.Color(0, 0, 102));
        add(PlantaOSuplente);
        PlantaOSuplente.setBounds(190, 500, 330, 30);
        add(SeparatorProfesor);
        SeparatorProfesor.setBounds(100, 530, 430, 10);

        LabelCurso1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelCurso1.setForeground(new java.awt.Color(0, 0, 102));
        LabelCurso1.setText("CURSO:");
        LabelCurso1.setToolTipText("");
        add(LabelCurso1);
        LabelCurso1.setBounds(100, 580, 110, 30);

        CursoLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        CursoLabel.setForeground(new java.awt.Color(0, 0, 102));
        add(CursoLabel);
        CursoLabel.setBounds(180, 580, 350, 30);
        add(SeparatorCurso);
        SeparatorCurso.setBounds(100, 610, 430, 10);

        LabelMaterias1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelMaterias1.setForeground(new java.awt.Color(0, 0, 102));
        LabelMaterias1.setText("MATERIAS:");
        add(LabelMaterias1);
        LabelMaterias1.setBounds(100, 650, 100, 30);

        Materias.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Materias.setForeground(new java.awt.Color(0, 0, 102));
        add(Materias);
        Materias.setBounds(210, 646, 320, 30);
        add(SeparatorMaterias);
        SeparatorMaterias.setBounds(100, 680, 430, 10);

        FondoBienvenido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/BienvenidoMenu.jpg"))); // NOI18N
        add(FondoBienvenido1);
        FondoBienvenido1.setBounds(0, 0, 750, 800);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JLabel CuilLabel;
    private javax.swing.JLabel CursoLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FondoBienvenido1;
    private javax.swing.JLabel LabelApellido1;
    private javax.swing.JLabel LabelCuil1;
    private javax.swing.JLabel LabelCurso1;
    private javax.swing.JLabel LabelEmail1;
    private javax.swing.JLabel LabelMaterias1;
    private javax.swing.JLabel LabelNombre1;
    private javax.swing.JLabel LabelProfesor1;
    private javax.swing.JLabel LabelTelefono1;
    private javax.swing.JLabel Materias;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JLabel PlantaOSuplente;
    private javax.swing.JSeparator SeparadorNombre;
    private javax.swing.JSeparator SeparatorApellido;
    private javax.swing.JSeparator SeparatorCuil;
    private javax.swing.JSeparator SeparatorCurso;
    private javax.swing.JSeparator SeparatorEmail;
    private javax.swing.JSeparator SeparatorMaterias;
    private javax.swing.JSeparator SeparatorProfesor;
    private javax.swing.JSeparator SeparatorTelefono;
    private javax.swing.JLabel TelefonoLabel;
    // End of variables declaration//GEN-END:variables
}
