
package Interfaz.Profesor;



/**
 *
 * @author Cecilia
 */
public class BienvenidaProfe extends javax.swing.JPanel {

    public BienvenidaProfe() {
        initComponents();
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenidaPanel = new javax.swing.JPanel();
        LabelBienvenido = new javax.swing.JLabel();
        Video = new javax.swing.JLabel();
        FondoBienvenido = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        bienvenidaPanel.setLayout(null);

        LabelBienvenido.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        LabelBienvenido.setForeground(new java.awt.Color(0, 0, 102));
        LabelBienvenido.setText("BIENVENIDO/A!!!");
        bienvenidaPanel.add(LabelBienvenido);
        LabelBienvenido.setBounds(20, 120, 480, 80);

        Video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Video/video-inicio.gif"))); // NOI18N
        bienvenidaPanel.add(Video);
        Video.setBounds(30, 280, 690, 388);

        FondoBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/BienvenidoMenu.jpg"))); // NOI18N
        bienvenidaPanel.add(FondoBienvenido);
        FondoBienvenido.setBounds(0, 0, 750, 800);

        add(bienvenidaPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoBienvenido;
    private javax.swing.JLabel LabelBienvenido;
    private javax.swing.JLabel Video;
    private javax.swing.JPanel bienvenidaPanel;
    // End of variables declaration//GEN-END:variables
}
