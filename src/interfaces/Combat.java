/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import battlemonsters.Ataques;
import battlemonsters.Battle;
import battlemonsters.Metodos;
import battlemonsters.MetodosCrearBD;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import static lib.Op.*;


/**
 *
 * @author Diego
 */
public class Combat extends javax.swing.JFrame {

    /**
     * Creates new form Combat
     */
    Battle fight;
//    ArrayList<Ataques> myAttacks, rAttacks;
    
    public Combat() {
        initComponents();
        this.setLocationRelativeTo(null);
        fight = new Battle(intRandom20(),intRandom20());
        miMonstruo.setIcon(new ImageIcon(fight.getMyPic()));
        rMonstruo.setIcon(new ImageIcon(fight.getrPic()));
        Metodos.cargarMyAtaques();
        cargarBotones();
        Metodos.cargarRAtaques();
        marcadores();
    }
    
    private void cargarBotones(){
        ataque1.setText(Metodos.getAtaques(0).getNombre() + " - " + Metodos.getAtaques(0).getUsos());
        ataque2.setText(Metodos.getAtaques(1).getNombre() + " - " + Metodos.getAtaques(1).getUsos());
        ataque3.setText(Metodos.getAtaques(2).getNombre() + " - " + Metodos.getAtaques(2).getUsos());
        ataque4.setText(Metodos.getAtaques(3).getNombre() + " - " + Metodos.getAtaques(3).getUsos());
    }
    
    private void marcadores(){
        nombreMiMonstruo.setText(fight.getMyNMon() + "   " + fight.getMyLostHP() + "/" + fight.getMyHP());
        nombreRMonstruo.setText(fight.getrNMon() + "   " + fight.getrLostHP() + "/" + fight.getrHP());
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
        ataque1 = new javax.swing.JButton();
        ataque2 = new javax.swing.JButton();
        ataque3 = new javax.swing.JButton();
        ataque4 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        nombreRMonstruo = new javax.swing.JLabel();
        nombreMiMonstruo = new javax.swing.JLabel();
        rMonstruo = new javax.swing.JLabel();
        miMonstruo = new javax.swing.JLabel();
        eficaciaLabel = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("x");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        ataque1.setText("jButton2");
        ataque1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ataque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataque1ActionPerformed(evt);
            }
        });
        getContentPane().add(ataque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 290, 70));

        ataque2.setText("jButton3");
        ataque2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ataque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataque2ActionPerformed(evt);
            }
        });
        getContentPane().add(ataque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 290, 70));

        ataque3.setText("jButton4");
        ataque3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ataque3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataque3ActionPerformed(evt);
            }
        });
        getContentPane().add(ataque3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, 290, 70));

        ataque4.setText("jButton1");
        ataque4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ataque4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataque4ActionPerformed(evt);
            }
        });
        getContentPane().add(ataque4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 550, 290, 70));

        atras.setBackground(new java.awt.Color(0, 0, 0));
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Rendirse");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        nombreRMonstruo.setBackground(new java.awt.Color(255, 255, 255));
        nombreRMonstruo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreRMonstruo.setOpaque(true);
        getContentPane().add(nombreRMonstruo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 290, 70));

        nombreMiMonstruo.setBackground(new java.awt.Color(255, 255, 255));
        nombreMiMonstruo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreMiMonstruo.setOpaque(true);
        getContentPane().add(nombreMiMonstruo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 290, 70));

        rMonstruo.setMaximumSize(new java.awt.Dimension(350, 250));
        rMonstruo.setMinimumSize(new java.awt.Dimension(350, 250));
        rMonstruo.setPreferredSize(new java.awt.Dimension(350, 250));
        getContentPane().add(rMonstruo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, -1, -1));

        miMonstruo.setMaximumSize(new java.awt.Dimension(350, 250));
        miMonstruo.setMinimumSize(new java.awt.Dimension(350, 250));
        miMonstruo.setPreferredSize(new java.awt.Dimension(350, 250));
        getContentPane().add(miMonstruo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        eficaciaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eficiencias.png"))); // NOI18N
        getContentPane().add(eficaciaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 180));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Backgroung.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        MetodosCrearBD.desconectar();
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        new SelectOption().setVisible(true);
        this.setVisible(false);
        Metodos.sumarAlHistorial(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void ataque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataque1ActionPerformed
        fight.eficiencia(Metodos.getAtaques(0).getTipo(), Metodos.getRAtaques(0).getTipo());
        fight.fight(Metodos.getAtaques(0).getDaño(), Metodos.getRAtaques(unoDeCuatro()).getDaño());
        Metodos.getAtaques(0).setUsos(Metodos.getAtaques(0).getUsos()-1);
        if(Metodos.getAtaques(0).getUsos()==0){
            ataque1.setEnabled(false);
        }
        end();
        marcadores();
        cargarBotones();
    }//GEN-LAST:event_ataque1ActionPerformed

    private void ataque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataque2ActionPerformed
        fight.eficiencia(Metodos.getAtaques(1).getTipo(), Metodos.getRAtaques(1).getTipo());
        fight.fight(Metodos.getAtaques(1).getDaño(), Metodos.getRAtaques(unoDeCuatro()).getDaño());
        Metodos.getAtaques(1).setUsos(Metodos.getAtaques(1).getUsos()-1);
        if(Metodos.getAtaques(1).getUsos()==0){
            ataque2.setEnabled(false);
        }
        end();
        marcadores();
        cargarBotones();
    }//GEN-LAST:event_ataque2ActionPerformed

    private void ataque3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataque3ActionPerformed
        fight.eficiencia(Metodos.getAtaques(2).getTipo(), Metodos.getRAtaques(2).getTipo());
        fight.fight(Metodos.getAtaques(2).getDaño(), Metodos.getRAtaques(unoDeCuatro()).getDaño());
        Metodos.getAtaques(2).setUsos(Metodos.getAtaques(2).getUsos()-1);
        if(Metodos.getAtaques(2).getUsos()==0){
            ataque3.setEnabled(false);
        }
        end();
        marcadores();
        cargarBotones();
    }//GEN-LAST:event_ataque3ActionPerformed

    private void ataque4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataque4ActionPerformed
        fight.eficiencia(Metodos.getAtaques(3).getTipo(), Metodos.getRAtaques(3).getTipo());
        fight.fight(Metodos.getAtaques(3).getDaño(), Metodos.getRAtaques(unoDeCuatro()).getDaño());
        Metodos.getAtaques(3).setUsos(Metodos.getAtaques(3).getUsos()-1);
        if(Metodos.getAtaques(3).getUsos()==0){
            ataque4.setEnabled(false);
        }
        end();
        marcadores();
        cargarBotones();
    }//GEN-LAST:event_ataque4ActionPerformed

    private void end(){
        if(fight.isVictory()){
            this.setVisible(false);
            new EndBattle(true).setVisible(true);
        }
        if(fight.isDefeat()){
            this.setVisible(false);
            new EndBattle(false).setVisible(true);
        }
    }
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
            java.util.logging.Logger.getLogger(Combat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combat().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ataque1;
    private javax.swing.JButton ataque2;
    private javax.swing.JButton ataque3;
    private javax.swing.JButton ataque4;
    private javax.swing.JButton atras;
    private javax.swing.JLabel eficaciaLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel miMonstruo;
    private javax.swing.JLabel nombreMiMonstruo;
    private javax.swing.JLabel nombreRMonstruo;
    private javax.swing.JLabel rMonstruo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
