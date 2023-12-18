
package Interfaz.Estudiante;

/**
 *
 * @author Cecilia
 */
public class Contacto extends javax.swing.JPanel {

   
    public Contacto() {
        initComponents();
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelMapaUbicacion = new javax.swing.JLabel();
        LabelFondoContacto = new javax.swing.JLabel();
        FondoBienvenido = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(null);

        LabelMapaUbicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/Mapa.jpg"))); // NOI18N
        LabelMapaUbicacion.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel1.add(LabelMapaUbicacion);
        LabelMapaUbicacion.setBounds(60, 430, 616, 330);

        LabelFondoContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/Contacto.jpg"))); // NOI18N
        jPanel1.add(LabelFondoContacto);
        LabelFondoContacto.setBounds(50, 70, 630, 300);

        FondoBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/BienvenidoMenu.jpg"))); // NOI18N
        jPanel1.add(FondoBienvenido);
        FondoBienvenido.setBounds(0, 0, 750, 800);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(90, 150, 0, 2);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoBienvenido;
    private javax.swing.JLabel LabelFondoContacto;
    private javax.swing.JLabel LabelMapaUbicacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
