package Interfaz;



/**
 *
 * @author Cecilia
 */
public class Inicio extends javax.swing.JFrame {

    
    public Inicio() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonProfesor = new javax.swing.JButton();
        BotonEstudiante = new javax.swing.JButton();
        IconoIdraInicio = new javax.swing.JLabel();
        IconoProfesor = new javax.swing.JLabel();
        IconoEstudiante = new javax.swing.JLabel();
        BotonCerrar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel1.setLayout(null);

        BotonProfesor.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        BotonProfesor.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 24)); // NOI18N
        BotonProfesor.setForeground(new java.awt.Color(255, 255, 255));
        BotonProfesor.setText("PROFESOR");
        BotonProfesor.setBorder(null);
        BotonProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProfesorActionPerformed(evt);
            }
        });
        jPanel1.add(BotonProfesor);
        BotonProfesor.setBounds(220, 650, 160, 46);

        BotonEstudiante.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        BotonEstudiante.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 24)); // NOI18N
        BotonEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        BotonEstudiante.setText("ESTUDIANTE");
        BotonEstudiante.setBorder(null);
        BotonEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEstudiante);
        BotonEstudiante.setBounds(650, 650, 160, 46);

        IconoIdraInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IdraLogo.png"))); // NOI18N
        IconoIdraInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel1.add(IconoIdraInicio);
        IconoIdraInicio.setBounds(250, 60, 502, 240);

        IconoProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Profesor.png"))); // NOI18N
        jPanel1.add(IconoProfesor);
        IconoProfesor.setBounds(190, 400, 250, 240);

        IconoEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ESTUDIANTE.png"))); // NOI18N
        jPanel1.add(IconoEstudiante);
        IconoEstudiante.setBounds(620, 440, 200, 190);

        BotonCerrar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        BotonCerrar.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        BotonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Boton-cerrar-Azul.png"))); // NOI18N
        BotonCerrar.setBorder(null);
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCerrar);
        BotonCerrar.setBounds(930, 10, 32, 32);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/REGISTRO.jpg"))); // NOI18N
        jPanel1.add(Fondo);
        Fondo.setBounds(0, 0, 1000, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProfesorActionPerformed
        LoginProfesor loginProfesor = new LoginProfesor();
        loginProfesor.setVisible(true);
        loginProfesor.setSize(1000,800);
        this.dispose();
    }//GEN-LAST:event_BotonProfesorActionPerformed

    private void BotonEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstudianteActionPerformed
        LoginEstudiante loginEstudiante = new LoginEstudiante();
        loginEstudiante.setVisible(true);
        loginEstudiante.setSize(1000,800);
        loginEstudiante.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BotonEstudianteActionPerformed

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
      this.dispose();
    }//GEN-LAST:event_BotonCerrarActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonEstudiante;
    private javax.swing.JButton BotonProfesor;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel IconoEstudiante;
    private javax.swing.JLabel IconoIdraInicio;
    private javax.swing.JLabel IconoProfesor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
