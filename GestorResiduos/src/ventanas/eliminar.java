/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import Clases.*;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author jdavid
 */
public class eliminar extends javax.swing.JPanel {

    /**
     * Creates new form eliminar
     */
    public eliminar() {
        initComponents();
        aceptar.setUI(new BasicButtonUI());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eliminar = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        atras = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 700));

        eliminar.setMinimumSize(new java.awt.Dimension(1200, 700));
        eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aceptar.setBackground(new java.awt.Color(98, 111, 71));
        aceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        aceptar.setForeground(new java.awt.Color(254, 250, 224));
        aceptar.setText("ACEPTAR");
        aceptar.setBorder(null);
        aceptar.setBorderPainted(false);
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        eliminar.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 180, 40));

        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        eliminar.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/throwing-trash.png"))); // NOI18N
        eliminar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 260, 260));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(98, 111, 71));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Nombre:");
        eliminar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 100, 50));

        jTextField1.setBackground(new java.awt.Color(215, 206, 158));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 188, 122), 1, true));
        eliminar.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 240, 40));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(98, 111, 71));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Indique el nombre del residuo que desea eliminar...");
        eliminar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 240, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 250, 224));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Eliminar Residuo");
        eliminar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 400, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        eliminar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 420, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 440, 50));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        eliminar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 950, 550));

        jLabel2.setBackground(new java.awt.Color(98, 111, 71));
        jLabel2.setForeground(new java.awt.Color(98, 111, 71));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        eliminar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ponerPanel(JPanel p) {
    // Establecer tamaño y ubicación para el panel a agregar
        eliminar.removeAll();

    // Establecer tamaño y ubicación para el panel a agregar
        p.setSize(eliminar.getWidth(), eliminar.getHeight()); // Ajusta al tamaño del panelDerecha
        p.setLocation(0, 0); // Establecer la ubicación en el panelDerecha

        // Agregar el panel al contenedor sin especificar layout
        eliminar.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1)); // Usando AbsoluteConstraints

        // Revalidar y repaint
        eliminar.revalidate();
        eliminar.repaint();
    }
    
    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        menuPanel p = new menuPanel();
        ponerPanel(p);
    }//GEN-LAST:event_atrasActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        menuPanel p = new menuPanel();
        ponerPanel(p);
    }//GEN-LAST:event_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JToggleButton atras;
    private javax.swing.JPanel eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
