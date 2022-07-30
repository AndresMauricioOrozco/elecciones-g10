/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author davidperezarias
 */
public class FrameMenu extends javax.swing.JFrame {

    FrameGestorCandidato gestorCandidato;
    FrameGestorVotante gestorVotante;
    FrameElecciones gestorElecciones;
    FrameVotar votacion;

    public FrameMenu() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setFocusable(false);
        setImageLabel(labelImagen, "src/main/java/Vistas/Imagenes/imagenInicio.png");

        this.gestorCandidato = new FrameGestorCandidato();
        this.gestorVotante = new FrameGestorVotante();
        this.gestorElecciones = new FrameElecciones();
        this.votacion = new FrameVotar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonGestionarCandidatos = new javax.swing.JButton();
        botonGestionarVotantes = new javax.swing.JButton();
        botonVotar = new javax.swing.JButton();
        botonGestionElecciones = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        labelImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("InaiMathi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 135, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elecciones");

        botonGestionarCandidatos.setBackground(new java.awt.Color(153, 204, 255));
        botonGestionarCandidatos.setText("Gestionar candidato");
        botonGestionarCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionarCandidatosActionPerformed(evt);
            }
        });

        botonGestionarVotantes.setBackground(new java.awt.Color(153, 204, 255));
        botonGestionarVotantes.setText("Registro de votante");
        botonGestionarVotantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionarVotantesActionPerformed(evt);
            }
        });

        botonVotar.setBackground(new java.awt.Color(153, 204, 255));
        botonVotar.setText("Votar");
        botonVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVotarActionPerformed(evt);
            }
        });

        botonGestionElecciones.setBackground(new java.awt.Color(153, 204, 255));
        botonGestionElecciones.setText("Gestionar elecciones");
        botonGestionElecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionEleccionesActionPerformed(evt);
            }
        });

        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonVotar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonGestionarVotantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonGestionarCandidatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonGestionElecciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonGestionarCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(botonGestionarVotantes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(botonGestionElecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(botonVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGestionarCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionarCandidatosActionPerformed
        this.setVisible(false);
        gestorCandidato.setVisible(true);      
    }//GEN-LAST:event_botonGestionarCandidatosActionPerformed

    private void botonGestionarVotantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionarVotantesActionPerformed
        this.setVisible(false);
        gestorVotante.setVisible(true);
    }//GEN-LAST:event_botonGestionarVotantesActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonGestionEleccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionEleccionesActionPerformed
        this.setVisible(false);
        gestorElecciones.setVisible(true);
    }//GEN-LAST:event_botonGestionEleccionesActionPerformed

    private void botonVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVotarActionPerformed
        this.setVisible(false);
        votacion.setVisible(true);
    }//GEN-LAST:event_botonVotarActionPerformed

    public void setImageLabel(JLabel jlabel, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(jlabel.getWidth(), jlabel.getHeight(), Image.SCALE_DEFAULT));
        jlabel.setIcon(icon);
        this.repaint();
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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGestionElecciones;
    private javax.swing.JButton botonGestionarCandidatos;
    private javax.swing.JButton botonGestionarVotantes;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVotar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelImagen;
    // End of variables declaration//GEN-END:variables
}
