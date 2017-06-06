/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import battlemonsters.Metodos;
import battlemonsters.MetodosCrearBD;

/**
 *
 * @author Diego
 */
public class Monsterpedia extends javax.swing.JFrame {

    /**
     * Creates new form Monsterpedia
     */
    public Monsterpedia() {
        initComponents();
        Metodos.cargarMonsterpedia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagenLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        datos1Label = new javax.swing.JLabel();
        datos2Label = new javax.swing.JLabel();
        datos3Label = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMonstruos = new javax.swing.JTable();
        fondoLabel = new javax.swing.JLabel();
        datosText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imagenLabel.setMaximumSize(new java.awt.Dimension(350, 250));
        imagenLabel.setMinimumSize(new java.awt.Dimension(350, 250));
        imagenLabel.setPreferredSize(new java.awt.Dimension(350, 250));
        getContentPane().add(imagenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 300, 240));

        nombreLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 340, 30));
        getContentPane().add(datos1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 80, 20));

        datos2Label.setText("jLabel4");
        getContentPane().add(datos2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        datos3Label.setText("jLabel5");
        getContentPane().add(datos3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("x");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, -1, -1));

        tablaMonstruos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre"
            }
        ));
        tablaMonstruos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tablaMonstruos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        fondoLabel.setText("jLabel1");
        getContentPane().add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        datosText.setEditable(false);
        getContentPane().add(datosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 340, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        MetodosCrearBD.desconectar();
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Monsterpedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monsterpedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monsterpedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monsterpedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monsterpedia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datos1Label;
    private javax.swing.JLabel datos2Label;
    private javax.swing.JLabel datos3Label;
    public static javax.swing.JTextField datosText;
    private javax.swing.JLabel fondoLabel;
    public static javax.swing.JLabel imagenLabel;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel nombreLabel;
    private javax.swing.JButton salir;
    public static javax.swing.JTable tablaMonstruos;
    // End of variables declaration//GEN-END:variables
}
