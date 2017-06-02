/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Diego
 */
public class SelectOption extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public SelectOption() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        partida1 = new javax.swing.JButton();
        partida2 = new javax.swing.JButton();
        partida3 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("x");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        partida1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        partida1.setText("Combate ");
        partida1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));
        partida1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        partida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partida1ActionPerformed(evt);
            }
        });
        getContentPane().add(partida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 580, 70));

        partida2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        partida2.setText("Monsterpedia");
        partida2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));
        partida2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(partida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 580, 70));

        partida3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        partida3.setText("Historial del jugador");
        partida3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));
        partida3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(partida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 580, 70));

        atras.setBackground(new java.awt.Color(0, 0, 0));
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("<|=");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuBackgroung.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void partida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partida1ActionPerformed
        new Combat().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_partida1ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(SelectOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton partida1;
    private javax.swing.JButton partida2;
    private javax.swing.JButton partida3;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
