package Interfaz;

/**
 *
 * @author Cecilia
 */
public class PopUp extends javax.swing.JFrame {

    public PopUp() {
        initComponents();

    }

    public void textoPopUp(String texto) {
        TextoPopUp.setText(texto);
        TextoPopUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextoPopUp = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        fondoPopUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        TextoPopUp.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        TextoPopUp.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TextoPopUp);
        TextoPopUp.setBounds(40, 50, 280, 38);

        botonAceptar.setBackground(new java.awt.Color(204, 204, 204));
        botonAceptar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        botonAceptar.setForeground(new java.awt.Color(0, 0, 0));
        botonAceptar.setText("ACEPTAR");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar);
        botonAceptar.setBounds(128, 107, 108, 37);

        fondoPopUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/FondoPopUp.jpg"))); // NOI18N
        fondoPopUp.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 10, 3, new java.awt.Color(0, 0, 0)));
        jPanel1.add(fondoPopUp);
        fondoPopUp.setBounds(0, 0, 380, 190);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 379, 185);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoPopUp;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JLabel fondoPopUp;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
